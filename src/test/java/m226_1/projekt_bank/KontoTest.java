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
        assertEquals( k.getSaldo(), 100);
    }

  @Test
    void EinzahlungPositiv() {
        k.einzahlen(100);
        assertEquals(k.getSaldo(),200 );
  }

  @Test
    void EinzahlungNegativ() {
        k.einzahlen(-100);
        assertEquals(k.getSaldo(), 100);
  }

  @Test
    void EinzahlungNull() {
        k.einzahlen(0);
        assertEquals(k.getSaldo(), 100);
  }

  @Test
    void AbhebenPositiv() {
        k.abheben(50);
        assertEquals(k.getSaldo(), 48);
  }

  @Test
    void AbhebenNegativ() {
        k.abheben(-50);
        assertEquals(k.getSaldo(), 100);
  }

  @Test
    void AbhebenNull() {
        k.abheben(0);
        assertEquals(k.getSaldo(), 100);
  }

  @Test
    void VerzinseEinJahr() {
        k.verzinsen(365);
        assertEquals(k.getSaldo(), 101);
  }

  @Test
    void VerzinseEinTag() {
        k.verzinsen(1);
        double zins = (100 * 0.01 / 356 * 1);
        assertEquals(k.getSaldo(), 100 +zins, 0.01);

  }

  @Test
    void VerzinseNUll () {
        k.verzinsen(0);
        assertEquals(k.getSaldo(),100);
  }

}