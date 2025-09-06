enum class Gender {
    Masculino,
    Femenino
}

fun saludar(saludo : String = "Hola", nombreCompleto: String) {
    println("$saludo, soy $nombreCompleto")
}

fun mostrarGenero(gender: Gender) : String {
    return "Género: $gender"
}

fun main() {
    val name = "Evert Moreno Serrate"
    val subject = "Aplicaciones móviles"
    val weight = 71.5
    val height = 1.8
    val age = 20
    val isAgeOdd : Boolean = age % 2 == 0
    val myGender = Gender.Masculino

    /*val message = """
        ¡Hola! Soy $name
        Materia: $subject
        Peso: $weight
        Altura: $height
        Edad: $age
        Edad es par: $isAgeOdd
        Género: $myGender
    """.trimIndent()*/
    saludar(nombreCompleto = name)
    saludar("Buenas tardes", name)
    println(mostrarGenero(myGender))
    //println(message)
}