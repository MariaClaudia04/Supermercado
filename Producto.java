/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

/**
 *
 * @author claudia
 */

import java.util.ArrayList;
import java.util.List;

  public class Producto {
       private String nombre;
    private double costo;
    private int tiempoProcesamiento; 
    public Producto(String nombre, double costo, int tiempoProcesamiento) {
        this.nombre = nombre;
        this.costo = costo;
        this.tiempoProcesamiento = tiempoProcesamiento;
    }
    public String getNombre() {
        return nombre;
    }
    public double getCosto() {
        return costo;
    }
    public int getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }
  }
  
    


