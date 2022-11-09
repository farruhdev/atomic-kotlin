package kotlin15

fun main(args: Array<String>) {
    val student = Student("mary" , 51, 54, 53)
}

class Student(name: String, val kor: Int, val eng: Int, val math: Int) {
    val firstName: String
    val avg: Double

    init{
        firstName = name.capitalize()
        avg = (kor + eng + math) / 3.0
        println("Object {firstName=%s, avg+5.3f} is created.".format(firstName, avg))
    }
}

