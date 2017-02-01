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
    private WebEngine engine;

    private String token = "http://api.vk.com/blank.html#code=ecd5bc3d7f4389c6a9";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine = vkView.getEngine();
        engine.load("https://oauth.vk.com/authorize?client_id=5851903&display=mobile&redirect_uri=http://api.vk.com/blank.html&scope=audio&response_type=code&v=5.62");
    }

    public void getURL(){
        System.out.println(token.split("code=")[1]);
    }
}
