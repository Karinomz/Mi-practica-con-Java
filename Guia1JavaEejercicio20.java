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
public class Guia1JavaEejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int[] vector = new int[100];
        num = 100;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("vector [" + i + "] = ");
            vector[i] = num;
            System.out.println(vector[i]);
            num = num - 1;
        }

    }
}
