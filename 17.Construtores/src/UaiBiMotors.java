public class UaiBiMotors {
    public static void main(String[] args) {

        Carro c1, c2;
        c1 = new Carro("Porsche", "Cayenne", 2025, "Azul", 0, 2200000.0);
        c2 = new Carro("Ford", "Fiesta", 2007, "Preto", 80000, 55000.0);

       /* c1.setMarca("Porsche");
        c1.setModelo("Cayenne");
        c1.setAno(2025);
        c1.setCor("Azul");
        c1.setPreco(2000000.0);
        c1.setMarca("BMW");

        c2.setMarca("Ford");
        c2.setModelo("Fiesta");
        c2.setAno(2007);
        c2.setCor("Preto");
        c2.setKm(80000);
        c2.setPreco(23000.0); */

        c1.exibirAnuncio();
        c1.simularSeguro(2);

        System.out.println();
        c2.exibirAnuncio();
        c2.simularSeguro(2);

        System.out.println("---- Calculando o IPVA dos veículos ----");
        double ipvaC1 = c1.calcularIPVA();
        double ipvaC2 = c2.calcularIPVA();

        if(ipvaC1 == 0) {
            System.out.println("Veiculo Isento");
        }
        else {
            System.out.println("Valor do IPVA = " + ipvaC1);
        }

        if(ipvaC2 == 0) {
            System.out.println("Veiculo Isento de imposto");
        }
        else {
            System.out.println("Valor do IPVA = " + ipvaC2);
        }
    }
}
