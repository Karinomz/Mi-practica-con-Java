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
public class Guia1JavaEejercicio24 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int matriz[][],M,N,aux1,aux2;
    int matrizt[][];
    int matriza[][];
    System.out.print("Ingrese el tamaño de la matriz cuadrada : ");
    M=leer.nextInt();
    N=M;
    aux1=0;
    aux2=0;
    matriz = new int [M][N];
    matrizt = new int [M][N];
    matriza = new int [M][N];
   
    System.out.println("");
    //Matriz Original
    for(int i=0 ; i<M ; i++){
        for(int j=0 ; j<N ; j++){
        System.out.print("Elemento ("+i+")("+j+") = ");
            matriz[i][j]=leer.nextInt();
            matrizt[j][i]=matriz[i][j];
            //** Esta variable era de prueba**//
            //matriza[j][i]=(matriz[i][j]*(-1));
            aux1=aux1+1;
            if((matrizt[i][j])==(matriz[i][j])*(-1) || (matrizt[i][j]==0)){
                aux2=aux2+1;
            }
        }
    }
    System.out.println("");
    System.out.println("Matriz Original");
    System.out.println("");
    
     for(int i=0 ; i<M ; i++){
        for(int j=0 ; j<N ; j++){
        
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
    
    //Matriz Anti Asimetrica
    //System.out.println("Matriz si fuera Asimetrica ");
    //System.out.println("");
    //for(int i=0 ; i<M ; i++){
    //    for(int j=0 ; j<N ; j++){
    //        
    //        System.out.print("("+matriza[i][j]+") ");
    //   }
    //    System.out.println("");
    //    System.out.println("");
    //}
    
    //cantidad de elementos
    System.out.println("Cantidad de elementos = "+aux1);
    
    //elementos anti simetricos 
    System.out.println("Cantidad de elementos Anti simetricos = "+aux2);
    
    if(aux1==aux2){
        System.out.println("Esta matriz es Anti Simetrica");
    }else{
        System.out.println("Esta matriz no es Anti Simetrica");
    }
 
    }
}
