package kotlin15

fun main(args: Array<String>) {

    println(" client1 is instantiated")
    val client1 = Client("Joe", 53)

    println("client2 is instantiated")
    val client2 = Client("Jack")

    println(" client3 is instantiated")
    val client3 = Client()
}

class Client(_firstName: String = "UNKNOWN", _age: Int = 0) {
    val firstName = _firstName.capitalize()
    var age = _age

    // initializer block
    init {
        println("First Name = $firstName")
        println("Age = $age\n")
    }
}