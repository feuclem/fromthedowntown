package com.app.downtown.domain

import com.app.downtown.domain.Position.*

object PositionParser {
    fun parsePosition(position: String) = when(position) {
        "POINT_GUARD" -> POINT_GUARD
        "SHOOTING_GUARD" -> SHOOTING_GUARD
        "SMALL_FORWARD" -> SMALL_FORWARD
        "POWER_FORWARD" -> POWER_FORWARD
        else -> CENTER
    }
}