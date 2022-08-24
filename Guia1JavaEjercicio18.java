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
public class Guia1JavaEjercicio18 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num,aux,cont;
    System.out.print("Por favor, ingrese un numero entre 1 y 20 : ");
    num=leer.nextInt();
    
    
        if (num>=1 && num<=20) {
        System.out.print(num+" ");
            for(int i=1 ; i<=num ; i++) {
                System.out.print("*");
        }
        
        }else {
            System.out.println("El numero ingresado no esta entre los parametros");
        }   
    
        System.out.println(" ");
    
    } 
}
