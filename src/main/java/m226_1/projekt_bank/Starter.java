package m226_1.projekt_bank;

public class Starter {
    public static void main(String[] args) {
        Kunde max = new Kunde("Max", "Müller");
        Konto k = new Konto( 2, max );
    }
}
