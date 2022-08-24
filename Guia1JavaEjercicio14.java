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
public class Guia1JavaEjercicio14 {
      public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num,aux,num2;
      num2=0;   /* Contador */
      aux=0;    /* Suma auxiliar */
      
        do {
        System.out.print("Por favor , ingrese un numero (" +num2+ ") : ");
        num=leer.nextInt();
       
        if (num>0) {
        num=aux+num;
        aux=num;
        num2=num2+1;
        }
        
        if (num==0){
            System.out.println("Se capturo el numero cero");
            break;
        }
        
        
        }while (num2<20);
        
        if (num>0) {
        System.out.println("La suma de todos los numeros es : " +num);    
        }
      }
}
