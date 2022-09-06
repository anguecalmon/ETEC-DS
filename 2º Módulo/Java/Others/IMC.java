import java.util.*;

public class IMC {
    private static Scanner teclado;
    public static void main(String[] args) {

        double IMC, Peso = 0, Altura = 0;
        teclado = new Scanner(System.in);

        System.out.println("Qual é o seu peso?: ");
        Peso = teclado.nextDouble();

        System.out.println("Qual é a seu altura?: ");
        Altura = teclado.nextDouble();

        IMC = Peso / Math.pow(Altura,2);

        System.out.printf("Seu IMC é: " + IMC); 

        if (IMC >= 40) {
            System.out.printf(" Você está na obesidade nível 3 :(");
        }

            else if (IMC >= 35) {
            System.out.printf(" Você está na obesidade nível 2 :(");
            }

                else if (IMC >= 30) {
                System.out.printf(" Você está na obesidade nível 1 :(");
                }

                    else if (IMC >= 25) {
                    System.out.printf(" Você está acima do peso :(");
                    }

                        else if (IMC >= 18.5) {
                        System.out.printf(" Você está no seu peso normal :D");
                        }
                            else {
                            System.out.printf( "Você está abaixo do peso :(");
                            }

    }
}
