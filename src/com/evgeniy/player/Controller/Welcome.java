package com.evgeniy.player.Controller;

import com.evgeniy.player.Window;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Welcome {

    Window window = Window.getInstance();

    public void loginButton(){
        window.create("View/Login.fxml", "Login", 600, 550, false);
    }

    public void exitButton(){
        window.getStage("Welcome!").close();
    }
}
