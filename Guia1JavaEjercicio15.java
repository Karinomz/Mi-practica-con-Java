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
public class Guia1JavaEjercicio15 {
  public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num1,aux,num2,opinion,suma,resta,multi,divi;

      
     do{ 
   
          System.out.println(" ");
          
          System.out.println("MENU");
          System.out.println("1. Sumar ");
          System.out.println("2. Restar ");
          System.out.println("3. Multiplicar ");
          System.out.println("4. Dividir ");
          System.out.println("5. Salir ");
         
          System.out.println(" ");
          
          System.out.print("Por favor, escoja una opcion: ");
          opinion=leer.nextInt();
    
 
          
            if (opinion>=1 && opinion<=4){ 
                
                System.out.print("Por favor, ingrese el primer numero: ");
                num1=leer.nextInt();
                System.out.print("Por favor, ingrese el segundo numero: ");
                num2=leer.nextInt();
          
            
                    if(opinion==1){
                        suma=num1+num2;
                        System.out.println("La suma del primer y segundo numero es = " +suma);
                    }
                    
                    if(opinion==2){
                        resta=num1-num2;
                        System.out.println("La resta del primer y segundo numero es = " +resta);
                    }
                  
                    if(opinion==3){
                        multi=num1*num2;
                        System.out.println("La multiplicacion del primer y segundo numero es = " +multi);
                    }
                  
                    if(opinion==4){
                        divi=num1/num2;
                        System.out.println("La division del primer y segundo numero es = " +divi);
                    }
                          
             
            } /** if **/
        
            if(opinion==5){
                System.out.println("Usted a seleccionado salir del menu.");
            }
            
           
        
        }while (opinion!=5);
      
      
      
  }
}


