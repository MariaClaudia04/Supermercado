/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author claudia
 */
public class Cliente {
     
     private String nombre;
private List<Producto> productos;
    public Cliente(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public String getNombre() {
        return nombre;
    }
}
  

    

