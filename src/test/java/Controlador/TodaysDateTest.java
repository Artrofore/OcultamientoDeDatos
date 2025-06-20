package Controlador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TodaysDateTest {

    private TodaysDate todaysDate;

    @BeforeEach
    public void setup() {
        todaysDate = new TodaysDate();
        todaysDate.printDateAndTime();  // Inicializa valores
    }

    @Test
    public void testDayIsValid() {
        int day = todaysDate.getDay();
        assertTrue(day >= 1 && day <= 31, "El día debe estar entre 1 y 31");
    }

    @Test
    public void testMonthIsValid() {
        int month = todaysDate.getMonth();
        assertTrue(month >= 1 && month <= 12, "El mes debe estar entre 1 y 12");
    }

    @Test
    public void testTimeFormat() {
        String time = todaysDate.getTime();
        String[] parts = time.split(":");
        assertEquals(3, parts.length, "La hora debe tener formato HH:MM:SS");
        for (String part : parts) {
            assertDoesNotThrow(() -> Integer.parseInt(part), "Cada parte de la hora debe ser un número");
        }
    }
}
