package kotlin15

fun main() {
    val score = 90
    when(score) {
        100 -> {
            println("100")
        }
        90 -> {
            println("90")
        }
        80 -> {
            println ("80")
        }
        else -> {
            println("모두 해당 안됨")
        }
    }
}