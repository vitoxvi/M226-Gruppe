package m226_1.projekt_bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    Konto k;

    @BeforeEach
    void setUp() {
        // vor jedem Test wird das Konto neu instantiiert.
        k = new Konto(100, 0.01);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getSaldo() {
        assertEquals(k.getSaldo(), 100);
    }

    @Test
    void einzahlen() {
        k.einzahlen(100);
        assertEquals(k.getSaldo(), 200);
    }

    @Test
    void abheben() {
        k.abheben(50);
        assertEquals(k.getSaldo(), 48);
        k.abheben(-10);
        assertEquals(k.getSaldo(), 48);
    }

    @Test
    void verzinsen() {
        k.verzinsen(365);
        assertEquals(k.getSaldo(), 101);
    }
}