package com.app.downtown.domain

data class Roster(
    private var titularPlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var substitutePlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var trainer: Trainer? = null,
    private var totalCredit: Double = 250.0
) {

    fun addTitularPlayer(player: Player) {
        if (titularPlayers.isPlayerAddable(player)) {
            titularPlayers.add(player)
            totalCredit -= player.price
        }
    }

    fun removeTitularPlayer(player: Player) {
        titularPlayers.remove(player)
        totalCredit += player.price
    }

    fun addSubstitutePlayer(player: Player) {
        if (substitutePlayers.isPlayerAddable(player)) {
            substitutePlayers.add(player)
            totalCredit -= player.price
        }
    }

    fun removeSubstitutePlayer(player: Player) {
        substitutePlayers.remove(player)
        totalCredit += player.price
    }

    fun addTrainer(trainer: Trainer) {
        this.trainer = trainer
    }

    fun deleteTrainer() {
        this.trainer = null
    }
}
