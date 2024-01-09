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
    private void initialize() {
        initializeChessboard();
        displayImage();
        displayBlackPieces();
    }

    public void initializeChessboard() {
        int numColumns = 8;
        int numRows = 9; // Exclut la rivière

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                Rectangle square = new Rectangle(50, 50);

                // Couleur alternée pour les cases à modifier plus tard
                if ((row + col) % 2 == 0) {
                    square.setFill(Color.WHITE);
                } else {
                    square.setFill(Color.BLACK);
                }

                // Ajout d'une bordure
                square.setStroke(Color.BLACK);

                StackPane squarePane = new StackPane(square);

                // Désactiver les interactions de la souris avec le StackPane
                squarePane.setMouseTransparent(true);

                chessboardGrid.add(squarePane, col, row);
            }
        }

        // Ajout de la rivière avec des cases bleues
        for (int col = 0; col < numColumns; col++) {
            Rectangle riverSquare = new Rectangle(50, 50, Color.LIGHTBLUE);
            StackPane riverSquarePane = new StackPane(riverSquare);
            riverSquarePane.setMouseTransparent(true);
            chessboardGrid.add(riverSquarePane, col, numRows / 2);
        }
    }

    private void displayImage() {
        // Positionne les pièces dans la configuration de départ du camp rouge
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

        // Cannons
        placePiece("/images/CannonRed.png", 1, 2);
        placePiece("/images/CannonRed.png", 7, 2);

        // Soldiers
        placePiece("/images/SoldierRed.png", 0, 3);
        placePiece("/images/SoldierRed.png", 2, 3);
        placePiece("/images/SoldierRed.png", 4, 3);
        placePiece("/images/SoldierRed.png", 6, 3);
        placePiece("/images/SoldierRed.png", 8, 3);
    }

    private void displayBlackPieces() {
        // Positionne les pièces dans la configuration de départ du camp noir
        // Chariots
        placePiece("/images/ChariotBlack.png", 0, 8);
        placePiece("/images/ChariotBlack.png", 7, 8);

        // Horses
        placePiece("/images/HorseBlack.png", 1, 8);
        placePiece("/images/HorseBlack.png", 6, 8);

        // Elephants
        placePiece("/images/ElephantBlack.png", 2, 8);
        placePiece("/images/ElephantBlack.png", 5, 8);

        // Advisors
        placePiece("/images/AdvisorBlack.png", 3, 8);
        placePiece("/images/AdvisorBlack.png", 4, 8);

        // General
        placePiece("/images/GeneralBlack.png", 3, 7);

        // Cannons
        placePiece("/images/CannonBlack.png", 1, 6);
        placePiece("/images/CannonBlack.png", 7, 6);

        // Soldiers
        placePiece("/images/SoldierBlack.png", 0, 5);
        placePiece("/images/SoldierBlack.png", 2, 5);
        placePiece("/images/SoldierBlack.png", 4, 5);
        placePiece("/images/SoldierBlack.png", 6, 5);
        placePiece("/images/SoldierBlack.png", 8, 5);
    }

    private void placePiece(String imagePath, int col, int row) {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream(imagePath)));
        StackPane piecePane = new StackPane(imageView);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);
        chessboardGrid.add(piecePane, col, row);
    }
}