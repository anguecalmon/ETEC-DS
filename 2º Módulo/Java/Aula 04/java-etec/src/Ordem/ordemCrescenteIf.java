package Ordem;

public class ordemCrescenteIf {
    public static void main(String[] args) {
        int A = 3;
        int B = 1;
        int C = 2;
        
        if (A == 1 && B == 2 && C == 3) {
            System.out.println(A + " " + B + " " + C);
        } else if (A == 1 && B == 3 && C == 2) {
            System.out.println(A + " " + C + " " + B);
        } else if (A == 2 && B == 1 && C == 3) {
            System.out.println(B + " " + A + " " + C);
        } else if (A == 2 && B == 3 && C == 1) {
            System.out.println(C + " " + A + " " + B);
        } else if (A == 3 && B == 1 && C == 2) {
            System.out.println(B + " " + C + " " + A);
        } else if (A == 3 && B == 2 && C == 1) {
            System.out.println(C + " " + B + " " + A);
        }
    }
}
