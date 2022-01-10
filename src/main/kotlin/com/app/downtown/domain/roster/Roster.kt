package com.app.downtown.domain.roster

import com.app.downtown.domain.RosterPlayers
import com.app.downtown.domain.TotalCredit
import com.app.downtown.domain.Trainer
import com.app.downtown.domain.player.EndPlayer

data class Roster(
    private var _titularPlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var substitutePlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var trainer: Trainer? = null,
    private val totalCredit: TotalCredit = TotalCredit()
) {

    val titularPlayers
        get() = _titularPlayers

    fun addTitularPlayer(endPlayer: EndPlayer) {
        with(endPlayer) {
            if (_titularPlayers.isPlayerAddable(this)) {
                _titularPlayers.add(this)
                if (totalCredit.isTransactionPossible(average.computePrice)) {
                    totalCredit.decreaseAmount(average.computePrice)
                }
            }
        }
    }

    fun removeTitularPlayer(endPlayer: EndPlayer) {
        _titularPlayers.remove(endPlayer)
        totalCredit.increaseAmount(endPlayer.average.computePrice)
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
