package com.app.downtown.domain

data class Roster(
    private var titularPlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var substitutePlayers: RosterPlayers = RosterPlayers(mutableListOf()),
    private var trainer: Trainer? = null
) {

    fun addTitularPlayer(player: Player) {
        titularPlayers.add(player)
    }

    fun removeTitularPlayer(player: Player) {
        titularPlayers.remove(player)
    }
    fun addSubstitutePlayer(player: Player) {
        substitutePlayers.add(player)
    }

    fun removeSubstitutePlayer(player: Player) {
        substitutePlayers.remove(player)
    }

    fun addTrainer(trainer: Trainer) {
        this.trainer = trainer
    }

    fun deleteTrainer() {
        this.trainer = null
    }
}
