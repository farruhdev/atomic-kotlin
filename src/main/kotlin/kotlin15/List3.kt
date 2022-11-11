package kotlin15

fun main(args: Array<String>) {
    //initialize a list
    var listA = listOf<String>("Example", "Program", "Tutorial")

    //filter the list
    val b = listA.filter { it.contains("am") }

    //print the filtered list
    print(b)
}