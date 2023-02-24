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

    double exchangeRateSameCurrency = 1;
    double exchangeRateUSDToEUR = 0.94;
    double exchangeRateUSDToGBP = 0.83;
    double exchangeRateUSDToJPY = 134.44;
    double exchangeRateUSDToKRW = 1295.18;
    double exchangeRateEURToGBP = 0.89;
    double exchangeRateEURToJPY = 143.54;
    double exchangeRateEURToKRW = 1382.38;
    double exchangeRateGBPToJPY = 161.71;
    double exchangeRateGBPToKRW = 1557.79;
    double exchangeRateJPYToKRW = 9.63;
    public int showConfirmDialog = 0;

    public ConversorOneView() {
        Object[] options = {"USD", "EUR", "GBP", "JPY", "KRW"};
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
            switch (choice1 + " to " + choice2) {
                case "USD to EUR":
                    resultado = monto * exchangeRateUSDToEUR;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " USD equivalen a " + String.format("%.2f", resultado) + " EUR.");
                    break;

                case "USD to GBP":
                    resultado = monto * exchangeRateUSDToGBP;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " USD equivalen a " + String.format("%.2f", resultado) + " GBP.");
                    break;

                case "USD to JPY":
                    resultado = monto * exchangeRateUSDToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " USD equivalen a " + String.format("%.2f", resultado) + " JPY.");
                    break;

                case "USD to KRW":
                    resultado = monto * exchangeRateUSDToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " USD equivalen a " + String.format("%.2f", resultado) + " KRW.");
                    break;

                case "GBP to USD":
                    resultado = monto / exchangeRateUSDToGBP;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " GBP equivalen a " + String.format("%.2f", resultado) + " USD.");
                    break;

                case "GBP to EUR":
                    resultado = monto / exchangeRateEURToGBP;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " GBP equivalen a " + String.format("%.2f", resultado) + " EUR.");
                    break;

                case "GBP to JPY":
                    resultado = monto * exchangeRateGBPToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " GBP equivalen a " + String.format("%.2f", resultado) + " JPY.");
                    break;

                case "GBP to KRW":
                    resultado = monto * exchangeRateGBPToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " GBP equivalen a " + String.format("%.2f", resultado) + " KRW.");
                    break;

                case "EUR to USD":
                    resultado = monto / exchangeRateUSDToEUR;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " EUR equivalen a " + String.format("%.2f", resultado) + " USD.");
                    break;

                case "EUR to GBP":
                    resultado = monto * exchangeRateEURToGBP;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " EUR equivalen a " + String.format("%.2f", resultado) + " GBP.");
                    break;

                case "EUR to JPY":
                    resultado = monto * exchangeRateEURToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " EUR equivalen a " + String.format("%.2f", resultado) + " JPY.");
                    break;

                case "EUR to KRW":
                    resultado = monto * exchangeRateEURToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " EUR equivalen a " + String.format("%.2f", resultado) + " KRW.");
                    break;

                case "JPY to USD":
                    resultado = monto / exchangeRateUSDToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " JPY equivalen a " + String.format("%.2f", resultado) + " USD.");
                    break;

                case "JPY to EUR":
                    resultado = monto / exchangeRateEURToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " JPY equivalen a " + String.format("%.2f", resultado) + " EUR.");
                    break;

                case "JPY to GBP":
                    resultado = monto / exchangeRateGBPToJPY;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " JPY equivalen a " + String.format("%.2f", resultado) + " GBP.");
                    break;

                case "JPY to KRW":
                    resultado = monto * exchangeRateJPYToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " JPY equivalen a " + String.format("%.2f", resultado) + " KRW.");
                    break;

                case "KRW to USD":
                    resultado = monto / exchangeRateUSDToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " KRW equivalen a " + String.format("%.2f", resultado) + " USD.");
                    break;

                case "KRW to EUR":
                    resultado = monto / exchangeRateEURToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " KRW equivalen a " + String.format("%.2f", resultado) + " EUR.");
                    break;

                case "KRW to GBP":
                    resultado = monto / exchangeRateGBPToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " KRW equivalen a " + String.format("%.2f", resultado) + " GBP.");
                    break;

                case "KRW to JPY":
                    resultado = monto / exchangeRateJPYToKRW;
                    JOptionPane.showMessageDialog(null, String.format("%.2f ", monto) + " KRW equivalen a " + String.format("%.2f", resultado) + " JPY.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                    break;
            }
        }

        showConfirmDialog = JOptionPane.showConfirmDialog(null, "¿Desea continuar con el programa?");
    }

}
