package model;

public class Advisor extends ChessPiece {
    public Advisor(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Advisor(String color) {
        super("/images/Advisor" + color + ".png", "Advisor");
    }

    public Advisor() {
        super();
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement de l'advisor
        return Math.abs(targetRow - sourceRow) == 1 && Math.abs(targetCol - sourceCol) == 1;
    }
}
