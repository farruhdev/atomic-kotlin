package kotlin15

fun main() {
    val setName = mutableSetOf(1,3,5,9)

    println(setName)

    println(setName.first()) //배열 중 첫 번째 element
    println(setName.last())  //배열 중 마지막 element
    println(setName.sum())   //배열 element들의 합
}
