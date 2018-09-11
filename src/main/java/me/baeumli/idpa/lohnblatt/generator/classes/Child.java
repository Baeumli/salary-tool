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

    private int age;
    private int childAllowance;

    public Child(int age, String employment) {
        if (age > 16) {
            switch (employment) {
                case "student":
                    childAllowance = 200;
                case "employed":
                    childAllowance = 0;
                case "inEducation":
                    childAllowance = 250;
            }
        }else{
            childAllowance = 200;
        }
    }

    public int getAge() {
        return age;
    }

    public int getZulage() {
        return childAllowance;
    }
}
