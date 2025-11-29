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
}
