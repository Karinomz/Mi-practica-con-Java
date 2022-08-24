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
public class Guia1JavaEejercicio19 {
    public static void main(String [] args){
    Scanner leer = new Scanner(System.in);
    double euro, libra, dolar , yen ;
    System.out.print("Por favor, ingrese la cantidad de euros : ");
    euro=leer.nextInt();

    libra=0.86*euro;
    dolar=1.28611*euro;
    yen=129.852*euro;
 
    System.out.println("Libras = " +libra+ " Dolares = " +dolar+ " Yenes = " +yen);
        
        
        
    }  
    
}
