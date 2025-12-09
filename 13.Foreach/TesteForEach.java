import java.util.Scanner;

public class TesteForEach {
public static void main(String args[]) {
        int vetor[] = new  int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<vetor.length; i++) {
            System.out.print("Digite = ");
            vetor[i] = sc.nextInt();
        }

        for(int elemento: vetor) {
            System.out.println("Elemento do vetor = " + elemento); 
        }

        sc.close();
    }
}