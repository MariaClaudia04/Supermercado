/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

import java.util.List;

/**
 *
 * @author claudia
 */
public class Cajera extends Thread {
  
    private String nombre;
    private Cliente cliente;
    public Cajera(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }
    @Override
    public void run() {
        procesarCompra();
    }
    private void procesarCompra() {
        System.out.println("La cajera " + nombre + " comienza a procesar la compra del cliente " + cliente.getNombre());
        double totalCompra = 0;
        long tiempoInicio = System.currentTimeMillis();
        List<Producto> productos = cliente.getProductos();
         for (Producto producto : productos) {
            System.out.println("Procesando producto: " + producto.getNombre() + " - Costo: $" + producto.getCosto());
            try {
                Thread.sleep(producto.getTiempoProcesamiento());
            } catch (InterruptedException e) {
                System.out.println("Error en el procesamiento del producto " + producto.getNombre());
            }
            totalCompra += producto.getCosto();
            System.out.println("Producto procesado: " + producto.getNombre() + " en " + producto.getTiempoProcesamiento() + " ms");
        }
        long tiempoFin = System.currentTimeMillis();
        long tiempoTotal = tiempoFin - tiempoInicio;
        System.out.println("La cajera " + nombre + " terminó de procesar la compra del cliente " + cliente.getNombre());
        System.out.printf("Total a pagar: $%.2f\n", totalCompra);
        System.out.println("Tiempo total de procesamiento para este cliente: " + tiempoTotal + " ms");
        System.out.println("------------------------------------------------------");
    }
  }

  
