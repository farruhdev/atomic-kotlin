package kotlin15

class AlienSpecies(
    val name: String,
    val eyes: Int,
    val hands: Int,
    val legs: Int
) {
    fun describe() =
        "$name with $eyes eyes, " +
                "$hands hands and $legs legs"
}

fun main() {
    val kevin =
        AlienSpecies("Zigerion", 3, 3, 3)
    val mortyJr =
        AlienSpecies("Gazorpian", 3, 6, 3 )
    println(kevin.describe())
    println(mortyJr.describe())
}