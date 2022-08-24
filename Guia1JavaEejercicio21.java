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
public class Guia1JavaEejercicio21 {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num,n;
    int azar = 0;
   
    System.out.print("Por favor, ingrese el tamaño del vector = ");
    n=leer.nextInt();
    int [] vector = new int [n];    
   
      for(int i=0 ; i< vector.length ; i++){
         azar= (int) (Math.random()*100);
         System.out.print("Vector ["+i+"] = ");
         vector[i]=azar;
         System.out.println(vector[i]);  
     } 
    int i = 0;
    System.out.print("Que numero desea buscar? = ");
    num=leer.nextInt();
    
    while(i<n && vector[i]!=num){
        i++;
    }

    
    if(i==n){
        System.out.println("El numero que ingreso , no se encuentra en el vector");
    }else
        if(vector[i]==num){
            System.out.println("El numero (" +num+ ") a buscar se encuentra en el vector ["+i+"] ");
        }else{
            System.out.println("El numero que ingreso , no se encuentra en el vector");
        }
    
}
    
    
}
