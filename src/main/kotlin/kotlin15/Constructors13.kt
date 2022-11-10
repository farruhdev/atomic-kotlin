package kotlin15

fun main() {
    val o = MyClass( 21, "Ali", 28 )
}

class MyClass(
    var id: Int,
    var name: String
){
    init {

        id = 20
        name = "Farrux"
        print("Init1: My id $id and my name $name")
    }

    init {
        println("Init2: Hello this is second init block")
    }

    constructor(id: Int, name: String, age: Int): this(id, name){
        println("Sec: My id $id, my name $name and age is $age")
    }

}