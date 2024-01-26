package controller;

import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseEvent;
import model.*;

public class ChessboardController {

    @FXML
    private GridPane chessboardGrid;

    @FXML
    private GridPane intersectionsGrid;

    private ChessPiece selectedPiece;
    private double initialX, initialY;

    @FXML
    private void initialize() {
        initializeChessboard();
        displayPieces();
        displayBlackPieces();
    }

    public void initializeChessboard() {
        int numColumns = 8;
        int numRows = 9;

        intersectionsGrid = new GridPane();
        intersectionsGrid.setMouseTransparent(true);

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                Rectangle square = new Rectangle(50, 50);

                if ((row + col) % 2 == 0) {
                    square.setFill(Color.WHITE);
                } else {
                    square.setFill(Color.WHITE);
                }

                square.setStroke(Color.BLACK);

                StackPane squarePane = new StackPane(square);
                squarePane.setMouseTransparent(true);

                intersectionsGrid.add(squarePane, col, row);
            }
        }

        for (int col = 0; col < numColumns; col++) {
            Rectangle riverSquare = new Rectangle(50, 50, Color.LIGHTBLUE);
            StackPane riverSquarePane = new StackPane(riverSquare);
            riverSquarePane.setMouseTransparent(true);
            intersectionsGrid.add(riverSquarePane, col, numRows / 2);
        }

        chessboardGrid.add(intersectionsGrid, 0, 0);
    }

    private void displayPieces() {
        // Positionne les pièces dans la configuration de départ du camp rouge
        // Chariots
        ChessPiece chariot1R = new Chariot("/images/ChariotRed.png", "Chariot");
        placePiece(chariot1R, 0, 9);
        ChessPiece chariot2R = new Chariot("/images/ChariotRed.png", "Chariot");
        placePiece(chariot2R, 8, 9);

        // Horses
        ChessPiece horse1R = new Horse("/images/HorseRed.png", "Horse");
        placePiece(horse1R, 1, 9);
        ChessPiece horse2R = new Horse("/images/HorseRed.png", "Horse");
        placePiece(horse2R, 7, 9);

        // Cannons
        ChessPiece cannon1R = new Cannon("/images/CannonRed.png", "Cannon");
        placePiece(cannon1R, 1, 7);
        ChessPiece cannon2R = new Cannon("/images/CannonRed.png", "Cannon");
        placePiece(cannon2R, 7, 7);

        // Elephants
        ChessPiece elephant1R = new Elephant("/images/ElephantRed.png", "Elephant");
        placePiece(elephant1R, 2, 9);
        ChessPiece elephant2R = new Elephant("/images/ElephantRed.png", "Elephant");
        placePiece(elephant2R, 6, 9);

        // Advisors
        ChessPiece advisor1R = new Advisor("/images/AdvisorRed.png", "Advisor");
        placePiece(advisor1R, 3, 9);
        ChessPiece advisor2R = new Advisor("/images/AdvisorRed.png", "Advisor");
        placePiece(advisor2R, 5, 9);

        // General
        ChessPiece general1R = new General("/images/GeneralRed.png", "General");
        placePiece(general1R, 4, 9);

        // Soldiers
        ChessPiece soldier1R = new Soldier("/images/SoldierRed.png", "Soldier");
        placePiece(soldier1R, 0, 6);
        ChessPiece soldier2R = new Soldier("/images/SoldierRed.png", "Soldier");
        placePiece(soldier2R, 2, 6);
        ChessPiece soldier3R = new Soldier("/images/SoldierRed.png", "Soldier");
        placePiece(soldier3R, 4, 6);
        ChessPiece soldier4R = new Soldier("/images/SoldierRed.png", "Soldier");
        placePiece(soldier4R, 6, 6);
        ChessPiece soldier5R = new Soldier("/images/SoldierRed.png", "Soldier");
        placePiece(soldier5R, 8, 6);
    }

    private void displayBlackPieces() {
        // Positionne les pièces dans la configuration de départ du camp noir

        // Chariots
        ChessPiece chariot1B = new Chariot("/images/ChariotBlack.png", "Chariot");
        placePiece(chariot1B, 0, 0);
        ChessPiece chariot2B = new Chariot("/images/ChariotBlack.png", "Chariot");
        placePiece(chariot2B, 8, 0);

        // Horses
        ChessPiece horse1B = new Horse("/images/HorseBlack.png", "Horse");
        placePiece(horse1B, 1, 0);
        ChessPiece horse2B = new Horse("/images/HorseBlack.png", "Horse");
        placePiece(horse2B, 7, 0);

        // Cannons
        ChessPiece cannon1B = new Cannon("/images/CannonBlack.png", "Cannon");
        placePiece(cannon1B, 1, 2);
        ChessPiece cannon2B = new Cannon("/images/CannonBlack.png", "Cannon");
        placePiece(cannon2B, 7, 2);

        // Elephants
        ChessPiece elephant1B = new Elephant("/images/ElephantBlack.png", "Elephant");
        placePiece(elephant1B, 2, 0);
        ChessPiece elephant2B = new Elephant("/images/ElephantBlack.png", "Elephant");
        placePiece(elephant2B, 6, 0);

        // Advisors
        ChessPiece advisor1B = new Advisor("/images/AdvisorBlack.png", "Advisor");
        placePiece(advisor1B, 3, 0);
        ChessPiece advisor2B = new Advisor("/images/AdvisorBlack.png", "Advisor");
        placePiece(advisor2B, 5, 0);

        // General
        ChessPiece general1B = new General("/images/GeneralBlack.png", "General");
        placePiece(general1B, 4, 0);

        // Soldiers
        ChessPiece soldier1B = new Soldier("/images/SoldierBlack.png", "Soldier");
        placePiece(soldier1B, 0, 3);
        ChessPiece soldier2B = new Soldier("/images/SoldierBlack.png", "Soldier");
        placePiece(soldier2B, 2, 3);
        ChessPiece soldier3B = new Soldier("/images/SoldierBlack.png", "Soldier");
        placePiece(soldier3B, 4, 3);
        ChessPiece soldier4B = new Soldier("/images/SoldierBlack.png", "Soldier");
        placePiece(soldier4B, 6, 3);
        ChessPiece soldier5B = new Soldier("/images/SoldierBlack.png", "Soldier");
        placePiece(soldier5B, 8, 3);
    }

    private void placePiece(ChessPiece chessPiece, int col, int row) {
        ImageView imageView = new ImageView(chessPiece.getPieceImage());
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);

        StackPane piecePane = new StackPane(imageView);
        StackPane.setAlignment(imageView, Pos.BOTTOM_LEFT);
        imageView.setTranslateX(-imageView.getFitWidth() / 2);
        imageView.setTranslateY(-imageView.getFitHeight() / 2);

        GridPane.setValignment(piecePane, VPos.BOTTOM);
        GridPane.setHalignment(piecePane, HPos.LEFT);

        piecePane.setOnMousePressed(event -> {
            initialX = event.getSceneX();
            initialY = event.getSceneY();
            selectedPiece = chessPiece;
        });

        piecePane.setOnMouseDragged(event -> {
            double dragX = event.getSceneX() - initialX;
            double dragY = event.getSceneY() - initialY;
            piecePane.setTranslateX(dragX);
            piecePane.setTranslateY(dragY);
        });

        piecePane.setOnMouseReleased(event -> {
            // Reset selection
            selectedPiece = null;

            // Update piece position in the grid
            int newCol = (int) (event.getSceneX() / 50);
            int newRow = (int) (event.getSceneY() / 50);

            GridPane.setColumnIndex(piecePane, newCol);
            GridPane.setRowIndex(piecePane, newRow);

            // Reset piece translation
            piecePane.setTranslateX(0);
            piecePane.setTranslateY(0);
        });

        intersectionsGrid.add(piecePane, col, row);
    }
}
