import static org.junit.Assert.*;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

public class TarifasTest {

    @Test
    public void calcularTarifaDescuento20DiasAntelacion() {
        long tarifaBase = 1000;
        int diasAntelacion = 21;
        int edad = 30;
        long tarifaEsperada = 850; // 15% de descuento sobre la tarifa base
        assertEquals(tarifaEsperada, Tarifas.calculoTarifa(tarifaBase, diasAntelacion, edad));
    }

    @Test
    public void calcularTarifaDescuentoMenor18Anios() {
        long tarifaBase = 1000;
        int diasAntelacion = 10;
        int edad = 16;
        long tarifaEsperada = 950; // 5% de descuento sobre la tarifa base
        assertEquals(tarifaEsperada, Tarifas.calculoTarifa(tarifaBase, diasAntelacion, edad));
    }

    @Test
    public void calcularTarifaDescuentoMayor65Anios() {
        long tarifaBase = 1000;
        int diasAntelacion = 15;
        int edad = 70;
        long tarifaEsperada = 920; // 8% de descuento sobre la tarifa base
        assertEquals(tarifaEsperada, Tarifas.calculoTarifa(tarifaBase, diasAntelacion, edad));
    }

    @Test
    public void calcularTarifaSinDescuento() {
        long tarifaBase = 1000;
        int diasAntelacion = 10;
        int edad = 30;
        long tarifaEsperada = 1000; // Sin descuento
        assertEquals(tarifaEsperada, Tarifas.calculoTarifa(tarifaBase, diasAntelacion, edad));
    }
}
