package kotlin15

fun main(args: Array<String>) {
    val explorer = Explorer("farrux", 71, 74, 73)
}

class Explorer (name: String, val kor: Int, val eng: Int, val math: Int) {
    val firstName: String = name.capitalize()
    val avg: Double = (kor + eng + math) / 3.0

    init {
        println("Object {firstName=%s, avg=%.3f} is created.".format(firstName, avg))
    }
}