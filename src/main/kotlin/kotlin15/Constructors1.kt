package kotlin15

class Alien(name: String) {
    val greeting = "Poor $name!"
}

fun main() {
    val alien = Alien("Mr. Jordan")
    println(alien.greeting)

}