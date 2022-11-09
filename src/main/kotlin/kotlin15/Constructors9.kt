package kotlin15

fun main(args: Array<String>) {
    val building1 = Building()
    var building2 = Building("dongbo")
    var building3 = Building(grossFloorArea = 18522.5351);
    var building4 = Building("dongbo", 18522.5351)
}

class Building(var name: String = "unknown", val grossFloorArea: Double = 0.0) {
    init {
        name = name.capitalize();
        println("Building's name is %s, gross floor area is %.3f.".format(name, grossFloorArea))
    }
}