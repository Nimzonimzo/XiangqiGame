package model;

import javafx.scene.image.Image;

public abstract class ChessPiece {
    private Image pieceImage;
    private String pieceName;
    private String imagePath;

    public ChessPiece(String imagePath, String pieceName) {
        this.imagePath = imagePath;
        this.pieceImage = new Image(getClass().getResourceAsStream("/images/" + imagePath));
        this.pieceName = pieceName;
    }

    public Image getPieceImage() {
        return pieceImage;
    }

    public String getPieceName() {
        return pieceName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public abstract boolean isValidMove(int sourceRow, int sourceCol, int targetRow, int targetCol);
}
