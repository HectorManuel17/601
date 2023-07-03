/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

import javax.swing.JOptionPane;

public class Excepciones2 {


    public static void main(String[] args) {
   int x,y;
      try{
      x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero1;", "Solicito datos", 3));
      y=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero1;", "Solicito datos", 3));
      JOptionPane.showMessageDialog(null,"La division de "+x+"/"+y+" es "+(x/y),"Mostrado resu;tado",1);
      } catch (NumberFormatException n){
          System.out.println(n.getMessage()+" No es un numero entero");
      } catch (ArithmeticException n){
          System.out.println(n.getMessage()+" No se puede dividir entre 0");  
      }
    }
    
}
