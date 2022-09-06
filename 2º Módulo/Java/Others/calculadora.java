import java.util.*;

public class calculadora {
    private static Scanner teclado;

    public static void main(String args[]) {
        {
            double N1,N2,Subt,Div, Mult, Soma;
            teclado = new Scanner(System.in);
        
            System.out.printf("Infome um número: ");
            N1 = teclado.nextDouble();
        
            System.out.printf("Informe um número: ");
            N2 = teclado.nextDouble();
        
            Soma = N1 + N2;
            Mult = N1 * N2;
            Div = N1/N2;
            Subt = N1-N2;
        
            System.out.println("A soma é de: " +  Soma);
            System.out.println("A subtração é de: " +  Subt);
            System.out.println("A multiplicação é de: " +  Mult);
            System.out.println("A divisão é de: " +  Div);
        }
        }
    }
