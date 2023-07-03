/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones4;


public class Excepciones4 {

    
    public static void main(String[] args) {
        try{
           int divison = miMetodo(10,0); 
            System.out.println("division");
        } catch (ArithmeticException n){
          System.out.println("Excepcion aritmectoca arrojada");
    }
    }
    
    public static int miMetodo(int a, int b) throws ArithmeticException{
        int c=a/b;
         return c;
    }
}
    
