package com.app.downtown.domain

data class TotalCredit(
    private var amount: Double = 250.0
) {

    val get = this.amount

    fun decreaseAmount(amountToDecrease: Double) {
        amount - amountToDecrease
    }
    fun increaseAmount(amountToIncrease: Double) {
        amount + amountToIncrease
    }

    fun isTransactionPossible(amountToDecrease: Double): Boolean = (amount - amountToDecrease) >= 0

}
