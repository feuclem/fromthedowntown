package com.app.downtown.domain

import com.app.downtown.domain.player.EndPlayer

data class Roster(
    private var titularPlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var substitutePlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var trainer: Trainer? = null,
    private val totalCredit: TotalCredit = TotalCredit()
) {

    fun addTitularPlayer(endPlayer: EndPlayer) {
        with(endPlayer) {
            if (titularPlayers.isPlayerAddable(this)) {
                titularPlayers.add(this)
                if (totalCredit.isTransactionPossible(this.average.computePrice)) {
                    totalCredit.decreaseAmount(this.average.computePrice)
                }
            }
        }
    }

    fun removeTitularPlayer(endPlayer: EndPlayer) {
        titularPlayers.remove(endPlayer)
        totalCredit.increaseAmount(endPlayer.average.computePrice)
    }

    fun addSubstitutePlayer(endPlayer: EndPlayer) {
        with(endPlayer) {
            if (substitutePlayers.isPlayerAddable(this)) {
                substitutePlayers.add(this)
                if (totalCredit.isTransactionPossible(this.average.computePrice)) {
                    totalCredit.decreaseAmount(this.average.computePrice)
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
