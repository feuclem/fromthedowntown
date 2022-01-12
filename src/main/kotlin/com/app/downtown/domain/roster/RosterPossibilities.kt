package com.app.downtown.domain.roster

sealed class RosterPossibilities {
    object TitularPlayerNotAddableInRoster: RosterPossibilities()
    object OutOfCredit: RosterPossibilities()
    data class RosterUpdated(val updatedRoster: Roster): RosterPossibilities()
}
