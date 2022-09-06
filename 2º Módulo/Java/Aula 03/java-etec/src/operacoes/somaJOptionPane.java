package operacoes;

import javax.swing.JOptionPane;

public class somaJOptionPane {
    public static void main(String[] args) {
        
        try {
            float  N1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
            float  N2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
        
            float total = N1+N2;
        
            JOptionPane.showMessageDialog(null, "O resultado da soma é: " + total);
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
        
    }
}
