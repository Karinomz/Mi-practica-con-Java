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
public class Guia1JavaEjercicio17 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num,aux,cont;
    System.out.print("Por favor, ingrese un numero: ");
    num=leer.nextInt();
    
    
        if (num>0 && num<=25) {

            // Linea Superior
            for(int i=0 ; i<num ; i++) {
                System.out.print("*");

            }

            System.out.println(" ");
            
            //Centro
            for(int i=0 ; i<num-2 ; i++) {
                System.out.print("*");
                for(int j=0 ; j<num-2 ; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            
            
            //Linea Inferior
            for(int i=0 ; i<num ; i++) {
                System.out.print("*");

            }

            System.out.println(" ");
                
        }else {
            System.out.println("Por favor , escoja un numero mas chico ");
        }
    
    }
}
