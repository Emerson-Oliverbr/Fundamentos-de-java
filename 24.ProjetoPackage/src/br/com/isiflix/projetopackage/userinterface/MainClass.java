package br.com.isiflix.projetopackage.userinterface;

import java.util.Locale;

import br.com.isiflix.projetopackage.core.Produto;

public class MainClass {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		System.out.println("Testando pacote");
		Produto p = new Produto(01, "TV", 1000.00);

		System.out.printf(p.exibirInformacoes());

	}
}
