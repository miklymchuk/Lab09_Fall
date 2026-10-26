/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab09_fall;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
/**
 * FXML Controller class
 *
 * @author 6312398
 */
public class PrimaryController implements Initializable {


    @FXML
    private GridPane root;
    @FXML
    private Circle colourCircle;
    @FXML
    private Rectangle colourRectangle;
    @FXML
    private Slider redSlider;
    @FXML
    private Slider greenSlider;
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider alphaSlider;
    @FXML
    private Label redSliderLabel;
    @FXML
    private Label greenSliderLabel;
    @FXML
    private Label blueSliderLabel;
    @FXML
    private Label alphaSliderLabel;
    @FXML
    private TextField redSliderValue;
    @FXML
    private TextField greenSliderValue;
    @FXML
    private TextField blueSliderValue;
    @FXML
    private TextField alphaSliderValue;
    
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
