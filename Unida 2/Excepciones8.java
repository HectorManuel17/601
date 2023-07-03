
package excepciones8;

import javax.swing.JOptionPane;


public class Excepciones8 {

   
    public static void main(String[] args) {
        try {
      Class.forName("com.journaldev.MyInvisibleClass");

      ClassLoader.getSystemClassLoader().loadClass("com.journaldev.MyInvisibleClass");

      ClassLoader.getPlatformClassLoader().loadClass("com.journaldev.MyInvisibleClass");
    } catch (ClassNotFoundException e) {
      JOptionPane.showMessageDialog(null,"No se ha encontrado ninguna clase.");
    }
    }
    
}
