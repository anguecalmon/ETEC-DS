package Triangulos;

import java.util.Scanner;

public class exTriangulos {

    void triangulos() {
        Scanner teclado = new Scanner(System.in);
        float A, B, C;

        do {
        System.out.println("Insira um número para o primeiro lado do triângulo (> 0): ");
        A = teclado.nextFloat();
        } while (A <= 0);

        do {
        System.out.println("Insira outro número para o segundo lado do triângulo (> 0): ");
        B = teclado.nextFloat();
        } while (B <= 0);

        do {
        System.out.println("Insira outro número para o terceiro lado do triângulo (> 0): ");
        C = teclado.nextFloat();
        } while (C <= 0);
        

        if (A == B && A == C) {
            System.out.println("O seu triângulo é: Equilátero");
        } else if (A == B || A == C || B == C) {
            System.out.println("O seu triângulo é: Isósceles");
        } else {
            System.out.println("O seu triângulo é: Escaleno");
        }
    }
}
