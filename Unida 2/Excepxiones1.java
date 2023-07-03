/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepxiones1;

import javax.swing.JOptionPane;
public class Excepxiones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int x,y;
      try{
      x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero1;", "Solicito datos", 3));
      } catch (NumberFormatException n){
          System.out.println(n.getMessage()+" No es un numero entero");
      }
      
    }
    
}
