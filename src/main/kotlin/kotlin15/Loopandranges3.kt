package kotlin15

fun main() {
    val s = "abc"
    for (i in 0..s.lastIndex) {
        print(s[i] + 1)
    }
}