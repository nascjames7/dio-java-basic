package unchecked;

import com.sun.jdi.AbsentInformationException;

import javax.swing.*;

public class UncheckedException {

    //Fazer a divisão de dois valores inteiros.

    public static void main(String[] args) {

        boolean continueLooping = true;

        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                double resultado = dividir((Double.parseDouble(a)), (Double.parseDouble(b)));
                System.out.println("Reultado: " + resultado);

                continueLooping = false;

            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida! Informe " +
                        "um número inteiro!" + e.getMessage());

            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por zero."
                        + e.getMessage());

            } finally {
                System.out.println("Chegou no finally!");
            }
        }while (continueLooping);
    }

    public static double dividir(double a, double b){

        return a/b;
    }
}
