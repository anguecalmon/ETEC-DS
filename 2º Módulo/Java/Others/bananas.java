import java.util.*;

public class bananas {
    private static Scanner teclado;

    public static void main(String[] args) {

        int qtdB = 0, divB = 0, restoB = 0;
        teclado = new Scanner(System.in);

        System.out.println("Quantas bananas você tem?: ");
        qtdB = teclado.nextInt();

        divB = qtdB / 12;
        restoB = qtdB % 12;

        if (qtdB >= 12) {
            System.out.printf("Você tem " + divB + " dúzia(as) e " + restoB + " banana(s)");
        }

        else {
            System.out.printf("Você tem " + qtdB + " bananas");
        }
    }
}