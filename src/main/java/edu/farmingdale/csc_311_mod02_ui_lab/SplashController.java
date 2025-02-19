package edu.farmingdale.csc_311_mod02_ui_lab;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class SplashController {

    @FXML
    void moveNewWindow(MouseEvent event) throws IOException {
        //Capture the scene that the controller is for
        Scene scene = ((ProgressBar)event.getSource()).getParent().getScene();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login-view.fxml"));

        scene.setRoot(fxmlLoader.load());

    }
}