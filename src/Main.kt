object Logger {

    // Una propiedad privada para guardar los logs
    private val logHistory = mutableListOf<String>()

    init {
        println("[Logger]: Sistema de Log inicializado.")
        logHistory.add("--- Inicio del Log ---")
    }

    fun log(message: String) {
        val entry = "[INFO]: $message"
        println(entry)
        logHistory.add(entry)
    }
    
    fun printHistory() {
        println("\n--- Historial de Logs ---")
        logHistory.forEach { println(it) }
    }
}

fun main() {
    
    println("--- Simulación de App iniciada ---")

    println("\n[Pantalla Perfil]: Abriendo pantalla...")
    Logger.log("Usuario 'eve' ha entrado al perfil.")
    Logger.log("Cargando foto de perfil.")
    
    
    println("\n[Pantalla Tienda]: Abriendo tienda...")
    Logger.log("Cargando lista de productos.")
    Logger.log("Producto 'Kotlin Book' añadido al carrito.")

    
    println("\n--- Simulación de App terminada ---")
    Logger.printHistory()
    
    // Demostración de la instancia única
    val ref1 = Logger
    val ref2 = Logger
    println("\n¿Logger 1 y Logger 2 son la misma instancia? ${ref1 === ref2}") // Imprimirá: true
}