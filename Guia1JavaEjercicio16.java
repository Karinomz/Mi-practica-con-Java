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
public class Guia1JavaEjercicio16 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num,aux,cont,i,j;
    String palabra,primeraletra,ultimaletra;
    cont=0;   /* Contador */
    aux=0;    /* Suma auxiliar */
    i=0;
    j=0;
      
    do{  
        System.out.print("Por favor, ingrese el programa en formato FDE : "); 
        palabra=leer.next();
        primeraletra= palabra.substring(0, 1);
        ultimaletra= palabra.substring(4, 5);
        num=palabra.length();

        if(num==5){ 

            if ("&&&&&".equals(palabra)){
            System.out.println("Se ha cerrado sesion"); 
            break;
            }
            
            if("x".equals(primeraletra) && "o".equals(ultimaletra)){
               System.out.println("Formato correcto"); 
               cont=cont+1; 
            }else{
            System.out.println("Formato incorrecto");
            aux=aux+1; 
            }
        }
    
        if(num!=5){
            
               System.out.println("Formato incorrecto");
               aux=aux+1;
        }   
  
            
  
        
     
    }while (!"&&&&&".equals(palabra));
    
    System.out.println("Cantidad de Formatos correctos = " +cont);
      
    System.out.println("Cantidad de Formatos incorrectos = " +aux); 
      
    
    }
}
