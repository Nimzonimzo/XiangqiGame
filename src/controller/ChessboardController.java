package controller;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
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
        int numRows = 9; // Inclut la rivière

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

                // Ajout de la rivière comme un unique rectangle bleu mais là en carré
                if (row == numRows / 2) {
                    square.setFill(Color.LIGHTBLUE);
                    square.setStroke(Color.BLACK); // Ajoute une bordure à la rivière
                    GridPane.setColumnSpan(square, numColumns); // Étend le rectangle sur toute la largeur
                }

                StackPane squarePane = new StackPane(square);

                // Désactiver les interactions de la souris avec le StackPane
                squarePane.setMouseTransparent(true);

                chessboardGrid.add(squarePane, col, row);
            }
        }
    }

    private void displayImage() {
        // Positionne les pièces dans la configuration de départ du camp rouge
        // Chariots
        ImageView chariotImageView1 = new ImageView(new Image(getClass().getResourceAsStream("/images/ChariotRed.png")));
        StackPane chariotImagePane1 = new StackPane(chariotImageView1);
        chariotImageView1.setFitWidth(50);
        chariotImageView1.setFitHeight(50);
        chessboardGrid.add(chariotImagePane1, 0, 0);

        ImageView chariotImageView2 = new ImageView(new Image(getClass().getResourceAsStream("/images/ChariotRed.png")));
        StackPane chariotImagePane2 = new StackPane(chariotImageView2);
        chariotImageView2.setFitWidth(50);
        chariotImageView2.setFitHeight(50);
        chessboardGrid.add(chariotImagePane2, 7, 0);

        // Horses
        ImageView horseImageView1 = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseRed.png")));
        StackPane horseImagePane1 = new StackPane(horseImageView1);
        horseImageView1.setFitWidth(50);
        horseImageView1.setFitHeight(50);
        chessboardGrid.add(horseImagePane1, 1, 0);

        ImageView horseImageView2 = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseRed.png")));
        StackPane horseImagePane2 = new StackPane(horseImageView2);
        horseImageView2.setFitWidth(50);
        horseImageView2.setFitHeight(50);
        chessboardGrid.add(horseImagePane2, 6, 0);

        // Elephants
        ImageView elephantImageView1 = new ImageView(new Image(getClass().getResourceAsStream("/images/ElephantRed.png")));
        StackPane elephantImagePane1 = new StackPane(elephantImageView1);
        elephantImageView1.setFitWidth(50);
        elephantImageView1.setFitHeight(50);
        chessboardGrid.add(elephantImagePane1, 2, 0);

        ImageView elephantImageView2 = new ImageView(new Image(getClass().getResourceAsStream("/images/ElephantRed.png")));
        StackPane elephantImagePane2 = new StackPane(elephantImageView2);
        elephantImageView2.setFitWidth(50);
        elephantImageView2.setFitHeight(50);
        chessboardGrid.add(elephantImagePane2, 5, 0);

        // Advisors
        ImageView advisorImageView1 = new ImageView(new Image(getClass().getResourceAsStream("/images/AdvisorRed.png")));
        StackPane advisorImagePane1 = new StackPane(advisorImageView1);
        advisorImageView1.setFitWidth(50);
        advisorImageView1.setFitHeight(50);
        chessboardGrid.add(advisorImagePane1, 3, 0);

        ImageView advisorImageView2 = new ImageView(new Image(getClass().getResourceAsStream("/images/AdvisorRed.png")));
        StackPane advisorImagePane2 = new StackPane(advisorImageView2);
        advisorImageView2.setFitWidth(50);
        advisorImageView2.setFitHeight(50);
        chessboardGrid.add(advisorImagePane2, 4, 0);

        // General
        ImageView generalImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/GeneralRed.png")));
        StackPane generalImagePane = new StackPane(generalImageView);
        generalImageView.setFitWidth(50);
        generalImageView.setFitHeight(50);
        chessboardGrid.add(generalImagePane, 3, 1);

        // Cannons
        ImageView cannonImageView1 = new ImageView(new Image(getClass().getResourceAsStream("/images/CannonRed.png")));
        StackPane cannonImagePane1 = new StackPane(cannonImageView1);
        cannonImageView1.setFitWidth(50);
        cannonImageView1.setFitHeight(50);
        chessboardGrid.add(cannonImagePane1, 1, 2);

        ImageView cannonImageView2 = new ImageView(new Image(getClass().getResourceAsStream("/images/CannonRed.png")));
        StackPane cannonImagePane2 = new StackPane(cannonImageView2);
        cannonImageView2.setFitWidth(50);
        cannonImageView2.setFitHeight(50);
        chessboardGrid.add(cannonImagePane2, 7, 2);

        // Soldiers
        for (int col = 0; col < 9; col += 2) {
            ImageView soldierImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/SoldierRed.png")));
            StackPane soldierImagePane = new StackPane(soldierImageView);
            soldierImageView.setFitWidth(50);
            soldierImageView.setFitHeight(50);
            chessboardGrid.add(soldierImagePane, col, 3);
        }
    }
    private void displayBlackPieces() {
        // Positionne les pièces dans la configuration de départ du camp noir
        // Chariots
        ImageView chariotImageView1 = new ImageView(new Image(getClass().getResourceAsStream("/images/ChariotBlack.png")));
        StackPane chariotImagePane1 = new StackPane(chariotImageView1);
        chariotImageView1.setFitWidth(50);
        chariotImageView1.setFitHeight(50);
        chessboardGrid.add(chariotImagePane1, 0, 9);

        ImageView chariotImageView2 = new ImageView(new Image(getClass().getResourceAsStream("/images/ChariotBlack.png")));
        StackPane chariotImagePane2 = new StackPane(chariotImageView2);
        chariotImageView2.setFitWidth(50);
        chariotImageView2.setFitHeight(50);
        chessboardGrid.add(chariotImagePane2, 7, 9);

        // Horses
        ImageView horseImageView3 = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseBlack.png")));
        StackPane horseImagePane3 = new StackPane(horseImageView3);
        horseImageView3.setFitWidth(50);
        horseImageView3.setFitHeight(50);
        chessboardGrid.add(horseImagePane3, 1, 9);

        ImageView horseImageView4 = new ImageView(new Image(getClass().getResourceAsStream("/images/HorseBlack.png")));
        StackPane horseImagePane4 = new StackPane(horseImageView4);
        horseImageView4.setFitWidth(50);
        horseImageView4.setFitHeight(50);
        chessboardGrid.add(horseImagePane4, 6, 9);

        // Elephants
        ImageView elephantImageView3 = new ImageView(new Image(getClass().getResourceAsStream("/images/ElephantBlack.png")));
        StackPane elephantImagePane3 = new StackPane(elephantImageView3);
        elephantImageView3.setFitWidth(50);
        elephantImageView3.setFitHeight(50);
        chessboardGrid.add(elephantImagePane3, 2, 9);

        ImageView elephantImageView4 = new ImageView(new Image(getClass().getResourceAsStream("/images/ElephantBlack.png")));
        StackPane elephantImagePane4 = new StackPane(elephantImageView4);
        elephantImageView4.setFitWidth(50);
        elephantImageView4.setFitHeight(50);
        chessboardGrid.add(elephantImagePane4, 5, 9);

        // Advisors
        ImageView advisorImageView3 = new ImageView(new Image(getClass().getResourceAsStream("/images/AdvisorBlack.png")));
        StackPane advisorImagePane3 = new StackPane(advisorImageView3);
        advisorImageView3.setFitWidth(50);
        advisorImageView3.setFitHeight(50);
        chessboardGrid.add(advisorImagePane3, 3, 9);

        ImageView advisorImageView4 = new ImageView(new Image(getClass().getResourceAsStream("/images/AdvisorBlack.png")));
        StackPane advisorImagePane4 = new StackPane(advisorImageView4);
        advisorImageView4.setFitWidth(50);
        advisorImageView4.setFitHeight(50);
        chessboardGrid.add(advisorImagePane4, 4, 9);

        // General
        ImageView generalImageView2 = new ImageView(new Image(getClass().getResourceAsStream("/images/GeneralBlack.png")));
        StackPane generalImagePane2 = new StackPane(generalImageView2);
        generalImageView2.setFitWidth(50);
        generalImageView2.setFitHeight(50);
        chessboardGrid.add(generalImagePane2, 3, 8);

        // Cannons
        ImageView cannonImageView3 = new ImageView(new Image(getClass().getResourceAsStream("/images/CannonBlack.png")));
        StackPane cannonImagePane3 = new StackPane(cannonImageView3);
        cannonImageView3.setFitWidth(50);
        cannonImageView3.setFitHeight(50);
        chessboardGrid.add(cannonImagePane3, 1, 7);

        ImageView cannonImageView4 = new ImageView(new Image(getClass().getResourceAsStream("/images/CannonBlack.png")));
        StackPane cannonImagePane4 = new StackPane(cannonImageView4);
        cannonImageView4.setFitWidth(50);
        cannonImageView4.setFitHeight(50);
        chessboardGrid.add(cannonImagePane4, 7, 7);

        // Soldiers
        for (int col = 0; col < 9; col += 2) {
            ImageView soldierImageView2 = new ImageView(new Image(getClass().getResourceAsStream("/images/SoldierBlack.png")));
            StackPane soldierImagePane2 = new StackPane(soldierImageView2);
            soldierImageView2.setFitWidth(50);
            soldierImageView2.setFitHeight(50);
            chessboardGrid.add(soldierImagePane2, col, 6);
        }

    }
}