package kotlin15

fun main() {
    val numberSet = setOf(2, 4, 6, 8, 10, 12)
    println(numberSet)

    // Returns a modified list by applying a transform function on each element of the set.
    val mapSet = numberSet.map { e ->
        e * 2
    }
    println("mapSet: $mapSet")
}
