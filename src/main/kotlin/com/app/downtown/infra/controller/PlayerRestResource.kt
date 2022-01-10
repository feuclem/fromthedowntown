package com.app.downtown.infra.controller

data class PlayerRestResource(
    val firstName: String,
    val lastName: String,
    val team: String,
    val number: String,
    val position: String,
    val pointPerMatch: String,
    val reboundPerMatch: String,
    val assistPerMatch: String,
    val totalCost: String,
)
