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
    double exchangeRateEURToUSD = 1.06;

    public ConversorOneView() {
        Object[] options = {"USD", "EUR", "GBP", "JPY", "KRW"};
        Object choice1 = null;
        Object choice2 = null;
        do {
            choice1 = JOptionPane.showInputDialog(null, "Seleccione la moneda de origen", "Conversor", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            choice2 = JOptionPane.showInputDialog(null, "Seleccione a que moneda desea convertir", "Conversor", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        } while (choice1.toString().equals(choice2.toString()));

        if(choice1 == null || choice2 == null)   {
            JOptionPane.showMessageDialog(null, "Error, cerrando programa");
            return;
        }

        double monto;
        double resultado;

        monto = Double.parseDouble(JOptionPane.showInputDialog("Seleccione a que monto que deseas convertir"));
        resultado = monto * exchangeRateEURToUSD;
        JOptionPane.showMessageDialog(null, String.format("%.2f", monto) + choice1.toString() + " equivalen a " + String.format("%.2f", resultado) + choice2.toString());

    }

}
