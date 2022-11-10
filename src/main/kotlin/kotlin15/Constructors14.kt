package kotlin15

class Car {
    var brand = ""
    var model = ""
    var year = 0
}

fun main() {
    val c1 = Car()
    c1.brand = "BMW"
    c1.model = "MERS"
    c1.year = 2022

    println(c1.brand)
    println(c1.model)
    println(c1.year)

}