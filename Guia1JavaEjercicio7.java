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
public class Guia1JavaEjercicio7 {
      public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num;
      System.out.print("Por favor, ingrese un numero para determinar si es par o impar : ");
      num=leer.nextInt();
      
      if (num % 2 ==0 ){
          
          System.out.println(num+" es un numero par");
       
      }else {
         System.out.println(num+" es un numero impar");         
                  } 
      
    }    
 }
