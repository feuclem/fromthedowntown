package com.app.downtown.domain.roster

import com.app.downtown.domain.RosterPlayers
import com.app.downtown.domain.TotalCredit
import com.app.downtown.domain.Trainer
import com.app.downtown.domain.player.EndPlayer

data class Roster(
    var titularPlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var substitutePlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var trainer: Trainer? = null,
    var totalCredit: TotalCredit = TotalCredit()
) {

    fun addTitularPlayer(endPlayer: EndPlayer): Roster {
        with(endPlayer) {
            println(endPlayer)
            println(titularPlayers.isPlayerAddable(endPlayer))
            if (titularPlayers.isPlayerAddable(endPlayer)) {
                titularPlayers.add(endPlayer)
                if (totalCredit.isTransactionPossible(average.computePrice)) {
                    totalCredit = totalCredit.decreaseAmount(average.computePrice)
                }
            }
        }
        return this
    }

    fun removeTitularPlayer(endPlayer: EndPlayer): Roster {
        titularPlayers.remove(endPlayer)
        totalCredit = totalCredit.increaseAmount(endPlayer.average.computePrice)
        return this
    }

    fun addSubstitutePlayer(endPlayer: EndPlayer) {
        with(endPlayer) {
            if (substitutePlayers.isPlayerAddable(this)) {
                substitutePlayers.add(this)
                if (totalCredit.isTransactionPossible(average.computePrice)) {
                    totalCredit.decreaseAmount(average.computePrice)
                }
            }
        }
    }

    fun removeSubstitutePlayer(endPlayer: EndPlayer) {
        substitutePlayers.remove(endPlayer)
        totalCredit.increaseAmount(endPlayer.average.computePrice)
    }

    fun addTrainer(trainer: Trainer) {
        this.trainer = trainer
    }

    fun deleteTrainer() {
        this.trainer = null
    }
}
