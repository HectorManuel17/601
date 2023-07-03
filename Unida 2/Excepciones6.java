package excepciones6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Excepciones6 {

    
    public static void main(String[] args) {
        try{
        String nombres []={"Flor","Juan","Maria","Lupita","Jose","Petra"};
        int posicion=Integer.parseInt(JOptionPane.showInputDialog("¿A que posicion quieres acceder?"));
        JOptionPane.showMessageDialog(null,"El nombre en la posicion "+posicion+" es "+nombres[posicion]);
        } catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"Indicice de arreglo invalido.");
        }
                
    }
    
    
}

