
import javax.swing.JOptionPane;


public class HolaMundo {
    public static void main(String args[]){
        String sujeto = JOptionPane.showInputDialog("Put your name: ");
        saludar(sujeto);
    }

    /**
     * Función que muestra un mensaje de dialogo con un saludo de acuerdo al parámetro
     * recibido
     *
     * @param nombre
     */
    public static void saludar(String nombre){
        JOptionPane.showMessageDialog(null, "Hi "+nombre , "Greetings", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void decirWara(String nombre){
        JOptionPane.showMessageDialog(null, "Wara "+nombre , "Keloke", JOptionPane.INFORMATION_MESSAGE);
    }

}
