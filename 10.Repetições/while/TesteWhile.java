import java.util.Scanner;

public class TesteWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, resultado, contador;

        System.out.print("Digite um valor: ");
        numero = sc.nextInt();

        contador = 1;

        while (contador <= 10) {
            resultado = contador * numero;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador +=1;
        }

        sc.close();
    }
}
