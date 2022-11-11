package kotlin15

fun main(args: Array<String>)
{
    val names = listOf("Maykil", "Jordan", "Konor", "Ronney",
        "Halland", "Lampard", "John")

    // method 1
    for (name in names) {
        print("$name, ")
    }
    println()

    // method 2
    for (i in 0 until names.size) {
        print("${names[i]} ")
    }
    println()

    // method 3
    names.forEachIndexed({i, j -> println("names[$i] = $j")})

    // method 4
    val it: ListIterator<String> = names.listIterator()
    while (it.hasNext()) {
        val i = it.next()
        print("$i ")
    }
    println()
}