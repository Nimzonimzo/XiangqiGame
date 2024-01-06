package model;

public class General extends ChessPiece {
    public General() {
        super("/images/GeneralRed.png", "General");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Logique de mouvement spécifique pour le Général
        // Retournez true si le mouvement est valide, sinon false
        return false;
    }
}