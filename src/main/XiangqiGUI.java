package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class XiangqiGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Chessboard.fxml"));
        primaryStage.setScene(new Scene(root, 400, 400)); // Ajoutez la taille que vous souhaitez
        primaryStage.setTitle("Xiangqi Game");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
