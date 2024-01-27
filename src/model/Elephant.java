package model;

public class Elephant extends ChessPiece {
    public Elephant(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Elephant(String color) {
        super("/images/Elephant" + color + ".png", "Elephant");
    }

    public Elephant() {
        super();
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement de l'éléphant
        int rowDiff = Math.abs(targetRow - sourceRow);
        int colDiff = Math.abs(targetCol - sourceCol);
        return rowDiff == 2 && colDiff == 2;
    }
}
