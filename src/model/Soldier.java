package model;

public class Soldier extends ChessPiece {
    public Soldier() {
        super("/images/SoldierRed.png", "Soldier");
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Implémentez la logique des mouvements valides pour l'éléphant
        // (vous devrez ajuster cela en fonction des règles du Xiangqi)
        return true;
    }
}