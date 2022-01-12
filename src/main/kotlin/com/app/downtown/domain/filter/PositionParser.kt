package com.app.downtown.domain

import com.app.downtown.domain.Position.*
import com.app.downtown.domain.filter.PositionSorting

fun parsePositionSorting(position: String) = when (position) {
    "POINT_GUARD" -> PositionSorting.PositionChoose(POINT_GUARD)
    "SHOOTING_GUARD" -> PositionSorting.PositionChoose(SHOOTING_GUARD)
    "SMALL_FORWARD" -> PositionSorting.PositionChoose(SMALL_FORWARD)
    "POWER_FORWARD" -> PositionSorting.PositionChoose(POWER_FORWARD)
    "CENTER" -> PositionSorting.PositionChoose(CENTER)
    else -> PositionSorting.Nothing
}