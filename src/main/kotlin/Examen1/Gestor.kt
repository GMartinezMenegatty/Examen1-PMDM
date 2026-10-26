package Examen1

// nivel en el que se encuentra el ascensor
var nivel_actual: Int = 0
// estado actual del ascensor
var estado_actual: Estados = Estados.Idle

enum class Niveles(var value: Boolean) {
    nivel_0 (value = false),
    nivel_1 (value = false)
}


/**
 * Gestiona el cambio de estados
 */
fun gestor(): Int {
    when (estado_actual) {
        is Estados.Idle -> {
            nivel_actual = 0
            estado_actual = Estados.Idle

            return nivel_actual
        }
        is Estados.MovingUP -> {
            nivel_actual = 2

            println("El ascensor se esta moviendo hacia arriba, nivel actual: $nivel_actual")

            Niveles.nivel_1.value = true

            println("El ascensor está en Plaza de Compostela, nivel actual: $nivel_actual")

            return nivel_actual
        }
        is Estados.MovingDOWN -> {
            nivel_actual = 2

            println("El ascensor se esta moviendo hacia abajo, nivel actual: $nivel_actual")

            Niveles.nivel_0.value = true

            println("El ascensor está en Garcia Barbon, nivel actual: $nivel_actual")

            return nivel_actual
        }
        is Estados.Error -> {
            nivel_actual = -1

            println("El ascensor está en error, nivel actual: $nivel_actual")

            return nivel_actual
        }
    }
}