package m226_1.Minesweeper;

public class Minesweeper {
    Spielfeld Spielfeld1 = new Spielfeld();
    MinesweeperInterface Interface1 = new MinesweeperInterface(Spielfeld1);

    public static void main(String[] args) {
        Minesweeper game = new Minesweeper();
        game.Spielfeld1.generieren();
        game.Spielfeld1.zeigeSpielfeld();
    }
}
