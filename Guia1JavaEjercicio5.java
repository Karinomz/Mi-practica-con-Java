/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
 el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 Math.sqrt().
 * 
 * 
 */
package guia1java;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Guia1JavaEjercicio5 {
    
    public static void main(String[] args){
    int num;
    double doble,triple,raiz;
    Scanner leer = new Scanner(System.in);
    System.out.println("Por favor, ingrese un numero");
    num=leer.nextInt();
    
    doble= num*2;
    triple=num*3;
    raiz=Math.sqrt(num);
    
    System.out.println("El doble de " +num+ " es = " +doble);
    System.out.println("El triple de " +num+ " es = " +triple);
    System.out.println("La raiz de " +num+ " es = " +raiz);
    
    
    }
    
    
}
