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
        displayImage(); // Ajout de cette ligne pour afficher l'image de test
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
}