package com.app.downtown.domain

data class Average(
    val pointPerMatch: Double,
    val reboundPerMatch: Double,
    val assistPerMatch: Double
) {

    val computePrice = pointPerMatch + assistPerMatch + reboundPerMatch
}
