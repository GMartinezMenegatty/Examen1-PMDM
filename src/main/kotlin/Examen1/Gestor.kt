package Examen1

// nivel en el que se encuentra el ascensor
var nivel_actual: Int = 0
// estado actual del ascensor
var estado_acual: Estados = Estados.Idle

var nivel_0: Boolean = false
var nivel_1: Boolean = false


/**
 * Gestiona el cambio de estados
 */
fun gestor(): Int {
    when (estado_acual) {
        is Estados.Idle -> {
            nivel_actual = 0

            if (nivel_0 == true) {
                println("El ascensor está en Garcia Barbon, nivel actual: $nivel_actual")
            }

            return nivel_actual
        }
        is Estados.MovingUP -> {
            nivel_actual = 2

            if (nivel_1 == true) {
                println("El ascensor se esta moviendo hacia arriba, nivel actual: $nivel_actual")
            }

            return nivel_actual
        }
        is Estados.MovingDOWN -> {
            nivel_actual = 2
            println("El ascensor se esta moviendo hacia abajo, nivel actual: $nivel_actual")
            return nivel_actual
        }
        is Estados.Error -> {
            nivel_actual = -1
            println("El ascensor está en error, nivel actual: $nivel_actual")
            return nivel_actual
        }
    }
}