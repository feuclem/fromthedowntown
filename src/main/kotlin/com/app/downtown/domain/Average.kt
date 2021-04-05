package com.app.downtown.domain

data class Average(
    val pointPerMatch: Double,
    val assistPerMatch: Double,
    val reboundPerMatch: Double
) {

    val computePrice = pointPerMatch + assistPerMatch + reboundPerMatch
}
