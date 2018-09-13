package me.baeumli.idpa.lohnblatt.generator;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import me.baeumli.idpa.lohnblatt.generator.classes.Calculator;
import me.baeumli.idpa.lohnblatt.generator.classes.Export;
import me.baeumli.idpa.lohnblatt.generator.classes.Model;
import me.baeumli.idpa.lohnblatt.generator.classes.HTML;

/**
 *
 * @author Baeumli
 */
public class Main_Controller implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private TabPane tabPane;
    @FXML
    private WebView webView;
    @FXML
    private TextField txtfieldAHV;
    @FXML
    private TextField txtfieldFirstname;
    @FXML
    private TextField txtfieldLastname;
    @FXML
    private DatePicker datepickerBirthday;
    @FXML
    private TextField txtfieldUVG;
    @FXML
    private TextField txtfieldWage;
    @FXML
    private TextField txtfieldNBU;
    @FXML
    private TextField txtfieldBU;
    @FXML
    private TextField txtfieldChildrenOver16;
    @FXML
    private TextField txtfieldChildrenUnder16;

    Model model;
    Calculator calculator;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    //Passes all the values to the model
    @FXML
    private void btnSubmitOnAction(ActionEvent event) {
        try {
            model = new Model();
            model.setMonatslohn(Double.parseDouble(txtfieldWage.getText()));
            model.setUVG(Double.parseDouble(txtfieldUVG.getText()));
            model.setBU(Double.parseDouble(txtfieldBU.getText()));
            model.setNBU(Double.parseDouble(txtfieldNBU.getText()));

            model.setFirstname(txtfieldFirstname.getText());
            model.setLastname(txtfieldLastname.getText());
            model.setAhvNumber(txtfieldAHV.getText());
            model.setBirthday(datepickerBirthday.getValue());
            model.setOver16(Integer.parseInt(txtfieldChildrenOver16.getText()));
            model.setUnder16(Integer.parseInt(txtfieldChildrenUnder16.getText()));
            calculator = new Calculator(model);

            HTML html = new HTML();
            WebEngine engine = webView.getEngine();
            engine.load(html.getContent());
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ein Fehler ist aufgetreten!");
            alert.setHeaderText("Verursacht durch:");
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            alert.setContentText(exceptionAsString);
            alert.show();
        }

    }

    @FXML
    private void btnPdfOnAction(ActionEvent event) {
        try {
            HTML html = new HTML();
            Export export = new Export();
            export.saveAsPdf(html.generateFile(calculator));
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Ein Fehler ist aufgetreten!");
            alert.setHeaderText("Verursacht durch:");
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            alert.setContentText(exceptionAsString);
            alert.show();
        }

    }
}
