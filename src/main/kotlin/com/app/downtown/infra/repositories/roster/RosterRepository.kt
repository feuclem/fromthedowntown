package com.app.downtown.infra.repositories.roster

import com.app.downtown.domain.Cache
import com.app.downtown.domain.team.Team
import com.app.downtown.domain.roster.Roster
import com.app.downtown.domain.roster.RosterPossibilities
import com.app.downtown.domain.user.UserId
import com.app.downtown.infra.repositories.player.PlayerRepository
import org.springframework.stereotype.Repository

@Repository
class RosterRepository(
    private val playerRepository: PlayerRepository,
    private val cache: Cache
) {

    companion object {
        const val CACHE_KEY = "ROSTER_LIST_"
    }

    fun createRoster(userId: UserId) = if (cache.get(generateRosterCacheKeyIdentify(userId)) == null) {
        val roster = Roster()
        cache.set(generateRosterCacheKeyIdentify(userId), roster)
        roster
    } else {
        cache.get(generateRosterCacheKeyIdentify(userId), Roster::class.java)!!
    }

    fun addTitularPlayerToRoster(userId: UserId, firstName: String, lastName: String, team: Team): RosterPossibilities {
        val roster = cache.get(generateRosterCacheKeyIdentify(userId), Roster::class.java)!!
        val player = playerRepository.getAllEndPlayersForAllTeams().searchByNameAndTeam(
            firstName = firstName,
            lastName = lastName,
            team = team
        )!!
        return when(val rosterPossibility = roster.addTitularPlayer(player)) {
            RosterPossibilities.OutOfCredit -> rosterPossibility
            RosterPossibilities.TitularPlayerNotAddableInRoster -> rosterPossibility
            is RosterPossibilities.RosterUpdated -> {
                cache.set(generateRosterCacheKeyIdentify(userId), rosterPossibility.updatedRoster)
                rosterPossibility
            }
        }
    }

    fun removeTitularPlayerToRoster(userId: UserId, firstName: String, lastName: String, team: Team): Roster {
        var roster = cache.get(generateRosterCacheKeyIdentify(userId), Roster::class.java) ?: createRoster(userId)
        val player = playerRepository.getAllEndPlayersForAllTeams().searchByNameAndTeam(
            firstName = firstName,
            lastName = lastName,
            team = team
        )!!
        roster = roster.removeTitularPlayer(player)
        cache.set(generateRosterCacheKeyIdentify(userId), roster)
        return roster
    }

    private fun generateRosterCacheKeyIdentify(userId: UserId) = CACHE_KEY + userId.value
}