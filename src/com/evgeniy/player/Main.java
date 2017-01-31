package com.evgeniy.player;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    Window window = Window.getInstance();

    @Override
    public void start(Stage primaryStage) throws Exception{
        window.create("Login", "Welcome!", 300, 100);
        System.out.println(window.getStages().size());
    }

    public static void main(String[] args) {
        launch(args);
    }
}