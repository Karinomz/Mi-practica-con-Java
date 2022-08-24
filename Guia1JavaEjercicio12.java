/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1java;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Guia1JavaEjercicio12 {
      public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      int num;
      
      do {
        System.out.println("Por favor , ingrese un numero entre 0 y 10 : ");
        num=leer.nextInt();
        
        if (num >=0 && num <=10) {
          System.out.println("El numero a sido ingresado es correcto");  
        }
        
      } while ( num <0 || num >10);
       
       
      
      

       
      
      
      
       }
}
