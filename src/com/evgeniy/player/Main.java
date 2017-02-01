package com.evgeniy.player;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    Window window = Window.getInstance();

    @Override
    public void start(Stage primaryStage) throws Exception{
        window.create("View/Welcome.fxml", "Welcome!", 300, 100, true);
        System.out.println(window.getStages().size());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
