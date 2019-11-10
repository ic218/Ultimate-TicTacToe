package TicTactics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TicTactics extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        stage.setTitle("Tic Tactics by AIW");
        stage.setScene(new Scene(new TicTacticsGame(stage)));
        stage.show();
    }
} 