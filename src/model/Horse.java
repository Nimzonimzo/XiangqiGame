package model;

public class Horse extends ChessPiece {
    public Horse(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public Horse(String color) {
        super("/images/Horse" + color + ".png", "Horse");
    }

    // Ajoutez ce constructeur par défaut
    public Horse() {
        super(); // Vous pouvez ajouter des valeurs par défaut si nécessaire
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Implémentez la logique des mouvements valides pour le cheval
        // (vous devrez ajuster cela en fonction des règles du Xiangqi)
        return true;
    }
}
