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

    // En los comentarios de al lado se mostrará el output esperado
    saludar(nombreCompleto = name) // Hola, soy Evert Moreno Serrate
    saludar("Buenas tardes", name) // Buenas tardes, soy Evert Moreno Serrate
    println(mostrarGenero(myGender)) // Género: Masculino
}