package com.app.downtown.domain

data class Roster(
    private var titularPlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var substitutePlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var trainer: Trainer? = null,
    private val totalCredit: TotalCredit = TotalCredit()
) {

    fun addTitularPlayer(player: Player) {
        with(player) {
            if (titularPlayers.isPlayerAddable(this)) {
                titularPlayers.add(this)
                if (totalCredit.isTransactionPossible(price)) {
                    totalCredit.decreaseAmount(price)
                }
            }
        }
    }

    fun removeTitularPlayer(player: Player) {
        titularPlayers.remove(player)
        totalCredit.increaseAmount(player.price)
    }

    fun addSubstitutePlayer(player: Player) {
        with(player) {
            if (substitutePlayers.isPlayerAddable(this)) {
                substitutePlayers.add(this)
                if (totalCredit.isTransactionPossible(price)) {
                    totalCredit.decreaseAmount(price)
                }
            }
        }
    }

    fun removeSubstitutePlayer(player: Player) {
        substitutePlayers.remove(player)
        totalCredit.increaseAmount(player.price)
    }

    fun addTrainer(trainer: Trainer) {
        this.trainer = trainer
    }

    fun deleteTrainer() {
        this.trainer = null
    }
}
