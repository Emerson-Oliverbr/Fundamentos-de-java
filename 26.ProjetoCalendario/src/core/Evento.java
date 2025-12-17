package core;

import core.Data;

public class Evento {
	public static void main(String[] args) {
		Data data =  new Data(18, Mes.Janeiro, 2023, DiaDaSemana.Quarta);
		
		System.out.println(data.exibirData());
	}
}
