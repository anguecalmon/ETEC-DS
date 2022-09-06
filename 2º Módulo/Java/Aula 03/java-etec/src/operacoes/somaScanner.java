package operacoes;

import java.util.Scanner;

public class somaScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float N1 = 0, N2 = 0;
        
        System.out.println("Insira um número: "); 
        N1 = teclado.nextFloat();
        
        System.out.println("Insira outro número: "); 
        N2 = teclado.nextFloat();
        
        float total = N1 + N2;

        System.out.println("O resultado da operação é: " + total); 
    }
}

