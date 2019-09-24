package com.gluonhq.hello.views;

import com.gluonhq.charm.glisten.mvc.View;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ResourceBundle;

public class HelloPresenter {

    @FXML View pane;
    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private ResourceBundle resources;
    @FXML private Button RunSim, DisplayPanel;
    @FXML
    private void displayPanel() {
        RunSim.setDisable(true);
        DisplayPanel.setDisable(false); 
    }
    @FXML
    private void startSimulation() {
        DisplayPanel.setDisable(true); 
        RunSim.setDisable(false);
    }

    public void initialize() {
    }

}
