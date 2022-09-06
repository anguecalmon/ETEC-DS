package Ordem;

import java.util.Arrays;
import java.util.Scanner;

public class ordemCrescente {

    public static void main(String[] args) {

        int[] listaDeNumeros = new int[4]; // Constrói um Array com 4 posições
        Scanner numeros = new Scanner(System.in); //Constrói um objeto que permite inserir numeros no console

        // Preenche o Array a parti da posição 1
        for (int i = 1; i < listaDeNumeros.length; i++) {
            System.out.print("Digite " + i + "° numeros: ");
            listaDeNumeros[i] = (numeros.nextInt());
        }

        // Coloca o Array em ordem crescente
        Arrays.sort(listaDeNumeros);

        // Imprime o Array em ordem crescente
        System.out.print("Ordem crescente:    ");
        for (int j = 1; j < listaDeNumeros.length; j++) {
            System.out.print(listaDeNumeros[j] + "  ");
        }
    }

}
