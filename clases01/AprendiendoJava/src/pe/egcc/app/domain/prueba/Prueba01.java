/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.domain.prueba;

import pe.egcc.app.domain.Producto;

/**
 *
 * @author Rodil
 */
public class Prueba01 {
    public static void main(String[] args) {
       Producto pro =new Producto();
       pro.setCodigo(123);
       pro.setDescripcion("Mala bebida");
       pro.setNombre("Fanta");
       pro.setPrecio(2.0);
       pro.setStock(555);
       
        System.out.println("El codigo es "+pro.getCodigo());
        System.out.println("El nombre es "+pro.getNombre());
        System.out.println("El precio es "+pro.getPrecio());
        System.out.println("El stock es "+pro.getStock());
        System.out.println("La descripción  es "+pro.getDescripcion());
    }
    
    
}
