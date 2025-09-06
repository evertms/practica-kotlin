fun main() {
    val name = "Evert Moreno Serrate"
    val subject = "Aplicaciones móviles"
    val weight = 71.5
    val height = 1.8
    val age = 20
    val isAgeOdd : Boolean = age % 2 == 0
    val myGender = Gender.Male

    val message = """
        ¡Hola! Soy $name
        Materia: $subject
        Peso: $weight
        Altura: $height
        Edad: $age
        Edad es par: $isAgeOdd
        Género: $myGender
    """.trimIndent()
    println(message)
}

enum class Gender {
    Male,
    Female
}