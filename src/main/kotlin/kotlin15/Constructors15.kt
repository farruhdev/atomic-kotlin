package kotlin15

fun main(args: Array<String>)
{
    val add = Add(7, 3)
    println("The Sum of numbers 7 and 3 is: ${add.c}")
}
//primary constructor
class Add constructor(a: Int,b:Int)
{
    var c = a+b;
}