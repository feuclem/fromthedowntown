package com.app.downtown.domain

data class Player(
    val firstName: String,
    val lastName: String,
    val team: Team,
    val number: Int,
    val position: Position,
    val average: Average,
    val price: Double
)
