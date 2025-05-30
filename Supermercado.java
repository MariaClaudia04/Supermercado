/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author claudia
 */
public class Supermercado {
    public static void main(String[] args) {
         
        Producto leche = new Producto("Leche", 1.50, 1000);
        Producto pan = new Producto("Pan", 0.80, 700);
        Producto huevos = new Producto("Huevos", 2.00, 1200);
        Producto queso = new Producto("Queso", 3.00, 1500);
        Producto manzana = new Producto("Manzana", 0.50, 500);
        Producto carne = new Producto("Carne", 5.00, 2000);
        
        List<Producto> productosCliente1 = new ArrayList<>();
        productosCliente1.add(leche);
        productosCliente1.add(pan);
        productosCliente1.add(manzana);
        List<Producto> productosCliente2 = new ArrayList<>();
        productosCliente2.add(huevos);
        productosCliente2.add(queso);
        List<Producto> productosCliente3 = new ArrayList<>();
        productosCliente3.add(carne);
        productosCliente3.add(manzana);
        productosCliente3.add(pan);
        
         
        Cliente cliente1 = new Cliente("Cliente 1", productosCliente1);
        Cliente cliente2 = new Cliente("Cliente 2", productosCliente2);
        Cliente cliente3 = new Cliente("Cliente 3", productosCliente3);
        
        Cajera cajera1 = new Cajera("Sandra", cliente1);
        Cajera cajera2 = new Cajera("Martha", cliente2);
        Cajera cajera3 = new Cajera("Ana", cliente3);
        
        long tiempoTotalSimulacionInicio = System.currentTimeMillis();
        cajera1.start();
        cajera2.start();
        cajera3.start();
        try {

            cajera1.join();
            cajera2.join();
            cajera3.join();
        } catch (InterruptedException e) {
            System.out.println("Error en la simulación de cobro.");
        }
        long tiempoTotalSimulacionFin = System.currentTimeMillis();
        long tiempoTotalSimulacion = tiempoTotalSimulacionFin - tiempoTotalSimulacionInicio;
        System.out.println("Todos los cobros han sido procesados.");
        System.out.println("Tiempo total de cobro para todas las compras: " + tiempoTotalSimulacion + " ms");
    }
}



