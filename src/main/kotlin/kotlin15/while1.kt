package kotlin15

package kotlin15

fun condition(i: Int) = i < 100

fun main() {
    var i = 0
    while (condition(i)) {
        print(".")
        i += 10
    }
}