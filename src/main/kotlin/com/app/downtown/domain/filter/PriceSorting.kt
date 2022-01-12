package com.app.downtown.domain.filter

sealed class PriceSorting {
    object Ascending: PriceSorting()
    object Descending: PriceSorting()
    object Nothing: PriceSorting()
}
