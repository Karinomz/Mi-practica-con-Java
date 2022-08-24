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
public class Guia1JavaEejercicio23 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int matriz[][],M,N,aux;
    int matrizt[][];
    M=4;
    N=M;
    
    matriz = new int [M][N];
    matrizt = new int [M][N];
   
    System.out.println("Matriz Original");
    System.out.println("");
    
    //Matriz Original
    for(int i=0 ; i<M ; i++){
        for(int j=0 ; j<N ; j++){
        Random MiAleatorio = new Random();
        
        int azar = MiAleatorio.nextInt(10);
            matriz[i][j]=azar;
            matrizt[j][i]=matriz[i][j];
            System.out.print("("+matriz[i][j]+") ");
        }
        System.out.println("");
        System.out.println("");
    }
    System.out.println("Matriz Transpuesta");
    System.out.println("");
    
        //Matriz Transpuesta
    for(int i=0 ; i<M ; i++){
        for(int j=0 ; j<N ; j++){
            
            System.out.print("("+matrizt[i][j]+") ");
        }
        System.out.println("");
        System.out.println("");
    }
 
    
    
    
    
    }   
}
