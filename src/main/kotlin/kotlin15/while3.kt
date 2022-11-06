package kotlin15

fun main() {
    var n = 10
    val d = 3
    print(n)
    while (n > d) {
        n -=d
        print(" - $d")
    }
    println(" = $n")
}