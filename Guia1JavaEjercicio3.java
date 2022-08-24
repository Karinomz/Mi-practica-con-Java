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
public class Guia1JavaEjercicio3 {
    
    public static void main (String [] args){
    Scanner frase = new Scanner(System.in);
    String palabra;   
    System.out.println("Por favor, ingrese una frase"); 
    palabra = frase.next();
    System.out.println("La frase en Mayusculas = " +palabra.toUpperCase());
    System.out.println("La frase en Minusculas = " +palabra.toLowerCase());
    
}
    
}
