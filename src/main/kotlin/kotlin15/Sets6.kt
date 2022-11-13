package kotlin15

fun main(){
    val set1 = mutableSetOf<Int>()
    set1.add(1)
    set1.add(2)
    set1.add(3)

    set1.add(1)
    println(set1)   // [1,2,3]
}