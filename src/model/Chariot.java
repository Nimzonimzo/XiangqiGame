package model;

public class Chariot extends ChessPiece {
    public Chariot(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Chariot(String color) {
        super("/images/Chariot" + color + ".png", "Chariot");
    }

    public Chariot() {
        super();
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement du chariot
        return sourceRow == targetRow || sourceCol == targetCol;
    }
}
