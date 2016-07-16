/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.tarea1.prueba;

import pe.egcc.tarea1.service.MateService;

/**
 *
 * @author Rodil
 */
public class Prueba02 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        MateService service=new MateService();
        int suma=service.suma(n1, n2);
        int multiplicacion=service.suma(n1, n2);
        int resta=service.suma(n1, n2);
        double division=service.suma(n1, n2);
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicación es "+multiplicacion);
        System.out.println("La  división es "+division);
        
    }
       
            
}
