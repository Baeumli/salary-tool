/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.baeumli.idpa.lohnblatt.generator.classes;

import java.math.BigDecimal;

/**
 *
 * @author LucaE
 */

public class Calculator {
    private Model model = new Model();
    
    private double getNettolohn(){
        BigDecimal alv = BigDecimal.valueOf(this.getALV());
        BigDecimal ahv_iv_eo = BigDecimal.valueOf(this.getAbzugAHV());
        BigDecimal bvg = BigDecimal.valueOf(this.getAbzugBvg());
        BigDecimal nbu = BigDecimal.valueOf(this.getNBU());
        BigDecimal bu = BigDecimal.valueOf(this.getBU());
        BigDecimal uvg = BigDecimal.valueOf(this.getUVG());
        
        BigDecimal nettolohn = alv.subtract(ahv_iv_eo);
        nettolohn.subtract(bvg);
        nettolohn.subtract(nbu);
        nettolohn.subtract(bu);
        nettolohn.subtract(uvg);
        return nettolohn.doubleValue();
    }
    
    private double getVersicherterLohn(){
        BigDecimal vsLohn = model.getBruttolohn().subtract(model.getKoordinationsabzug());
        return vsLohn.doubleValue();
    }
    
    public double getAbzugAHV(){
        BigDecimal ahvAbzug = model.getBruttolohn().multiply(model.getAHV_IV_EO());
        return ahvAbzug.doubleValue();
    }
    
    public double getAbzugBvg(){
        BigDecimal vsLohn = BigDecimal.valueOf(this.getVersicherterLohn());
        BigDecimal abzugBVG = vsLohn.multiply(model.getBVG());
        return abzugBVG.doubleValue();
    }
    
    public double getNBU(){
        BigDecimal nbu = model.getBruttolohn().multiply(model.getNBU());
        return nbu.doubleValue();
    }
    
    public double getBU(){
        BigDecimal bu = model.getBruttolohn().multiply(model.getBU());
        return bu.doubleValue();
    }
    
    public double getUVG(){
        BigDecimal uvg = model.getBruttolohn().multiply(model.getUVG());
        return uvg.doubleValue();
    }
    
    public double getALV(){
        BigDecimal alv = model.getBruttolohn().multiply(model.getALV());
        return alv.doubleValue();
    }
    
    public double getKinderzulage(){
        int output = 0;
        for(Child c : model.getKinder()){
            output += c.getZulage();
        }
        return output;
    }
    
    public double getBruttolohn(){
        return model.getBruttolohn().doubleValue();
    }
}
