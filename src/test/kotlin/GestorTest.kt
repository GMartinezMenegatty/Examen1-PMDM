package Examen1

import kotlin.test.AfterTest
import kotlin.test.Test
import kotlin.test.assertEquals

class GestorTest {
    @AfterTest
    fun restaurarEstado() {
        estado_actual = Estados.Idle
        nivel_actual = 0
    }

    @Test
    fun gestorreiniciaelnivelcuandoelestadoesIdle() {
        estado_actual = Estados.Idle
        nivel_actual = 0

        assertEquals(0, gestor())
        assertEquals(0, nivel_actual)
    }

    @Test
    fun gestorestableceelnivelcuandoelestadoesMovingUP() {
        estado_actual = Estados.MovingUP(nivel_actual)
        nivel_actual = 2

        assertEquals(2, gestor())
        assertEquals(2, nivel_actual)
    }

    @Test
    fun gestorestableceelnivelcuandoelestadoesMovingDOWN() {
        estado_actual = Estados.MovingDOWN(nivel_actual)
        nivel_actual = 1

        assertEquals(0, gestor())
        assertEquals(0, nivel_actual)
    }

    @Test
    fun gestorestableceelniveldeerrorcuandoelestadoesError() {
        estado_actual = Estados.Error(nivel_actual)
        nivel_actual = -1

        assertEquals(-1, gestor())
        assertEquals(-1, nivel_actual)
    }
}