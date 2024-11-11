import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.tests.junit_tests.animal.extend.Gato;
import com.tests.junit_tests.animal.extend.Perro;
import com.tests.junit_tests.carro.extend.Camioneta;
import com.tests.junit_tests.carro.extend.CarroDeportivo;

public class ApplicationTest {

    @Test
    public void testDevuelveLaVelocidadCorrecta() {
        CarroDeportivo carroDeportivo = new CarroDeportivo("McClaren", 2024, 80);

        int velocidadMax = carroDeportivo.acelerar(2);

        assertEquals(160, velocidadMax,
                "La velocidad de " + carroDeportivo.getmodelo() + " con un aumento de x2 deberia ser 160");

    }

    @Test
    public void testActivaCorrectamenteModo4x4() {
        Camioneta camioneta = new Camioneta("Nissan", 2006, 80);

        boolean modo4x4Activado = camioneta.activarModo4x4();

        assertTrue(modo4x4Activado == true);

    }

    @Test
    public void testSePresentaCorrectamente() {
        Gato gato = new Gato("Gato", 5, "Naranja", "Siames", "Grande");

        String presentacion = gato.presentarGato();

        assertEquals("Soy un gato de raza Siames, de tamaño Grande, y mi color es Naranja.", presentacion);
    }

    @Test
    public void testJuegaCorrectamente() {
        Perro perro = new Perro("Perro", 3, "Crema", "French", "Pelota");

        String mensajeDeJuego = perro.jugarConJuguete();

        assertEquals("El perro French esta jugando con Pelota.", mensajeDeJuego);

    }
}
