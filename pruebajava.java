/*
 Decalar cuatro variables de tipo A,B,C y D. Asignarles valores diferentes a cada uno.
 Realizar operaciones necesarias para que B=C,C=A,A=D,D=B.
 */
package test;

/**

a=d
c=a
b=c
d=b
 */
public class pruebajava {
    public static void main(String[] args) {
    int A,B,C,D,aux;
    A=1;
    B=2;
    C=3;
    D=4;
        System.out.println("A= "+A+ " B = "+B+" C= "+C+ " D = "+D);
        
    aux=A;
    A=D;   
    D=B;    
    B=C;
    C=aux;
    
    System.out.println("A= "+A+ " B = "+B+" C= "+C+ " D = "+D);
    
    System.out.println("A = "+A);    
    System.out.println("B = "+B);
    System.out.println("C = "+C);
    System.out.println("D = "+D);
    
    
       
    }


    
}
