package kotlin15

fun main() {
    var a: Int = 4
    var b: Int = 4
    do{
        println(a) //조건식이 false여도 1번은 무조건 수
    } while(a < b) // a가 b보다 작을 경우 do 블럭 안의 코드를 반복수행
}
// 현재 a와 b가 같기 때문에 false이지만,
// do 블럭 값이 한번 수행되어 4 출력
