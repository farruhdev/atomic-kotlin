package kotlin15

fun main(args: Array<String>)
{
    val list = listOf(8, 4, 7, 1, 2, 3, 0, 5, 6 )

    val asc = list.sorted()
    println(asc)

    val desc = list.sortedDescending()
    println(desc)
}