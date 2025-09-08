enum class Gender (
    val description: String,
    val abbreviation: Char
) {
    Male("Masculino", 'M') ,
    Female("Femenino", 'F')
}

data class Persona (
    val fullName: String,
    val weight: Double,
    val height: Double,
    val age: Int,
    val gender: Gender
) {
    fun isLegalAge (): Boolean = age >= 18

    fun greet(greet: String = "Hola") {
        println("$greet, soy $fullName")
    }

    fun showGender(): String {
        return "Género: ${gender.description}"
    }
}

fun main() {
    val name = "Evert Moreno Serrate"
    val weight = 71.5
    val height = 1.8
    val age = 20
    val myGender = Gender.Male

    val evert = Persona(name, weight, height, age, myGender)
    println(evert.isLegalAge())
    evert.greet("Buenas tardes")
    evert.greet()
    println(evert.showGender())

    println(evert.gender.abbreviation)
}