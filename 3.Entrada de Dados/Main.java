import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

           /* int a;
            float b;
            double c;

            System.out.print("Digite um numero inteiro: ");
            a = teclado.nextInt();
            System.out.println("Você digitou: " + a);
            System.out.print("Digite um numero float: ");
            b = teclado.nextFloat();
            System.out.println("Você digitou: " + b);
            System.out.print("Digite um numero double: ");
            c = teclado.nextDouble();
            System.out.println("Você digitou: " + c);
            System.out.printf("Você digitou %.3f\n: " , c);
            System.out.printf("Você digitou %.5f\n: " , c); */

            String nome;
            int codigo;
            double salario;

            System.out.print("Digite seu codigo: ");
            codigo = Integer.parseInt(teclado.nextLine());
            System.out.print("Digite seu nome: ");            
            nome = teclado.nextLine();
            System.out.print("Digite seu salario: ");
            salario = Double.parseDouble(teclado.nextLine());
            System.out.println("Seu codigo, nome e salario: " + codigo + ", " + nome + ", " + salario);

        teclado.close();
    }
}