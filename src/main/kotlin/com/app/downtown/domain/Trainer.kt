package com.app.downtown.domain

import java.math.BigDecimal

data class Trainer(
    val firstName: String,
    val lastName: String,
    val team: Team,
    val numberOfVictory: Int,
    val numberOfDefeat: Int,
    val price: Double
)
