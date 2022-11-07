package kotlin15

fun main() {
    var feltTemp = "cold" //추움
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp == 20) {
                feltTemp = "warm" //따뜻함
                println("it's warm now") //지금 따뜻함

        }
    }
}
//(출력)
//
//현재 느끼는 추위를 "cold", 방 온도를 10으로 초기값으로 설정한다.
//
//While loop 안에 "cold"일 동안에는 방 온도가 1도 씩 계속 오르도록 조건을 설정.
//
//If를 통해서 20도가 되면 "warm"으로 바뀌고 "It's warm now" 지금은 따뜻하다는 문구를 출력한다.
