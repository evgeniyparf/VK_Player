package com.evgeniy.player.Controller;

import com.evgeniy.player.Window;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Login implements Initializable{
    @FXML
    private WebView vkView;
    @FXML
    private Button closeButton;
    @FXML
    private Label tokenLabel;

    private WebEngine engine;

    private String token;
    private Window window = Window.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine = vkView.getEngine();
        engine.load("https://oauth.vk.com/authorize?client_id=5851903&display=mobile&redirect_uri=http://api.vk.com/blank.html&scope=audio&response_type=code&v=5.62");
        engine.getLoadWorker().stateProperty().addListener((observable, oldValue, newValue) -> {
            if (Worker.State.SUCCEEDED.equals(newValue) && engine.getLocation().contains("code=")) {
                token = engine.getLocation().split("code=")[1];
                tokenLabel.setText(token);
            }
        });
    }

    public void close(){
        if(token == null){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Token is undefined");
            alert.setContentText("Are you sure you want to quit?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                window.getStage("Login").close();
            } else {
            }
        } else
            window.getStage("Login").close();
    }
}
