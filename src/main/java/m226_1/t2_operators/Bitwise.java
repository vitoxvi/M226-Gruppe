package m226_1.t2_operators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Addition: "     + (a + b)); // Resultat:

        System.out.println("Bitwise AND "   + (a & b)); // Resultat:
        System.out.println("Bitwise OR "    + (a | b)); // Resultat:
        System.out.println("Bitwise XOR "   + (a ^ b)); // Resultat:

        boolean res = false && returnTrue();
        System.out.println("Resultat ist " + res);
        System.out.println("-----------");
        boolean res2 = false & returnTrue();
        System.out.println("Resultat ist " + res2);

    }

    static boolean returnTrue(){
        System.out.println("returnTrue() called");
        return true;
    }
}
