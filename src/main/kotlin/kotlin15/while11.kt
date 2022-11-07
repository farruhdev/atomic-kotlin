package kotlin15

fun main(){
    print("숫자를 입력하세요 :")
    var number = readLine()!!.toInt()
    var factorial: Long = 1
    while( number > 0) {
        factorial *= number
        --number
    }
    println("Factorial 결과 :$factorial")
}