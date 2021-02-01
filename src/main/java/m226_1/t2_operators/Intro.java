package m226_1.t2_operators;

public class Intro {
    public static void main(String[] args) {
        // Einstiegspunkt des Programms
        short z16bit = 256;
        byte z8bit = (byte) z16bit;

        short result = z8bit;
        // Vorschlag 1: 127 (grösstmögliche bei Byte) (Falsch)
        // Vorschlag 2: -128 (Falsch)
        // Vorschlag 3: 0 (Richtig)
        System.out.println("Ausgabe " + result);
    }
}
