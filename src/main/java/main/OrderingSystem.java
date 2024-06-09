package main;

import controller.MenuController;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;
import javafx.stage.StageStyle;

import java.io.IOException;

public class OrderingSystem extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(OrderingSystem.class.getResource("loadingScreen.fxml"));
        Scene loadingScene = new Scene(fxmlLoader.load());
            stage.setResizable(false);
            stage.setTitle("Kapeez Cafe!");
            stage.setScene(loadingScene);
            stage.show();
        Task<Void> loadingTask = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                Thread.sleep(5000);
                return null;
            }
        };

        loadingTask.setOnSucceeded(event -> {
            try {
                FXMLLoader menuLoader = new FXMLLoader(OrderingSystem.class.getResource("menu.fxml"));
                Parent root = menuLoader.load();
                Scene menuScene = new Scene(root);

                // Create a new stage for the menu scene
                Stage menuStage = new Stage();
                menuStage.setScene(menuScene);
                menuStage.setTitle("Kapeez Cafe - Menu");

                // Center the menu stage on the screen
                menuStage.centerOnScreen();

                // Show the menu stage
                menuStage.show();

                // Close the loading stage
                stage.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        new Thread(loadingTask).start();
    }
    public static void main(String[] args) {
        launch();
    }
}
