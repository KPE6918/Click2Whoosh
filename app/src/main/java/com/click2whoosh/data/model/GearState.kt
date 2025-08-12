package com.click2whoosh.data.model

data class GearState(
    val currentGear: Int,
    val totalGears: Int,
    val stepSize: Int,
    val customTable: List<Int> = emptyList()
) {
    val isAtMinimum: Boolean get() = currentGear <= 1
    val isAtMaximum: Boolean get() = currentGear >= totalGears
    
    fun getNextGear(up: Boolean): Int {
        return if (up) {
            (currentGear + stepSize).coerceAtMost(totalGears)
        } else {
            (currentGear - stepSize).coerceAtLeast(1)
        }
    }
}
