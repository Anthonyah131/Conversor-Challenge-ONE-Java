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

        Object[] options = {"Monedas", "Medidas"};
        boolean salir = false;
        do {
            Object choice = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice == null) {
                JOptionPane.showMessageDialog(null, "Programa terminado");
                return;
            }

            switch (choice.toString()) {
                case "Monedas":
                    ConversorOneView op1 = new ConversorOneView();
                    if (op1.showConfirmDialog == 1 || op1.showConfirmDialog == 2) {
                        salir = true;
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                    }
                    break;

                case "Medidas":
                    ConversorOneMedidasView op2= new ConversorOneMedidasView();
                    if (op2.showConfirmDialog == 1 || op2.showConfirmDialog == 2) {
                        salir = true;
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                    }
                    break;

                default:
                    System.out.println("opdefault");
                    break;
            }
        } while (!salir);
    }

}
