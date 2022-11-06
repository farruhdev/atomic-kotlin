package kotlin15


fun main() {

    var z = 1
    do {
        print("$z ")
        z++
    } while(z <= 10)
}
//While과 달리 조건 설정을 마지막에 하는 방식이다. 기본 While과 비슷하지만 상황에 따라 더 효울적일 수 있다.
// 조건 검사가 마지막에 있으므로, 처음 코드는 적어도 1번은 출력된다.