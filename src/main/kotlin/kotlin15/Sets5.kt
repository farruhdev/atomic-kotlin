package kotlin15

fun main(){
    val set1 = setOf(1,3,5,3,1)
    println(set1)   // [1,3,5]

    val set2 = setOf<Int>(2,4,5,5,4,2)
    println(set2)       // [2,4,5]
}