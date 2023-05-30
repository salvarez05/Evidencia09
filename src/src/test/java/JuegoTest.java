import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregarDado() {
        Juego a =new Juego();
        a.agregarDado(Dado.Numero.Primer);
        a.agregarDado(Dado.Numero.Segundo);
        assertEquals(2,a.getDados().size());
    }

    @Test
    void resultadoJuego() {
        Juego a =new Juego();
        a.agregarDado(Dado.Numero.Primer);
        a.agregarDado(Dado.Numero.Segundo);
        a.getDados().get(0).setCaraSuperior(6);
        a.getDados().get(1).setCaraSuperior(1);
        assertTrue(a.resultadoJuego(a.calcularPuntaje()));
        a.getDados().get(0).setCaraSuperior(3);
        a.getDados().get(1).setCaraSuperior(1);
        assertFalse((a.resultadoJuego(a.calcularPuntaje())));
    }

    @Test
    void calcularPuntaje() {
        Juego a =new Juego();
        a.agregarDado(Dado.Numero.Primer);
        a.agregarDado(Dado.Numero.Segundo);
        a.getDados().get(0).setCaraSuperior(2);
        a.getDados().get(1).setCaraSuperior(2);
        assertEquals(4,a.calcularPuntaje());
    }
}