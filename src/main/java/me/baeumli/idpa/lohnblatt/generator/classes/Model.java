/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.baeumli.idpa.lohnblatt.generator.classes;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author LucaE
 */
public class Model {
    private final double ALV = 0.011;
    private final double AHV_IV_EO = 0.05125;
    private final double koordinationsAbzug = 24675;
    private double bvg = 0.07;
    
    private ArrayList<Child> kinder = new ArrayList<>();
    private double bruttoLohn;
    private double UVG, NBU, BU;
    
    
    //Setter
    public void newChild(int age, String deployment){
        kinder.add(new Child(age, deployment));
    }
    
    public void setUVG(double UVG) {
        this.UVG = UVG;
    }

    public void setNBU(double NBU) {
        this.NBU = NBU;
    }
 
    public void setBU(double BU) {
        this.BU = BU;
    }
    
    //Getter
    public ArrayList<Child> getKinder(){
        return kinder;
    }

    public BigDecimal getBruttolohn() {
        return BigDecimal.valueOf(bruttoLohn);
    }

    public BigDecimal getUVG() {
        return BigDecimal.valueOf(UVG);
    }

    public BigDecimal getNBU() {
        return BigDecimal.valueOf(NBU);
    }

    public BigDecimal getBU() {
        return BigDecimal.valueOf(BU);
    }

    public BigDecimal getALV(){
        return BigDecimal.valueOf(ALV);
    }
    
    public BigDecimal getAHV_IV_EO(){
        return BigDecimal.valueOf(AHV_IV_EO);
    }
    
    public BigDecimal getBVG(){
        return BigDecimal.valueOf(bvg);
    }
    
    public BigDecimal getKoordinationsabzug(){
        return BigDecimal.valueOf(koordinationsAbzug);
    }

    public void setBruttoLohn(double bruttoLohn) {
        this.bruttoLohn = bruttoLohn;
    }
    
    
}
