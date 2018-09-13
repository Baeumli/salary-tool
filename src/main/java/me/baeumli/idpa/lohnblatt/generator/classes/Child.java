/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.baeumli.idpa.lohnblatt.generator.classes;

/**
 *
 * @author LucaE
 */
public class Child {

    private int childrenOver16;
    private int childrenUnder16;
    private int zulagen;

    public Child(int over16, int under16) {
        for (int i = 0; i < over16; i++) {
            this.zulagen += 250;
        }
        for (int i = 0; i < under16; i++) {
            this.zulagen += 200;
        }
    }

    public int getZulagen() {
        return zulagen;
    }

    public void setZulagen(int zulagen) {
        this.zulagen = zulagen;
    }

    
    
    
}
