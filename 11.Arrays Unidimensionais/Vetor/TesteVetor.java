import java.util.Scanner;
import java.util.Locale;

public class TesteVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        double[] notas;
        notas = new double[5];

        for(int pos=0; pos<5; pos +=1) {
            System.out.print("Digite a notra do aluno na posição: " + pos + " = ");
            notas[pos] = teclado.nextDouble();            
        }

        System.out.println("Notas digitadas:");    
        for(int pos=0; pos<5; pos +=1) {
            System.out.println(pos + " -> " + notas[pos]);           
        }

        
        
        /*
        System.out.println("Digite a notra do aluno 0: ");
        notas[0] = teclado.nextDouble();
        System.out.println("Digite a notra do aluno 1: ");
        notas[1] = teclado.nextDouble();
        System.out.println("Digite a notra do aluno 2: ");
        notas[2] = teclado.nextDouble();
        System.out.println("Digite a notra do aluno 3: ");
        notas[3] = teclado.nextDouble();
        System.out.println("Digite a notra do aluno 4: ");
        notas[4] = teclado.nextDouble();
        */

        teclado.close();
    }
}