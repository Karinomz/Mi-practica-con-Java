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
public class Guia1javaEjercicio4 {
    
    public static void main (String [] args){
    int c , f;
    Scanner leer = new Scanner (System.in);
    System.out.println("Por favor, ingrese la temperatura en grados centigrados: ");
    c=leer.nextInt();
    
    f= 32 + (9*c/5);
    
    System.out.println("La temperatura en grados Fahrenheit es de " +f);
    
    }
    
}
