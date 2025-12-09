import java.util.Scanner;

public class TesteFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, resultado;

        System.out.print("Digite um valor: ");
        numero = sc.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }      

        sc.close();
    }
}
