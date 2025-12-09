import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod = 0, qtde = 0;
        double totalAPagar = 0.0;

        cod = sc.nextInt();
        qtde = sc.nextInt();

        switch(cod) {
            case 1: 
                totalAPagar = qtde * 4.0;
            break;
            case 2: 
                totalAPagar = qtde * 4.50;
                break;
            case 3: 
                totalAPagar = qtde * 5.00;
                break;  
            case 4: 
                totalAPagar = qtde * 2.00;
                break;
            case 5: 
                totalAPagar = qtde * 1.50;
                break;           
            default:
            System.out.println("Código inexistente");
            break;
        }

        System.out.printf("Total: R$ %.2f\n", totalAPagar);

        sc.close();
    }
}