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
public class ConversorOneMedidasView extends JFrame {

    public int showConfirmDialog = 0;

    public ConversorOneMedidasView() {
        Object[] options = {"KM", "HM", "DAM", "M", "DM", "CM", "MM"};
        Object choice1 = null;
        Object choice2 = null;
        do {
            choice1 = (String) JOptionPane.showInputDialog(null, "Seleccione la unidad de origen", "Conversor", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            choice2 = (String) JOptionPane.showInputDialog(null, "Seleccione a que unidad desea convertir", "Conversor", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        } while (choice1 == choice2 && !(choice1 == null || choice2 == null));

        if (choice1 == null || choice2 == null) {
            JOptionPane.showMessageDialog(null, "Error, volviendo al menú");
            return;
        }

        double monto = 0;
        double resultado = 0;
        boolean bandera = true;

        do {
            String entrada = JOptionPane.showInputDialog("Ingrese el valor en " + choice1);
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
            double resultadoMetros = convertirAMetros(monto, choice1.toString());

            switch (choice2.toString()) {
                case "KM":
                    resultado = convertirAKilometros(resultadoMetros);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultado) + " KM.");
                    break;

                case "HM":
                    resultado = convertirAHectometros(resultadoMetros);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultado) + " HM.");
                    break;

                case "DAM":
                    resultado = convertirADecametros(resultadoMetros);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultado) + " DAM.");
                    break;

                case "M":
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultadoMetros) + " M.");
                    break;

                case "DM":
                    resultado = convertirADecimetros(resultadoMetros);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultado) + " DM.");
                    break;

                case "CM":
                    resultado = convertirACentimetros(resultadoMetros);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultado) + " CM.");
                    break;

                case "MM":
                    resultado = convertirAMilimetros(resultadoMetros);
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + choice1 + " equivalen a " + String.format("%.2f", resultado) + " MM.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                    break;
            }
        }

        showConfirmDialog = JOptionPane.showConfirmDialog(null, "¿Desea continuar con el programa?");
    }

    public static double convertirAMetros(double longitud, String unidadOrigen) {
        switch (unidadOrigen) {
            case "KM":
                return longitud * 1000.0;
            case "HM":
                return longitud * 100.0;
            case "DAM":
                return longitud * 10.0;
            case "M":
                return longitud;
            case "DM":
                return longitud / 10.0;
            case "CM":
                return longitud / 100.0;
            case "MM":
                return longitud / 1000.0;
            default:
                System.out.println("Unidad de origen no reconocida.");
                return 0;
        }
    }

    public static double convertirAKilometros(double longitud) {
        return longitud / 1000.0;
    }

    public static double convertirAHectometros(double longitud) {
        return longitud / 100.0;
    }

    public static double convertirADecametros(double longitud) {
        return longitud / 10.0;
    }

    public static double convertirADecimetros(double longitud) {
        return longitud * 10.0;
    }

    public static double convertirACentimetros(double longitud) {
        return longitud * 100.0;
    }

    public static double convertirAMilimetros(double longitud) {
        return longitud * 1000.0;
    }

}
