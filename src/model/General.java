package model;

public class General extends ChessPiece {
    public General(String imagePath, String pieceName) {
        super(imagePath, pieceName);
    }

    public General(String color) {
        super("/images/General" + color + ".png", "General");
    }

    // Ajoutez ce constructeur par défaut
    public General() {
        super(); // Vous pouvez ajouter des valeurs par défaut si nécessaire
    }

    @Override
    public boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        // Implémentez la logique des mouvements valides pour le general
        // (vous devrez ajuster cela en fonction des règles du Xiangqi)
        return true;
    }
}
