package com.evgeniy.player.Controller;

import com.evgeniy.player.Window;

public class Welcome {

    Window window = Window.getInstance();

    public void loginButton(){
       // window.create("Welcome", "123", 300, 300);
        window.create("Login.fxml", "Login11", 600, 550);
        System.out.println(window.getStages().size());
    }

    public void exitButton(){
        window.getStage("Welcome!").close();
    }
}
