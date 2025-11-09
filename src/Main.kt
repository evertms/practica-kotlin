class Pizza private constructor(
    val size: String,           // Requerido
    val extraCheese: Boolean,   // Opcional
    val pepperoni: Boolean,     // Opcional
    val onions: Boolean         // Opcional
) {
    // Clase interna que hace el trabajo de construcción
    class Builder(private val size: String) { 
        
        private var extraCheese: Boolean = false
        private var pepperoni: Boolean = false
        private var onions: Boolean = false

        fun addExtraCheese(): Builder {
            this.extraCheese = true
            return this
        }

        fun addPepperoni(): Builder {
            this.pepperoni = true
            return this
        }

        fun addOnions(): Builder {
            this.onions = true
            return this
        }

        fun build(): Pizza {
            return Pizza(size, extraCheese, pepperoni, onions)
        }
    }
    
    override fun toString(): String {
        return "Pizza(size='$size', extraCheese=$extraCheese, pepperoni=$pepperoni, onions=$onions)"
    }
}


data class KotlinPizza(
    val size: String,               // Requerido
    val extraCheese: Boolean = false, // Opcional
    val pepperoni: Boolean = false,   // Opcional
    val onions: Boolean = false     // Opcional
)


fun main() {
    
    println("--- 1. Usando el Patrón Builder Clásico ---")
    
    val miPizzaBuilder: Pizza = Pizza.Builder("Grande")
        .addExtraCheese()
        .addPepperoni()
        .build()
        
    println(miPizzaBuilder)
    
    
    println("\n--- 2. Usando la Forma Idiomática de Kotlin ---")
    
    val miPizzaKotlin: KotlinPizza = KotlinPizza(
        size = "Grande",
        extraCheese = true,
        pepperoni = true
        // 'onions' usará su valor por defecto (false)
    )
    
    println(miPizzaKotlin)
}