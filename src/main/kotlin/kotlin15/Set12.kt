package kotlin15

fun main() {
    val dataSet = setOf(2, 4, 5, 6, 7, 8, 9, 10)

    // GroupBy method
    val result = dataSet.groupBy {
        if (it % 2 == 0) {
            "even"
        } else {
            "odd"
        }
    }
    println(result)
}