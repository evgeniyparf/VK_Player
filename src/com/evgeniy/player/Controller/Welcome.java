package com.evgeniy.player.Controller;

import com.evgeniy.player.Window;

public class Welcome {

    Window window = Window.getInstance();

    public void loginButton(){
        window.create("View/Login.fxml", "123", 600, 550);
    }

    public void exitButton(){
        window.getStage("Welcome!").close();
    }
}
