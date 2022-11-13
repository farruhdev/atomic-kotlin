package kotlin15

fun main() {

    val numbers = setOf<Int>(33, 22, 11, 1, 22, 3)
    println(numbers)
    println("numbers.size: ${numbers.size}")
    println("numbers.contains(1): ${numbers.contains(1)}")
    println("numbers.isEmpty(): ${numbers.isEmpty()}")
}