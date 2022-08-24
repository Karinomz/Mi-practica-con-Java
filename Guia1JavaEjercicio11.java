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
public class Guia1JavaEjercicio11 {
      public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int opinion;
      System.out.println("Nuestra empresa tiene 4 tipos de bombas para motores");
      System.out.print("Por favor, ingrese del 1 al 4, que tipo de motor que desea consultar : ");
      opinion=leer.nextInt();
      
      if (opinion>=1 && opinion<=4){
          switch(opinion){
              case 1:
                  System.out.println("La bomba de este motor es una bomba de agua");
                  break;
              case 2:
                  System.out.println("La bomba de este motor es una bomba de gasolina");
                  break;
              case 3:
                  System.out.println("La bomba de este motor es una bomba de hormigon");
                  break;
              case 4:
                  System.out.println("La bomba de este motor es una bomba de pasta alimenticia");
                  break;
          }
          
      }else{
         System.out.println("No existe un valor valido para tipo de bomba"); }
      
      
      }    
}
