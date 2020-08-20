
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
    JOptionPane.showMessageDialog(null, "CHAO"+nombre+"");
    
    }

    public static void decirHola(String nombre){
        JOptionPane.showMessageDialog(null, "Saludos "+nombre , "Ando aburrido, solo saludo", JOptionPane.INFORMATION_MESSAGE);
    }

}
