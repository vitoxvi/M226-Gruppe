package m226_1.Aufgaben;

public class A_05 {

    public static void main(String[] args) {
        A_05 game = new A_05();
        game.calc(22,5,5);
    }

    void calc (int Op1, int Op2, int Op) {
        switch (Op){
            case 1:
               int Summe = Op1 + Op2;
                System.out.println(Summe);
                break;
            case 2:
                int Differenz = Op1 - Op2;
                System.out.println(Differenz);
                break;
            case 3:
                int Produkt = Op1 * Op2;
                System.out.println(Produkt);
                break;
            case 4:
                int Quotient = Op1 /Op2;
                System.out.println(Quotient);
                break;
            case 5:
                int Modulo = Op1%Op2;
                System.out.println(Modulo);
                break;
        }
    }
}
