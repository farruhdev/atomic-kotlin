package kotlin15

fun main() {
    var num = 1
    var sum = 0

    do{
        sum += num++
    } while(num <= 10)

    println("sum = $sum")
}