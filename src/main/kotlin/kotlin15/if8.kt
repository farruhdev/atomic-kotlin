package kotlin15

fun oneOrTheOther(exp: Boolean): String =
    if (exp)
        "True!"
else
    "False"

fun main() {
    val x = 1
    println(oneOrTheOther(x == 1))
    println(oneOrTheOther(x == 2))
}
