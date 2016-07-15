/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app01.prueba;

import pe.egcc.app001.service.MateService;

/**
 *
 * @author Alumno
 */
public class prueba01 {
   

    public static void main(String[] args) {
        int n1=5;
        int n2=7;
        
        MateService service =new MateService();
       int suma=service.sumar(n1,n2);
       int prod=service.multiplicar(n1,n2);
        
        
        System.out.println("La suma es "+ suma);
        System.out.println("La multiplicacion es "+ prod);
        
    }
    
}
