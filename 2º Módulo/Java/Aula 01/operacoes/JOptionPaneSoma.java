/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import javax.swing.JOptionPane;
import java.lang.Integer;

public class JOptionPaneSoma {
    public static void main(String[] args) {
        
        int  N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        
        int  N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        int total = N1+N2;
            
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + total);
    }
}
