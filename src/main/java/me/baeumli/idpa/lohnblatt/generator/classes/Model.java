/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.baeumli.idpa.lohnblatt.generator.classes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LucaE
 */
public class Model {
    private final double ALV = 0.011;
    private final double AHV_IV_EO = 0.05125;
    private final double koordinationsAbzug = 24675;
    private final double bvg = 0.07;
    
    private double bruttoLohn;
    private double UVG, NBU, BU;
    private String firstname;
    private String lastname;
    private String birthday;
    private String ahvNumber;
    
    public void setUVG(double UVG) {
        this.UVG = UVG / 100;
    }

    public void setNBU(double NBU) {
        this.NBU = NBU / 100;
    }
 
    public void setBU(double BU) {
        this.BU = BU / 100;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        this.birthday = birthday.format(formatter);
    }

    public String getAhvNumber() {
        return ahvNumber;
    }

    public void setAhvNumber(String ahvNumber) {
        this.ahvNumber = ahvNumber;
    }

    
    
    
}
