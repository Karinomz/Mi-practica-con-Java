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
public class Guia1JavaEjercicio6 {
    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num1,num2;
      System.out.println ("Por favor, ingrese el primer numero Aqui");
      num1=leer.nextInt();
      System.out.println ("Por favor, ingrese el segundo numero Aqui");
      num2=leer.nextInt();
      
      if (num1 > num2){
        System.out.println ("El primer numero ("+num1+") es mayor al segundo ("+num2+")");
              
      }
       if (num2 > num1){
        System.out.println ("El segundo numero ("+num2+") es mayor al primero ("+num1+")");
              
      }
    }
}