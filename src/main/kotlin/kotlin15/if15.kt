package kotlin15

fun main() {
    var data = 10
    if (data > 10) {
        println("data > 10")
    } else if (data in 1..10) {

    println("data > 0 && data <= 10")
}
    else {
    println("data <= 0")
}
}