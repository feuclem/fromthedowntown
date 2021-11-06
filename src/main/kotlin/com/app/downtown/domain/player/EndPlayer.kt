package com.app.downtown.domain.player

import com.app.downtown.domain.Average
import com.app.downtown.domain.Position
import com.app.downtown.domain.Team

data class EndPlayer(
    override val firstName: String,
    override val lastName: String,
    override val team: Team,
    val number: String,
    val position: Position,
    val average: Average,
): Player
