/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gluonhq.hello;

import com.gluonhq.charm.glisten.mvc.View;
import java.io.IOException;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Susan
 */
public class Hellofxml extends View {
    public Hellofxml() {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloGluon.class.getResource("views/hello.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("com.gluonhq.hello.views.hello"));
        fxmlLoader.setRoot(this);     // use when fx:root not when View
        try {
            fxmlLoader.load();
            } catch (IOException e) {
                System.err.println(e.getMessage()); 
                System.err.println("Caused by . . ." + e.toString()); 
            }
         
    }
}
