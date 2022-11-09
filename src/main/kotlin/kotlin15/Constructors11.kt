package kotlin15

fun main(args: Array<String>) {

    val p1 = AuthLog("Bad Password")
}

open class Log {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String) {

    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class AuthLog: Log {
    constructor(_data: String): this("From AuthLog -> " + _data, 10) {
    }

    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
    }
}