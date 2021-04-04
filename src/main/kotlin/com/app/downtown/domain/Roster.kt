package com.app.downtown.domain

data class Roster(
    val players: MutableList<Player> = mutableListOf(),
    var trainer: Trainer? = null
) {
    fun addPlayer(player: Player) {
        players.add(player)
    }

    fun deletePlayer(player: Player) {
        players.remove(player)
    }

    fun addTrainer(trainer: Trainer) {
        this.trainer = trainer
    }

    fun deleteTrainer() {
        this.trainer = null
    }
}
