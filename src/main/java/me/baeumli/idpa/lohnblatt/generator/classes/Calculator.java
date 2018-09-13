/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.baeumli.idpa.lohnblatt.generator.classes;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import javafx.scene.control.Alert;

/**
 *
 * @author LucaE
 */
public class Calculator {

    private Model model;

    public Calculator(Model model) {
        this.model = model;
    }

    public double getNettolohn() {
        try {
            BigDecimal alv = BigDecimal.valueOf(getALV());
            BigDecimal ahv_iv_eo = BigDecimal.valueOf(getAbzugAHV());
            BigDecimal bvg = BigDecimal.valueOf(getAbzugBvg());
            BigDecimal nbu = BigDecimal.valueOf(getNBU());
            BigDecimal bu = BigDecimal.valueOf(getBU());
            BigDecimal uvg = BigDecimal.valueOf(getUVG());

            BigDecimal nettolohn = model.getMonatslohn();
            nettolohn = nettolohn.subtract(ahv_iv_eo);
            nettolohn = nettolohn.subtract(alv);
            nettolohn = nettolohn.subtract(bvg);
            nettolohn = nettolohn.subtract(nbu);
            nettolohn = nettolohn.subtract(bu);
            nettolohn = nettolohn.subtract(uvg);
            return nettolohn.doubleValue();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ein Fehler ist aufgetreten!");
            alert.setHeaderText("Verursacht durch:");
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            alert.setContentText(exceptionAsString);
        }
        return 0;
    }

    public double getPayout() {
        BigDecimal payout = BigDecimal.valueOf(getNettolohn());
        payout = payout.add(BigDecimal.valueOf(getZulagen()));
        return payout.doubleValue();
    }

    public double getALVPercentage() {
        BigDecimal alv = model.getALV().multiply(BigDecimal.valueOf(100));
        return alv.doubleValue();
    }

    public double getAHVPercentage() {
        BigDecimal ahv = model.getAHV_IV_EO().multiply(BigDecimal.valueOf(100));
        return ahv.doubleValue();
    }

    public double getBUPercentage() {
        BigDecimal bu = model.getBU().multiply(BigDecimal.valueOf(100));
        return bu.doubleValue();
    }

    public double getBVGPercentage() {
        BigDecimal bvg = model.getBVG().multiply(BigDecimal.valueOf(100));
        return bvg.doubleValue();
    }

    public double getNBUPercentage() {
        BigDecimal nbu = model.getNBU().multiply(BigDecimal.valueOf(100));
        return nbu.doubleValue();
    }

    public double getUVGPercentage() {
        BigDecimal uvg = model.getUVG().multiply(BigDecimal.valueOf(100));
        return uvg.doubleValue();
    }

    private double getVersicherterLohn() {
        if (model.getMonatslohn().compareTo(model.getKoordinationsabzug()) > 0) {
            BigDecimal vsLohn = model.getMonatslohn().subtract(model.getKoordinationsabzug());
            return vsLohn.doubleValue();
        }
        return 0;
    }

    public double getAbzugAHV() {
        BigDecimal ahvAbzug = model.getMonatslohn().multiply(model.getAHV_IV_EO());
        return ahvAbzug.doubleValue();
    }

    public double getAbzugBvg() {
        BigDecimal vsLohn = BigDecimal.valueOf(this.getVersicherterLohn());
        BigDecimal abzugBVG = vsLohn.multiply(model.getBVG());
        return abzugBVG.doubleValue();
    }

    public double getNBU() {
        BigDecimal nbu = model.getMonatslohn().multiply(model.getNBU());
        return nbu.doubleValue();
    }

    public double getBU() {
        BigDecimal bu = model.getMonatslohn().multiply(model.getBU());
        return bu.doubleValue();
    }

    public double getUVG() {
        BigDecimal uvg = model.getMonatslohn().multiply(model.getUVG());
        return uvg.doubleValue();
    }

    public double getALV() {
        BigDecimal alv = model.getMonatslohn().multiply(model.getALV());
        return alv.doubleValue();
    }

    public double getBruttolohn() {
        return model.getMonatslohn().doubleValue() + getZulagen();
    }

    public double getMonatslohn() {
        return model.getMonatslohn().doubleValue();
    }

    public double getZulagen() {
        int zulagen = 0;
        for (int i = 0; i < model.getOver16(); i++) {
            zulagen += 250;
        }
        for (int i = 0; i < model.getUnder16(); i++) {
            zulagen += 200;
        }
        return zulagen;
    }

}
