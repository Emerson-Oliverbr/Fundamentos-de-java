import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A, B, X;

        A = Integer.parseInt(teclado.nextLine());
        B = Integer.parseInt(teclado.nextLine());

        X = A + B;

        System.out.println("X = " + X);

        teclado.close();
    }
}