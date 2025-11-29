import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();

        double MEDIA = (A * 3.5 + B * 7.5) / 11.0;

        System.out.printf("MEDIA = %.5f\n", MEDIA);

        teclado.close();
    }
}