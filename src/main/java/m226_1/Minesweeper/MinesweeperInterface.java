package m226_1.Minesweeper;

import java.util.Scanner;


public class MinesweeperInterface {
    Scanner s = new Scanner(System.in);
    Spielfeld Spielfeld;
    public MinesweeperInterface(Spielfeld spielfeld){
        this.Spielfeld = spielfeld;
    }


    void Einlesen() {
        System.out.println("Wills du eine Zelle aufdecken oder markieren? (a/m)");
        String input1 = s.next();
        if(input1 == "a"){
            System.out.println("Welche Zelle möchtest du aufdecken? (xy)");
            String input2 = s.next();
            char[] InputArray = input2.toCharArray();
            int x = InputArray[0] - '0';
            int y = InputArray[1] - '0';
            this.Spielfeld.spielFeld[x][y].aufgedeckt = true;

        }
        if(input1 == "m"){
            System.out.println("Welche Zelle möchtest du markieren? (xy)");
            String input2 = s.next();
            char[] InputArray = input2.toCharArray();
            int x = InputArray[0] - '0';
            int y = InputArray[1] - '0';
            this.Spielfeld.spielFeld[x][y].markiert = true;

        }



    }

}
