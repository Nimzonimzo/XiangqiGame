package main;

import controller.ChessboardController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class XiangqiGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Chessboard.fxml"));
        Parent root = loader.load();

        ChessboardController controller = loader.getController();
        controller.initializeChessboard(); // Initialise le plateau

        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.setTitle("Xiangqi Game de Nimzo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
