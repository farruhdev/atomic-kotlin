package kotlin15

fun main(args:Array<String>){
    var str:String?
    do{
        print("input: ")
        str = readLine()
        println("view : $str")
    }while(str != "exit")
    println("exit")
}