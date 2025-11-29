import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double n1, n2, media;

        System.out.print("Digitre a N1: ");
        n1 = teclado.nextDouble();
        System.out.print("Digitre a N2: ");
        n2 = teclado.nextDouble();

        media = (n1 + n2) / 2.0; 

        System.out.printf("Sua media vale: %.2f\n" , media);

        if (n1 >= 5.0 && media >= 6.0) {
            System.out.println("Parabens, Aprovado!");
        }
        else {
            System.out.println("Estudo mais, você foi reprovado!");
        }

        teclado.close();
    }
}