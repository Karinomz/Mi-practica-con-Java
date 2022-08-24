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
public class Guia1JavaEjercicio13 {
      public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num,aux,num2;
      System.out.println("Por favor , ingrese un numero  : ");
      num=leer.nextInt();
      num2=num;
      aux=0;
      
    if (num>0) {
      System.out.println("El numero es correcto");
        do {
        System.out.println("Por favor , ingrese un numero : ");
        num=leer.nextInt();
        num=aux+num;
        aux=num;
        
        }while (num<=num2);
    }else {
        System.out.println("El numero es incorrecto. Por favor, ingrese numeros positivos");
          } 
      }
}
