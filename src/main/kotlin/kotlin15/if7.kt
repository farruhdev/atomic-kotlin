package kotlin15

fun trueOrFalse(exp: Boolean): String {
    if (exp)
        return "It's true!"
    return "It's false"
}
fun main() {
    val b = 1
    println(trueOrFalse(b < 3))
    println(trueOrFalse(b >= 3))

}