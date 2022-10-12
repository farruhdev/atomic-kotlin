package octobr11

class Animals(
    val name: String,
    val eyes: Int,
    val hands: Int,
    val leges: Int,

){
    fun describle()=
        "$name with $eyes eyes" +
                "$hands hands and $leges leges"
}
fun main () {
    val zoo =
        Animals("kenguru",2, 2, 2)
    val pest =
        Animals("spider",50, 0, 8)
    println(zoo.describle())
    println(pest.describle())


}


