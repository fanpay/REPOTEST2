
import javax.swing.JOptionPane;


public class HolaMundo {
    public static void main(String args[]){
        String sujeto = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        saludar(sujeto);
    }
    
    /**
     * Función que muestra un mensaje de dialogo con un saludo de acuerdo al parámetro
     * recibido
     * 
     * @param nombre 
     */
    public static void saludar(String nombre){
        JOptionPane.showMessageDialog(null, "Hola "+nombre , "Saludo", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
