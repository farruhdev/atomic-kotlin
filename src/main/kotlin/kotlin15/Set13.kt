package kotlin15

fun main() {
    val nameSet = setOf("Bobur", "Farrux", "Mahmud", "Rovshan", "Jasur", "Qodir")

    // Filter lambda function
    val filteredValues = nameSet.filter {
        it == "Farrux"
    }
    println(filteredValues)
}