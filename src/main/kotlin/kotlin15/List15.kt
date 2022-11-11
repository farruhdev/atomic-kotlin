package kotlin15

fun main() {
    val a = listOf("one", "two", 3)
    val b = listOf(1.2, 4.5, 3.2, 1.8)
    val c: List<Double>

    c = b + listOf(4.3, 2.5)

    println(a)
    println(b)
    println(c)
}