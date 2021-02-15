package m226_1.projekt_bank;

public class TestKonto {

    public static void main(String[] args) {
        Kunde max = new Kunde("Max", "Müller");
        Konto Konto1 = new Konto(0.01, max );
        Konto Konto2 = new Konto (0.01, max);

        // TestCase1
        Konto1.einzahlen(500.75);
        Konto1.verzinsen(365);
        double Saldo1 = Konto1.getSaldo();
        System.out.print("Saldo1: ");
        System.out.print( Saldo1);
        System.out.println();


        //TestCase2
        Konto2.einzahlen(720.50);
        Konto2.verzinsen(750);
        double Saldo2 = Konto2.getSaldo();
        System.out.print("Saldo2: ");
        System.out.print( Saldo2);


    }



}
