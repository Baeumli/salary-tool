/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.baeumli.idpa.lohnblatt.generator.classes;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;

/**
 *
 * @author Baeumli
 */
public class Export {

    
    //Using iText Library to generate PDF from HTML
    public void saveAsPdf(String content) {
        try {

        } catch (Exception e) {
        }
        final Document doc = new Document();

        FileChooser fc = new FileChooser();
        fc.setTitle("Save to...");
        fc.setInitialFileName("Offer.pdf");
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PDF", "*.pdf"));
        File file = fc.showSaveDialog(null);
        if (file != null) {
            try {
                PdfWriter pdfWriter = PdfWriter.getInstance(doc, new FileOutputStream(file));
                doc.open();
                //Add pdf content here
                XMLWorkerHelper worker = XMLWorkerHelper.getInstance();

                worker.parseXHtml(pdfWriter, doc, new StringReader(content));

                doc.close();
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
    }

}
