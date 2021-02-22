package m226_1.projekt_bank;

public class TestKonto {

    public static void main(String[] args) {
        Kunde erich = new Kunde("erich", "Müller");
        Kunde Fritz = new Kunde("fritz", "Sammler");

        Konto Konto1 = new Konto(0.01, erich );
        Konto Konto2 = new Konto (0.01, Fritz);
        Konto Konto3 = new Konto(0.02, new Kunde("Heinz", "Heller"));

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

        //TestCase3
        Konto3.einzahlen(0.50);
        double Saldo3 = Konto3.getSaldo();
        System.out.print("Saldo3: ");
        System.out.print( Saldo3);


    }



}
