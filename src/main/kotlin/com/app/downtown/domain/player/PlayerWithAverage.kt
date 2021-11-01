package com.app.downtown.domain.player

import com.app.downtown.domain.Average
import com.app.downtown.domain.Team

data class PlayerWithAverage(
    override val firstName: String,
    override val lastName: String,
    override val team: Team,
    val average: Average
) : Player