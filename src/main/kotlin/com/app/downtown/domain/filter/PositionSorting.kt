package com.app.downtown.domain.filter

import com.app.downtown.domain.Position


sealed class PositionSorting {
    data class PositionChoose(val position: Position): PositionSorting()
    object Nothing: PositionSorting()
}
