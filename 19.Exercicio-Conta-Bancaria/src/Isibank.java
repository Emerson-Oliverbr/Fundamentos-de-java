import java.util.Locale;
import java.util.Scanner;

public class Isibank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        Conta conta1 = new Conta(12345, 12, "Emerson Oliveira", "569.359.215-27", 0.0);
        double valor;
        int opcao;

        do {
            System.out.println("*** OliverBank ***");
            System.out.println("****************** Escolha uma opção *****************");
            System.out.println("1 Extrato | 2 Deposito | 3 Saque | -1 Encerrar");

            opcao = teclado.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println(conta1.exibirInfo());
                    break;
                case 2:
                    System.out.print("Digite o valor: ");
                    valor = teclado.nextDouble();
                    conta1.depositar(valor);
                    break;
                case 3:
                    System.out.print("Digite o valor: ");
                    valor = teclado.nextDouble();
                    if(conta1.sacar(valor)) {
                        System.out.println("Saque autorizado");
                    }
                    else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case -1:
                    System.out.println("Obrigado por usar nossos serviços ");
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }

        } while (opcao != -1);

        teclado.close();
    }
}
