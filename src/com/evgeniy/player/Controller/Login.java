package com.evgeniy.player.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by yolo on 01.02.17.
 */
public class Login implements Initializable{
    @FXML
    private WebView vkView;
    private WebEngine engine = vkView.getEngine();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine.load("https://google.com");
    }

    public void getURL(){
        System.out.println(engine.getLocation());
    }
}
