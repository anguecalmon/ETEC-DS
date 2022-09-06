/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

import javax.swing.JOptionPane;

public class NomeJOptionPane {
    public static void main(String[] args) {

    String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            
    JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
    }
}
