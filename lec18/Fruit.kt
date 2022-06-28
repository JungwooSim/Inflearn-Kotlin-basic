package lec18

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long = 0,
    val currentPrice: Long = 0
)
