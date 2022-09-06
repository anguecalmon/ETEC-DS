package calculadoraSwing;

import javax.swing.JOptionPane;

public class calculadoraMetodos {

    void soma() {
        try {
            float N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
            float N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));

            float total = N1 + N2;

            JOptionPane.showMessageDialog(null, "O resultado da soma é: " + total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }

    void sub() {
        try {
            float N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
            float N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));

            float total = N1 - N2;

            JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }

    void mult() {
        try {
            float N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
            float N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));

            float total = N1 * N2;

            JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }

    void div() {
        try {
            float N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
            float N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));

            float total = N1 / N2;

            JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }
}
