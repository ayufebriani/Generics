/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.generics;

/**
 *
 * @author ASUS
 */
public class Planet {
     private String name;
    private double mass;
    
    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    public void print() {
        System.out.println("Planet " + name + ", mass: " + mass);
    }
}
