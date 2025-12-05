import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        switch(valor) {
            case 1:
                System.out.print("Voce digitou: 1 ");
                break;
            case 2:  
                System.out.print("Voce digitou: 2 ");
                break;
            case 3:     
            System.out.print("Voce digitou: 3 ");
                break;    
            case 4:     
            System.out.print("Voce digitou: 3 ");
                break;  
            default:   
             System.out.println("Valor incorreto");  
             break;  
        }

        sc.close();
    }
}