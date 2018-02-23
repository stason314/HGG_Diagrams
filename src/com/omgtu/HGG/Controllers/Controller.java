package com.omgtu.HGG.Controllers;

import com.omgtu.HGG.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public AnchorPane leftPane;
    public AnchorPane test;


    public Controller() {

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        test = getLeftBar();
    }

    public AnchorPane getLeftBar() {
        AnchorPane leftBar = null;
        try {
            // Загружаем сведения об адресатах.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Views/MainScene.fxml"));
            leftBar = loader.load();
            //rootLayout.setLeft(leftBar);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return leftBar;
    }

    public void testAction(ActionEvent actionEvent) {
        leftPane = getLeftBar();
        System.out.println(getLeftBar());
    }
}
