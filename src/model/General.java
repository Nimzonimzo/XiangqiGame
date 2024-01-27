package model;

public class General extends ChessPiece {
    public General(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public General(String color) {
        super("/images/General" + color + ".png", "General");
    }

    public General() {
        super();
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement du général
        return Math.abs(targetRow - sourceRow) + Math.abs(targetCol - sourceCol) == 1;
    }
}
