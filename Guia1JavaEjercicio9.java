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
public class Guia1JavaEjercicio9 {
      public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String palabra;
      System.out.print("Por favor, ingrese la palabra clave : ");
      palabra=leer.next();
      int num;
      num=palabra.length();
      
      if (num==8){
          
          System.out.println("La palabra clave es correcta");
       
      }else {
         System.out.println("La palabra clave es incorrecta");         
                  } 
     }    
}
