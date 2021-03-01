package m226_1.Minesweeper;

public class Spielfeld {
    Zelle[][] spielFeld = new Zelle[8][8];
    int markierteFelder;
    int aufgedeckteFelder;



    void generieren() {
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                  spielFeld[j][i] = new Zelle();
            }
        }
    spielFeldRand();
    }

    void spielFeldRand() {
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8;j++){
                Zelle einzelFeld = spielFeld[j][i];
                if(i == 0){
                    einzelFeld.output = (char) (j +'0');
                }
                if(j == 0){
                    einzelFeld.output = (char) (i +'0');
                }
            }
    }}

    void definiereOutput(Zelle feld) {
        if(!feld.aufgedeckt) {
            feld.output = 'a';
        }
        if(feld.markiert) {
            feld.output = '!';
        }
        if(feld.aufgedeckt & feld.bombe ) {
            feld.output = 'B';
        }
    }
    void zeigeSpielfeld() {

        /*Zelle test = spielFeld[5][6];
        test.markiert = true;
        Zelle test2 = spielFeld[4][2];
        test2.bombe = true;
        test2.aufgedeckt = true;*/

        // Checkoutput
        for(int i = 1; i<8;i++){
            for(int j = 1; j<8;j++){
                Zelle check = spielFeld[j][i];
                definiereOutput(check);
            }}
        // Show Field
        for(int i = 0; i<8;i++){
            for(int j = 0; j<8;j++){
                Zelle einzelFeld = spielFeld[j][i];
                System.out.print(einzelFeld.output);

            }
            System.out.println();
        }}

}



