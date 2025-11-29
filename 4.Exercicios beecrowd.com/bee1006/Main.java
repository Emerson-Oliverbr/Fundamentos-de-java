import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double A = Double.parseDouble(teclado.nextLine());
        double B = Double.parseDouble(teclado.nextLine());
        double C = Double.parseDouble(teclado.nextLine());

        double MEDIA = (A * 2.0 + B * 3.0 + C * 5.0) / 10.0;

        System.out.printf("MEDIA %.1f\n", MEDIA);

        teclado.close();
    }
}