/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.Scanner;

public class ScannerSoma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int N1 = 0, N2 = 0;
        
        System.out.println("Digite o primeiro valor: ");
        N1 = teclado.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        N2 = teclado.nextInt();
        
        int total = N1+N2;
        
        System.out.println("O resultado da soma é: " + total);
    }
}
