/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.baeumli.idpa.lohnblatt.generator.classes;

import java.io.PrintWriter;
import java.io.StringWriter;
import javafx.scene.control.Alert;

/**
 *
 * @author Baeumli
 */
public class HTML {

    private String content;

    public String generateFile(Calculator calc) {
        try {
            double abzugTotal = calc.getALV() + calc.getAbzugAHV() + calc.getAbzugBvg() + calc.getBU() + calc.getNBU() + calc.getUVG();

            //HTML boilerplate
            
            content = "<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "<head>\n"
                    + "    <style>\n"
                    + "        .header {\n"
                    + "            font-size: 20px;\n"
                    + "            font-weight: bold;\n"
                    + "        }\n"
                    + "    </style>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "    <h1>Lohnblatt</h1>\n"
                    + "    <table style=\"width:100%\">\n"
                    + "        <tr align=\"left\">\n"
                    + "            <th>Bezeichnung</th>\n"
                    + "            <th>Prozentsatz</th>\n"
                    + "            <th>Basis</th>\n"
                    + "            <th>Betrag</th>\n"
                    + "            <th>Total</th>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td class=\"header\">Lohnarten</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td>Monatslohn</td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td>" + calc.getMonatslohn() + "</td>\n"
                    + "            <td></td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td>Kinderzulagen</td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td>" + calc.getZulagen() + "</td>\n"
                    + "            <td></td>\n"
                    + "        </tr>\n"
                    + "        <tr class=\"header\">\n"
                    + "            <td>Bruttolohn</td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td>" + calc.getBruttolohn() + "</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td class=\"header\">Abzugsarten</td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td>AHV/IV/EO</td>\n"
                    + "            <td>" + calc.getAHVPercentage() + "% von</td>\n"
                    + "            <td>" + calc.getMonatslohn() + "</td>\n"
                    + "            <td>" + calc.getAbzugAHV() + "</td>\n"
                    + "            <td></td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td>ALV</td>\n"
                    + "            <td>" + calc.getALVPercentage() + "% von</td>\n"
                    + "            <td>" + calc.getMonatslohn() + "</td>\n"
                    + "            <td>" + calc.getALV() + "</td>\n"
                    + "            <td></td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td>NBU</td>\n"
                    + "            <td>" + calc.getNBUPercentage() + "% von</td>\n"
                    + "            <td>" + calc.getMonatslohn() + "</td>\n"
                    + "            <td>" + calc.getNBU() + "</td>\n"
                    + "            <td></td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td>BU</td>\n"
                    + "            <td>" + calc.getBUPercentage() + "% von</td>\n"
                    + "            <td>" + calc.getMonatslohn() + "</td>\n"
                    + "            <td>" + calc.getBU() + "</td>\n"
                    + "            <td></td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td>UVG</td>\n"
                    + "            <td>" + calc.getUVGPercentage() + "% von</td>\n"
                    + "            <td>" + calc.getMonatslohn() + "</td>\n"
                    + "            <td>" + calc.getUVG() + "</td>\n"
                    + "            <td></td>\n"
                    + "        </tr>\n"
                    + "        <tr>\n"
                    + "            <td>Pensionskasse</td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td>" + calc.getAbzugBvg() + "</td>\n"
                    + "            <td></td>\n"
                    + "        </tr>\n"
                    + "        <tr style=\"width: px;\">\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td style=\"font-weight: bold;\">" + abzugTotal + "</td>\n"
                    + "        </tr>\n"
                    + "        <tr class=\"header\">\n"
                    + "            <td>Nettolohn</td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td>" + calc.getNettolohn() + "</td>\n"
                    + "        </tr>\n"
                    + "        <tr class=\"header\">\n"
                    + "                <td>Auszahlung</td>\n"
                    + "                <td></td>\n"
                    + "                <td></td>\n"
                    + "                <td></td>\n"
                    + "                <td>" + calc.getPayout() + "</td>\n"
                    + "            </tr>\n"
                    + "    </table>\n"
                    + "</body>\n"
                    + "</html>";

            return content;
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ein Fehler ist aufgetreten!");
            alert.setHeaderText("Verursacht durch:");
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            alert.setContentText(exceptionAsString);
        }
        return null;
    }

    public String getContent() {
        return content;
    }

}
