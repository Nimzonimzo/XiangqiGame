package model;

public class Cannon extends ChessPiece {
    public Cannon(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Cannon(String color) {
        super("/images/Cannon" + color + ".png", "Cannon");
    }

    public Cannon() {
        super();
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement du cannon
        return sourceRow == targetRow || sourceCol == targetCol;
    }
}
