public class Loja {
    public static void main(String[] args) {
        Produto p1, p2;

        p1 = new Produto(1, "Computador", 1000.0);

        //System.out.println("P1: " + p1.exibirInfo());

        //p2 = p1; // Isso não cria uma cópia .. isso cria apenas uma nova referencia ao mesmo objeto;
       //p2.setPreco(1500.0);

        //p2 = new Produto(p1.getId(), p1.getNome(), p1.getPreco());
        //p2.setPreco(1500.0);

        //System.out.println("P1: " + p1.exibirInfo());
        //System.out.println("P2: " + p2.exibirInfo());

        System.out.println("Antes da ajuste de preco: ");
        System.out.println("p1 = " + p1.exibirInfo());
        Atualizador a = new Atualizador(7.5);
        a.atualizarPreco(p1);

        System.out.println("Após o ajuste de preco: " + p1.exibirInfo());
        System.out.println("p1 = " + p1.exibirInfo());

    }
}
