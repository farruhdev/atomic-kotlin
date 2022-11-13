package kotlin15

val set_colors: MutableSet<String> = mutableSetOf("Blue", "Black", "White") // 1
val set_colors_2: Set<String> = set_colors // 2
val set_numbers: Set<Int> = setOf(1, 2, 3) // 3

fun getlistnumbers(): Set<Int> { // 4
    return set_numbers
}

fun getlistcolors(): MutableSet<String> { // 4
    return set_colors
}

fun main() {
    println(set_colors)
    println(set_colors_2)
    println(set_numbers)

    set_colors.add("Sky") // 5
    println(set_colors)

    set_colors.add("Blue") // 6
    println(set_colors)

//    list_colors_2.add("Red") // Error 발생 // 7
//    list_numbers.add(4) // Error 발생 // 7

    println(getlistnumbers())
    println(getlistcolors())
}
