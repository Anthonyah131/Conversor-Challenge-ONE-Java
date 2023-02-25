/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversorone;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ANTHONY
 */
public class ConversorOneView extends JFrame {

    public int showConfirmDialog = 0;

    public ConversorOneView() {
        Object[] options = {"CRC", "USD", "EUR", "GBP", "JPY", "KRW"};
        Object choice1 = null;
        Object choice2 = null;
        do {
            choice1 = (String) JOptionPane.showInputDialog(null, "Seleccione la moneda de origen", "Conversor", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            choice2 = (String) JOptionPane.showInputDialog(null, "Seleccione a que moneda desea convertir", "Conversor", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        } while (choice1 == choice2 && !(choice1 == null || choice2 == null));

        if (choice1 == null || choice2 == null) {
            JOptionPane.showMessageDialog(null, "Error, volviendo al menú");
            return;
        }

        double monto = 0;
        double resultado = 0;
        boolean bandera = true;

        do {
            String entrada = JOptionPane.showInputDialog("Ingrese el monto en " + choice1);
            if (entrada == null) {
                bandera = false;
                monto = 0;
            } else {
                try {
                    monto = Double.parseDouble(entrada);
                    bandera = false;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El valor no es un número válido.");
                }
            }
        } while (bandera);

        if (monto != 0) {
            double resultadoCRC = convertirAColones(monto, choice1.toString());

            switch (choice2.toString()) {
                case "EUR":
                    resultado = convertirAEuros(resultadoCRC);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultado) + " EUR.");
                    break;

                case "GBP":
                    resultado = convertirALibras(resultadoCRC);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultado) + " GBP.");
                    break;

                case "JPY":
                    resultado = convertirAYenes(resultadoCRC);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultado) + " JPY.");
                    break;

                case "KRW":
                    resultado = convertirAWones(resultadoCRC);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + "equivalen a " + String.format("%.2f", resultado) + " KRW.");
                    break;

                case "USD":
                    resultado = convertirADolares(resultadoCRC);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultado) + " USD.");
                    break;

                case "CRC":
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultadoCRC) + " CRC.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                    break;
            }
        }

        showConfirmDialog = JOptionPane.showConfirmDialog(null, "¿Desea continuar con el programa?");
    }

    public static double convertirAColones(double cantidad, String monedaOrigen) {
        switch (monedaOrigen) {
            case "CRC":
                return cantidad;
            case "USD":
                return cantidad * 561.45;
            case "EUR":
                return cantidad * 594.32;
            case "GBP":
                return cantidad * 670.65;
            case "JPY":
                return cantidad * 4.11;
            case "KRW":
                return cantidad * 0.43;
            default:
                System.out.println("Moneda de origen no reconocida.");
                return 0;
        }
    }

    public static double convertirADolares(double cantidad) {
        return cantidad / 561.45;
    }

    public static double convertirAEuros(double cantidad) {
        return cantidad / 594.32;
    }

    public static double convertirALibras(double cantidad) {
        return cantidad / 670.65;
    }

    public static double convertirAYenes(double cantidad) {
        return cantidad / 4.11;
    }

    public static double convertirAWones(double cantidad) {
        return cantidad / 0.43;
    }

}
