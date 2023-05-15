/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos5y3;

import java.util.Scanner;

/**
 *
 * @author Hector Manuel
 */
public class Multiplos5y3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
    int a,c,d;
        System.out.println("Dame un numero");
        a=leer.nextInt();
        c=a%3;
        d=a%5;
        
        if(d==0 && c==0){
            System.out.println("");
            System.out.println("TriFiv");
        }
        else if(c==0){
            System.out.println("");
            System.out.println("Tri");
        }
        else if(d==0){
            System.out.println("");
            System.out.println("Fiv");
        }
        else{
            System.out.println("");
            System.out.println("No es multiplo de 3 o 5");
        }
    }
    
}
