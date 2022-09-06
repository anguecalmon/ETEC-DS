package operacoes;

import java.util.Scanner;

public class somaScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double N1 = teclado.nextDouble();
        
        System.out.println("Digite outro número: ");
        double N2 = teclado.nextDouble();
        
        double total = N1+N2;
        
        System.out.println("O resultado da soma é: " + total); 
    }
}
