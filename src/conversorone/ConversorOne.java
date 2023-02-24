package conversorone;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
        boolean salir = false;
        do {
            Object choice = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice == null) {
                JOptionPane.showMessageDialog(null, "Programa terminado");
                return;
            }

            switch (choice.toString()) {
                case "Conversor de monedas":
                    ConversorOneView op1 = new ConversorOneView();
                    if (op1.showConfirmDialog == 1 || op1.showConfirmDialog == 2) {
                        salir = true;
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                    }
                    break;

                case "Conversor de medidas":
                    System.out.println("op2");
                    break;

                default:
                    System.out.println("opdefault");
                    break;
            }
        } while (!salir);
    }

}
