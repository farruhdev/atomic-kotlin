package kotlin15

fun main(args: Array<String>) {
    var person = Person("Farrux", 28)
    person.introduce()
}

class Person(var name: String, var age: Int) {
    fun introduce() {
        println("My name is $name. I am $age years old.")
    }
}


