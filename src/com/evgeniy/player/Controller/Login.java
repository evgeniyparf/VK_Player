package com.evgeniy.player.Controller;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * Created by yolo on 01.02.17.
 */
public class Login {
    @FXML
    private WebView vkView;
    private WebEngine engine = vkView.getEngine();

    public Login(){
        engine.load("google.com");
    }
}
