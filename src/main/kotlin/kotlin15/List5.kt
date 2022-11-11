package kotlin15

fun main(args: Array<String>) {
    val listOfLists = listOf(
        listOf(1, 3, 9),
        listOf("Abc", "Xyz", "Pqr")
    )
    for(aList in listOfLists) {
        println("Accessing the list $aList")
        for(element in aList) {
            println(element)
        }
    }
}