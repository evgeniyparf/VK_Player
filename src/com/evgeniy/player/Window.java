package com.evgeniy.player;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class Window {

    private static Window instance;
    private HashMap<String, Stage> stages = new HashMap<>();

    private Window(){
    }

    public static Window getInstance(){
        if(instance == null)
            instance = new Window();
        return instance;
    }

    public void create(String fxml, String title, int width, int height){
        Stage stage = new Stage();
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("View/" + fxml + ".fxml"));
            stage.setScene(new Scene(parent, width, height));
            stage.setTitle(title);
            stages.put(title, stage);
            stage.show();
        } catch (IOException ioe){
            System.out.println("File not found exception");
        }
    }

    public HashMap<String, Stage> getStages(){
        return stages;
    }

    public Stage getStage(String title){
            return stages.get(title);
    }
}
