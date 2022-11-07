package kotlin15

fun main() {
    var a: Int = 1
    while(a <= 10){
        print("${a++}") //output : 1, 2, 3, 4, 5 ... 10
    }

    do{
        print("${a--} ")   //output : 11, 10, 9, 8, 7 ... 1
    }while(a > 0)
}