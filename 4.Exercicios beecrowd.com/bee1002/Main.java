import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double raio = teclado.nextDouble();

        double n = 3.14159;

        double area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);

        teclado.close();
    }
}