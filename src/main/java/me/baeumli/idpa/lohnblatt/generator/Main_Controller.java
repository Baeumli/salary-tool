package me.baeumli.idpa.lohnblatt.generator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebView;
import me.baeumli.idpa.lohnblatt.generator.classes.Model;

/**
 *
 * @author Baeumli
 */

public class Main_Controller implements Initializable {

    @FXML private AnchorPane rootPane;
    @FXML private TabPane tabPane;
    @FXML private WebView webView;
    @FXML private TextField txtfieldAHV;
    @FXML private TextField txtfieldFirstname;
    @FXML private TextField txtfieldLastname;
    @FXML private DatePicker datepickerBirthday;
    @FXML private TextField txtfieldUVG;
    @FXML private TextField txtfieldWage;
    @FXML private TextField txtfieldNBU;
    @FXML private TextField txtfieldBU;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    


    @FXML
    private void txtfieldAHVOnAction(ActionEvent event) {
    }

    @FXML
    private void btnSubmitOnAction(ActionEvent event) {
        Model model = new Model();
        
        model.setBruttoLohn(Double.parseDouble(txtfieldWage.getText()));
        model.setUVG(Double.parseDouble(txtfieldUVG.getText()));
        model.setBU(Double.parseDouble(txtfieldBU.getText()));
        model.setNBU(Double.parseDouble(txtfieldNBU.getText()));
    }
}
