package me.baeumli.idpa.lohnblatt.generator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebView;

public class Main_Controller implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private TabPane tabPane;
    @FXML
    private WebView webView;
    @FXML
    private TextField txtfieldAHV;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void btnPersonOnAction(ActionEvent event) {
    }

    @FXML
    private void txtfieldAHVOnAction(ActionEvent event) {
    }
}
