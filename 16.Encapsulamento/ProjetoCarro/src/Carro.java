public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private int km;
	private double preco;
	
	
	String getAMarca() {
		return marca;
	}
	
	void setMarca(String novaMarca) {
		if(novaMarca != null && novaMarca.length() >= 3) {
			marca = novaMarca;
		}
		
	}
	
	String getModelo() {
		return modelo;
	}
	
	void setModelo(String novoModelo) {
		if(novoModelo != null && novoModelo.length() >= 3) {
			modelo = novoModelo;
		}
		
	}
	
	int getAno() {
		return ano; 
	}
	
	void setAno(int ano) {
		this.ano = ano;
	}
	
	String getCor() {
		return cor;
	}
	
	void setCor(String cor) {
		this.cor = cor;
	}
	
	int getKm() {
		return km;
	}
	
	void setKm(int km) {
		this.km = km;
	}
	
	double getPreco() {
		return preco;
	}
	
	void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	// [Metodo] "Criar um botão para que eu possa executar algo (mostrar os dados)
	
	public void exibirAnuncio() {
		System.out.println("Anuncio do carro: ");
		System.out.println(marca+"-"+modelo+"("+ano+")");
		System.out.println("Cor: "+cor+" KM: "+km+" R$ "+preco);
	}
	
	public void simularSeguro(int perfil) {
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
	
	public double calcularIPVA() {
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
