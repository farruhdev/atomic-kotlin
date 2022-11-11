package kotlin15

fun main(args: Array<String>) {
    var myList: List<Any> = listOf(4, true, "abcd", 0.2 ,"four", 7, 9)
    var filteredList = myList.filterIsInstance<Int>()
    println("Original List : ${myList}")
    println("Filtered List : ${filteredList}")
}