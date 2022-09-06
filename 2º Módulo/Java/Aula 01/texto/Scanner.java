/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        System.out.println("Digite o seu nome: ");
        nome = teclado.next();
        
        System.out.println("Seu nome é: " + nome);
    }   
}
