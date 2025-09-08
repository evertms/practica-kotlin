fun Int.esPar() : Boolean = this % 2 == 0

fun String.invertir() : String = this.reversed()

data class Estudiante (
    val name: String,
    val age: Int,
    val gender: Gender
    ) {
    fun saludo() {
        println("Hola, soy $name")
    }

    fun esMayor(): Boolean = age > 17
}

sealed interface Forma // Funciona para los extends

class Circulo (val radio: Double) : Forma

class Rectangulo (val ancho: Double, alto: Double) : Forma

fun main() {
    val name = "Evert Moreno Serrate"
    val subject = "Aplicaciones móviles"
    val weight = 71.5
    val height = 1.8
    val age = 20
    val isAgeOdd : Boolean = age.esPar()
    val myGender = Gender.Male
    val evert = Estudiante(name, age, myGender)
    evert.saludo()
    print(evert.esMayor())
    val invertedName = name.invertir()
    println(invertedName)
    var data: Any
    data = 2025
    println(data)
    data = "aplicaciones"
    println(data)
    if (data is String) {
        println(data.length)
    }

    // funciones lambda
    val sumar : (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    println(sumar(1, 2))

    val sumarv2 = {a: Int, b: Int -> a + b}
    println(sumarv2(1, 2))

    // lists
    val frutas: List<String> = listOf("Manzana", "Durazno") // lista inmutable
    println(frutas)


    val notas: List<Int> = listOf(0, 100, 80, 90) // lista inmutable
    println(notas)

    val frutas2: MutableList<String> = mutableListOf("Manzana", "durazno", "durazno") // lista mutable
    frutas2.add("Pera")
    frutas2.remove("durazno") // remover por elemento
    frutas2.removeAt(0)
    println(frutas2)

    // sets
    val notasSet : Set<Int> = setOf(1, 2, 3, 3, 4)
    println(notasSet)

    val notasSet2 = mutableSetOf(1, 2, 3, 4)
    notasSet2.add(100)
    notasSet2.add(4)
    println(notasSet2)

    // maps
    var notasFinales: Map<String, Int> = mapOf(
        "Enrique" to 100,
        "Rafa" to 101
    )
    println(notasFinales)

    var notasFinales2 = mutableMapOf<String, Int>()
    notasFinales2["Evert"] = 100
    notasFinales2["Jonathan"] = 97
    println(notasFinales2)
    println(notasFinales2.getOrDefault("Jonathan", 98))

    println()

    val message = """
        ¡Hola! Soy $name
        Materia: $subject
        Peso: $weight
        Altura: $height
        Edad: $age
        Edad es par: $isAgeOdd
        Género: ${myGender.description} (${myGender.abbreviation}) 
    """.trimIndent()
    println(message)
}

enum class Gender (
    val description: String,
    val abbreviation : String
) {
    Male ("Masculino", "M"),
    Female ("Femenino", "F")
}