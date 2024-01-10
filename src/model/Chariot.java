package model;

public class Chariot extends ChessPiece {
    public Chariot(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Chariot(String color) {
        super("/images/Chariot" + color + ".png", "Chariot");
    }

    // Ajoutez ce constructeur par défaut
    public Chariot() {
        super(); // Vous pouvez ajouter des valeurs par défaut si nécessaire
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Implémentez la logique des mouvements valides pour le chariot
        // (vous devrez ajuster cela en fonction des règles du Xiangqi)
        return true;
    }
}
