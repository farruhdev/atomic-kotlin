package kotlin15

fun main() {
    // Declaring a mutable set with all types
    val mutableSet = mutableSetOf(1, "a", "Developers", 12.3)

    // Using add() function you can add elements from mutable set.
    mutableSet.add(2)
    mutableSet.add(3)
    println(mutableSet)

    // Using remove() function you can remove elements from mutable set
    mutableSet.remove(12.3)
    println(mutableSet)

    // Using list of function to add elements to the mutable set.
    mutableSet += listOf(4, 5)
    println(mutableSet)
}