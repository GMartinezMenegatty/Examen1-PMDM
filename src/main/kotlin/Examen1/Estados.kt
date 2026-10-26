package Examen1

sealed class Estados {
    object Idle : Estados()
    data class MovingUP(val nivel_actual: Int) : Estados()
    data class MovingDOWN(val nivel_actual: Int) : Estados()
    data class Error(val nivel_actual: Int) : Estados()
}