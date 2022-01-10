package com.app.downtown.domain

import com.app.downtown.domain.team.Team

data class Trainer(
    val firstName: String,
    val lastName: String,
    val team: Team,
    val numberOfVictory: Int,
    val numberOfDefeat: Int,
    val price: Double
)
