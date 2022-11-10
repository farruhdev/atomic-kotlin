package kotlin15

class Person1(val name: String) {
    var age: Int

    init {
        age = 28

    }
    constructor(name: String, age: Int) : this(name) {
        println(this.age)
        this.age = age
        println(this.age)
    }
}
fun main(args: Array<String>) {
    val person = Person1("Ready Kim", 20)
}