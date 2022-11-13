package kotlin15

fun main() {

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)
    val b = mutableSetOf<Int>(1,2,3,4)
    b.add(2)
    println(b)
    b.remove(2)
    println(b)
    b.remove(100)
    println(b)
}