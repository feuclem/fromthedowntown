package com.app.downtown.infra.repositories.roster

import com.app.downtown.domain.Cache
import com.app.downtown.domain.team.Team
import com.app.downtown.domain.roster.Roster
import com.app.downtown.domain.user.UserId
import com.app.downtown.infra.repositories.player.PlayerRepository
import org.springframework.stereotype.Repository

@Repository
class RosterRepository(
    private val cache: Cache,
    private val playerRepository: PlayerRepository
) {

    companion object {
        const val CACHE_KEY = "ROSTER_LIST_"
    }

    fun createRoster(userId: UserId) {
        if(cache.get(generateRosterCacheKeyIdentify(userId)) == null) {
            cache.set(generateRosterCacheKeyIdentify(userId), Roster())
        }
    }

    fun addTitularPlayerToRoster(userId: UserId, firstName: String, lastName: String, team: Team): Roster {
        val roster = cache.get(generateRosterCacheKeyIdentify(userId), Roster::class.java)!!
        val player = playerRepository.getAllEndPlayersForAllTeams().searchByNameAndTeam(
            firstName = firstName,
            lastName = lastName,
            team = team
        )!!
        roster.addSubstitutePlayer(player)
        cache.set(generateRosterCacheKeyIdentify(userId), roster)
        return roster
    }

    fun removeTitularPlayerToRoster(userId: UserId, firstName: String, lastName: String, team: Team): Roster {
        val roster = cache.get(generateRosterCacheKeyIdentify(userId), Roster::class.java)!!
        val player = playerRepository.getAllEndPlayersForAllTeams().searchByNameAndTeam(
            firstName = firstName,
            lastName = lastName,
            team = team
        )!!
        roster.removeTitularPlayer(player)
        cache.set(generateRosterCacheKeyIdentify(userId), roster)
        return roster
    }

    private fun generateRosterCacheKeyIdentify(userId: UserId) = CACHE_KEY + userId
}