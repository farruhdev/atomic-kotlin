package kotlin15

fun main(args: Array<String>) {
    var myList = listOf("This", "is" ,"a", "sample", "message", ".")
    var filteredList = myList.filter { x -> x.length > 2 }
    println("Original List : ${myList}")
    println("Filtered List : ${filteredList}")
}