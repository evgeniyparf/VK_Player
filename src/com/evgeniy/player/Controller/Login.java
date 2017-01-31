package com.evgeniy.player.Controller;

import com.evgeniy.player.Main;
import com.evgeniy.player.Window;

public class Login{

    Window window = Window.getInstance();

    public void loginButton(){
        window.create("Login", Integer.toString(window.getStages().size() + 1) , 300, 300);
        System.out.println(window.getStages().size());
    }

    public void exitButton(){
        window.getStage("Welcome!").close();
    }
}
