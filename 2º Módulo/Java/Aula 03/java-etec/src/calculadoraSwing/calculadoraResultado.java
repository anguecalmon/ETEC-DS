package calculadoraSwing;

import javax.swing.JOptionPane;

public class calculadoraResultado {

    public static void main(String[] args) {
        int operacao = 0;

        do {
            try {
                operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das operações: 1 = Adição / 2 = Subtração / 3 = Multiplicação / 4 = Divisão"));
                calculadoraMetodos x = new calculadoraMetodos();

                if (operacao == 1) {
                    x.soma();
                } else if (operacao == 2) {
                    x.sub();
                } else if (operacao == 3) {
                    x.mult();
                } else if (operacao == 4) {
                    x.div();
                } else {
                    JOptionPane.showMessageDialog(null, "Número inválido");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Caractere inválido");
            }
        } while ((operacao <= 0) || (operacao > 4));
    }
}
