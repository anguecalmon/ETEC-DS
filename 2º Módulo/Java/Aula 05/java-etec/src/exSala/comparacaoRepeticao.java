package exSala;

public class comparacaoRepeticao {

    public static void main(String[] args) {

        int par = 0, impar = 0;

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                par = par + i;
            } else {
                impar = impar + i;
            }
        }
        
        // era só tirar do laço de repetição!!!
        System.out.println("");
        System.out.println("Total de números pares: " + par);
        System.out.println("");
        System.out.println("Total de números ímpares: " + impar);
        System.out.println("");
        
        if (par >= impar) {
            System.out.println("Par é maior que impar");
        } else {
            System.out.println("Impar é maior que par");
        }
        
    }

}
