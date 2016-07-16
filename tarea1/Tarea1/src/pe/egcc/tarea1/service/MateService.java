/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.tarea1.service;

/**
 *
 * @author Rodil
 */
public class MateService {
   public int suma(int n1,int n2){
   return (n1+n2);
   } 
   public int multiplicacion(int n1,int n2){
        return (n1*n2);
   }
   public double division(int n1, int n2){
       double p = 0;
   if(n2!=0){
   p=n2;
   }
   
     return (n1/p);
   
   }
   public int resta(int n1, int n2){
   return (n1-n2);
   }
}
