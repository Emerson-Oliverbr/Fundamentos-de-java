
public class UaiBiMotors {
	public static void main(String[] args) {
		
		Carro c1, c2;
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca = "Porsche";
		c1.modelo = "Cayenne";
		c1.ano = 2025;
		c1.km = 0;
		c1.cor =  "Preta";
		c1.preco = 2200000;
		
		c2.marca = "Chevrolet";
		c2.modelo = "Corsa";
		c2.ano = 1998;
		c2.km = 250000;
		c2.cor =  "Cinza";
		c2.preco = 8000;
		
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
		
		//System.out.println("Carro: ");
		//System.out.println(c1.marca + "-" + c1.modelo + "("+c1.ano+")");
		//System.out.println(c1.cor + " KM: " + c1.km + " R$ " + c1.preco);
		
		//System.out.println("Carro: ");
		//System.out.println(c2.marca + "-" + c2.modelo + "("+c2.ano+")");
		//System.out.println(c2.cor + " KM: " + c2.km + " R$ " + c2.preco);
	}
}
