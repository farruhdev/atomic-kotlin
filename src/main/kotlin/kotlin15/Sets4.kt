package kotlin15

fun main() {
    val day = mutableSetOf<String>()
    day.add("월")
    day.add("화")
    day.add("수")
    day += "목"
    day += "금"
    println(day)

    day.remove("화")
    day -= "금"
    println(day)
}