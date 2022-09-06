package Ordem;

import java.util.Arrays;
import java.util.Scanner;

public class ordemDecrescente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números inteiros? ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Digite " + n + " números.");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num); //Comando para ordenar os números do vetor em ordem crescente
        System.out.println("Em ordem decrescente.");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[n - i - 1]); //Necessário subtrair o índice por -1
        }
        sc.close();
    }
}