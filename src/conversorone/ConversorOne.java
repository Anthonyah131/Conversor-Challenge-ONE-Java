package conversorone;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ANTHONY
 */
public class ConversorOne extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Object[] options = {"Conversor de monedas", "Conversor de medidas"};
        Object choice = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice == null) {
            JOptionPane.showMessageDialog(null, "Error, cerrando programa");
            return;
        }

        switch (choice.toString()) {
            case "Conversor de monedas":
                System.out.println("op1");
                ConversorOneView op1 = new ConversorOneView();
                break;

            case "Conversor de medidas":
                System.out.println("op2");
                break;

            default:
                System.out.println("opdefault");
                break;
        }
    }

}
