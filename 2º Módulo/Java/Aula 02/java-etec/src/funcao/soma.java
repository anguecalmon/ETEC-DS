package funcao;

import javax.swing.JOptionPane;

public class soma {
    
    void soma() {
        
        try {
            JOptionPane.showMessageDialog(null, "Adição");
            
            double N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            double N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
            double total = N1+N2;
        
            JOptionPane.showMessageDialog(null, "O resultado da soma é: " + total);
            }
        
                catch (Exception e){
                JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }
    
    void sub() {
        try {
            JOptionPane.showMessageDialog(null, "Subtração");
            
            double N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            double N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
            double total = N1-N2;
        
            JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + total);
            }
        
                catch (Exception e){
                JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }
    
    void mult() {
        try {
            JOptionPane.showMessageDialog(null, "Multiplicação");
            
            double N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            double N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
            double total = N1*N2;
        
            JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + total);
            }
        
                catch (Exception e){
                JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }
    
    void div() {
        try {
            JOptionPane.showMessageDialog(null, "Divisão");
            
            double N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            double N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
            double total = N1/N2;
        
            JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + total);
            }
        
                catch (Exception e){
                JOptionPane.showMessageDialog(null, "Caractere inválido");
        }
    }
}
