package model;

public class Horse extends ChessPiece {
    public Horse(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Horse(String color) {
        super("/images/Horse" + color + ".png", "Horse");
    }

    public Horse() {
        super();
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement du cheval
        int rowDiff = Math.abs(targetRow - sourceRow);
        int colDiff = Math.abs(targetCol - sourceCol);
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
