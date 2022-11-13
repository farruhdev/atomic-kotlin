package kotlin15

fun main() {

    val numbers = mutableSetOf<Int>(33, 22, 11, 1, 22, 3)
    println(numbers)
    numbers.add(100)
    numbers.remove(33)
    println(numbers)
    numbers.removeIf({ it < 10 }) // 10 이하의 숫자를 삭제
    println(numbers)
}