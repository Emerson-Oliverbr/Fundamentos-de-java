package br.com.isiflix.ecommerce.ui;

import br.com.isiflix.ecommerce.core.Pedido;
import br.com.isiflix.ecommerce.core.Status;

public class Loja {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(123, "17/12/2025",  1500.00, "Emerson", Status.NOVO);
		
		System.out.println(pedido.exibir());
		
		pedido.setStatus(Status.FINALIZADO);
		System.out.println(pedido.exibir());
	}
}
