
package excepciones11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Excepciones11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
			Scanner scanner = new Scanner(new File("sample.txt"));

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"Archivo no encontrado.");
		}
    }
    
}
