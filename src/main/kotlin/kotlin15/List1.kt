package kotlin15

fun main() {

    val listOne:List<Int> = listOf(1, 2, 3, 4)

    val listTwo:MutableList<Int> = mutableListOf(5, 6, 7, 8)
    listTwo.add(9)
    listTwo.add(10)
    listTwo.add(11)

    println(listOne[0])
    println(listTwo)


}
