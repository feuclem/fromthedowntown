package com.app.downtown.domain

data class Trainer(
    val firstName: String,
    val lastName: String,
    val team: Team,
    val numberOfVictory: Int,
    val numberOfDefeat: Int,
    val price: Double
)
