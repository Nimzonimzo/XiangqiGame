package model;

public class Soldier extends ChessPiece {
    public Soldier(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Soldier(String color) {
        super("/images/Soldier" + color + ".png", "Soldier");
    }

    // Ajoutez ce constructeur par défaut
    public Soldier() {
        super(); // Vous pouvez ajouter des valeurs par défaut si nécessaire
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Implémentez la logique des mouvements valides pour le soldat
        // (vous devrez ajuster cela en fonction des règles du Xiangqi)
        return true;
    }
}
