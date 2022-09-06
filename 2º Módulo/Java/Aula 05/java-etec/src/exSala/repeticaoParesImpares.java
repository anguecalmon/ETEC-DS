package exSala;

public class repeticaoParesImpares {

    public static void main(String[] args) {

        int contador = 0;

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " par");
            } else {
                System.out.println(i + " impar");
            }

        }
    }
}
