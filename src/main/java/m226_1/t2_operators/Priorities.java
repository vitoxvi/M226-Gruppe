package m226_1.t2_operators;

public class Priorities {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a * b + 2);
        System.out.println(b > a && true == true || false);
        System.out.println((b > a) && true == true || false);
        System.out.println((b > a) && (true == true) || false);
        System.out.println(((b > a) && (true == true)) || false);
        System.out.println((((b > a) && (true == true)) || false));


    }
}
