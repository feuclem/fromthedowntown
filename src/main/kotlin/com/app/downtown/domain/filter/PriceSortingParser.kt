package com.app.downtown.domain.filter

fun priceSortingParser(sorting: String) = when(sorting) {
    "ASC" -> PriceSorting.Ascending
    "DESC" -> PriceSorting.Descending
    else -> PriceSorting.Nothing
}