/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1java;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Guia1JavaEejercicio22 {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num,n,dig1,dig2,dig3,dig4,dig5;
    
    Random MiAleatorio = new Random();
    

    dig1=0;
    dig2=0;
    dig3=0;      
    dig4=0;
    dig5=0;        
    System.out.print("Por favor, ingrese el tamaño del vector = ");
    n=leer.nextInt();
    int [] vector = new int [n];    
   
      for(int i=0 ; i< vector.length ; i++){
         int azar = MiAleatorio.nextInt(100000);
         System.out.print("Vector ["+i+"] = ");
         vector[i]=azar;
         System.out.println(vector[i]);
         // De 1 digito
         if(vector[i]>=0 && vector[i]<10){
            dig1=dig1+1;  
         }
         // De 2 digitos
         if(vector[i]>=10 && vector[i]<100){
            dig2=dig2+1;
         }
         // De 3 digitos
         if(vector[i]>=100 && vector[i]<1000){
            dig3=dig3+1;
         }
         // De 4 digitos
         if(vector[i]>=1000 && vector[i]<10000){
            dig4=dig4+1;
         }
         // De 5 digitos
         if(vector[i]>=10000 && vector[i]<100000){
            dig5=dig5+1;
         }
         
      } 
      System.out.println("La cantidad de numeros de un digito son = "+dig1);
      System.out.println("La cantidad de numeros de dos digitos son = "+dig2);
      System.out.println("La cantidad de numeros de tres digitos son = "+dig3);
      System.out.println("La cantidad de numeros de cuatro digitos son = "+dig4);
      System.out.println("La cantidad de numeros de cinco digitos son = "+dig5);
} 
}
