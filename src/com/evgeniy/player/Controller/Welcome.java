package com.evgeniy.player.Controller;

import com.evgeniy.player.Main;
import com.evgeniy.player.Window;

public class Welcome {

    Window window = Window.getInstance();

    public void loginButton(){
       // window.create("Welcome", "123", 300, 300);
        window.create("VKLogin.fxml", "Login", 300, 300);
        System.out.println(window.getStages().size());
    }

    public void exitButton(){
        window.getStage("Welcome!").close();
    }
}
