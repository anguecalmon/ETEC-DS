package operacoes;

import javax.swing.JOptionPane;

public class somaJOptionPane {
    public static void main(String[] args) {
        
        try {
        int  N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        int  N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        int total = N1+N2;
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + total);
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
        
    }
}
