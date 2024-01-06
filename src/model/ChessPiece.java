package model;

import javafx.scene.image.Image;

public abstract class ChessPiece {
    private Image pieceImage;
    private String pieceName;

    public ChessPiece(String imagePath, String pieceName) {
        this.pieceImage = new Image(getClass().getResourceAsStream(imagePath));
        this.pieceName = pieceName;
    }

    public Image getPieceImage() {
        return pieceImage;
    }

    public String getPieceName() {
        return pieceName;
    }

    public abstract boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol);

    // Ajout d'un constructeur par défaut pour faciliter l'initialisation dans Chessboard
    public ChessPiece() {
    }
}
