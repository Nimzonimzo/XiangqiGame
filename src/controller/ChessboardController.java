package controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ChessboardController {

    @FXML
    private GridPane chessboardGrid;

    @FXML
    private GridPane piecesGrid;

    @FXML
    private void initialize() {
        initializeChessboard();
        displayImage();
        displayBlackPieces();
    }

    public void initializeChessboard() {
        int numColumns = 8;
        int numRows = 9; // Sans la riviere

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                Rectangle square = new Rectangle(50, 50);

                // Couleur alternée pour les cases à modifier plus tard
                if ((row + col) % 2 == 0) {
                    square.setFill(Color.WHITE);
                } else {
                    square.setFill(Color.WHITE);
                }

                // Ajout d'une bordure des cases
                square.setStroke(Color.BLACK);

                StackPane squarePane = new StackPane(square);

                // Désactiver les interactions de la souris avec le StackPane plus tard a changer pour jouer
                squarePane.setMouseTransparent(true);

                chessboardGrid.add(squarePane, col, row);
            }
        }

        // Ajout de la rivière avec des cases bleues (mettre des caracteres chinois dedans )
        for (int col = 0; col < numColumns; col++) {
            Rectangle riverSquare = new Rectangle(50, 50, Color.LIGHTBLUE);
            StackPane riverSquarePane = new StackPane(riverSquare);
            riverSquarePane.setMouseTransparent(true);
            chessboardGrid.add(riverSquarePane, col, numRows / 2);
        }
    }

    private void displayImage() {
        // Positionne les pièces dans la configuration de départ du camp rouge mais mal
        // Chariots
        placePiece("/images/ChariotRed.png", 0, 0);
        placePiece("/images/ChariotRed.png", 7, 0);

        // Horses
        placePiece("/images/HorseRed.png", 1, 0);
        placePiece("/images/HorseRed.png", 6, 0);

        // Elephants
        placePiece("/images/ElephantRed.png", 2, 0);
        placePiece("/images/ElephantRed.png", 5, 0);

        // Advisors
        placePiece("/images/AdvisorRed.png", 3, 0);
        placePiece("/images/AdvisorRed.png", 4, 0);

        // General
        placePiece("/images/GeneralRed.png", 3, 1);
    }

    private void displayBlackPieces() {
        // Positionne les pièces dans la configuration de départ du camp noir mais sur la premiere ligne
        // Chariots
        placePiece("/images/ChariotBlack.png", 0, 9);
        placePiece("/images/ChariotBlack.png", 7, 9);

        // Horses
        placePiece("/images/HorseBlack.png", 1, 9);
        placePiece("/images/HorseBlack.png", 6, 9);

        // Elephants
        placePiece("/images/ElephantBlack.png", 2, 9);
        placePiece("/images/ElephantBlack.png", 5, 9);

        // Advisors
        placePiece("/images/AdvisorBlack.png", 3, 9);
        placePiece("/images/AdvisorBlack.png", 4, 9);

        // General
        placePiece("/images/GeneralBlack.png", 4, 8);
    }



    private void placePiece(String imagePath, int col, int row) {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream(imagePath)));
        StackPane piecePane = new StackPane(imageView);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);

        // Ajustez les coordonnées pour placer les pièces dans les coins supérieurs gauche mais pos aujourdhui car Disney hier et Yannis auj
        piecesGrid.add(piecePane, col, row);
        GridPane.setRowIndex(piecePane, row);
        GridPane.setColumnIndex(piecePane, col);
    }

}