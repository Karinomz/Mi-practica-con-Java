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
public class Guia1JavaEjercicio10 {
      public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String palabra,veri,a;
      System.out.print("Por favor, ingrese la palabra clave : ");
      palabra=leer.next();
      veri= palabra.substring(0, 1);
      a="a";
      
      
 
      if (a.equals(veri)){
          
            System.out.println("La palabra clave es correcta");
       
      }else {
            System.out.println("La palabra clave es incorrecta");         
                  } 
     }  
}
