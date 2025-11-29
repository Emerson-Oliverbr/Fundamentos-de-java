public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	int km;
	double preco;
	
	// [Metodo] "Criar um botão para que eu possa executar algo (mostrar os dados)
	
	void exibirAnuncio() {
		System.out.println("Anuncio do carro: ");
		System.out.println(marca+"-"+modelo+"("+ano+")");
		System.out.println("Cor: "+cor+" KM: "+km+" R$ "+preco);
	}
	
	void simularSeguro(int perfil) {
		if(perfil == 0) {
			System.out.println("Perfil idoso - 1.5%");
			System.out.println("R$ " + preco*0.015);
		}
		else if(perfil == 1) {
			System.out.println("Perfil Chefe de familia - 2.5%");
			System.out.println("R$ " + preco*0.025);
		}
		else if(perfil == 2) {
			System.out.println("Perfil Jovem - 14.0%");
			System.out.println("R$ " + preco*0.14);
		}
		else {
			System.out.println("Não temos esse perfil");
		}
	}
	
	double calcularIPVA() {
		double valorIPVA;
		if(ano <= 2002) {
			valorIPVA = 0.0;
		}
		else {
			valorIPVA = preco * 0.035;
		}
		return valorIPVA;
	}
}
