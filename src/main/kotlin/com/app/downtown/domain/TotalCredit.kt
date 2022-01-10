package com.app.downtown.domain

data class TotalCredit(
    var amount: Double = 150.0
) {

    fun decreaseAmount(amountToDecrease: Double): TotalCredit {
        amount -= amountToDecrease
        return this
    }
    fun increaseAmount(amountToIncrease: Double): TotalCredit {
        amount += amountToIncrease
        return this
    }

    fun isTransactionPossible(amountToDecrease: Double): Boolean = (amount - amountToDecrease) >= 0

}
