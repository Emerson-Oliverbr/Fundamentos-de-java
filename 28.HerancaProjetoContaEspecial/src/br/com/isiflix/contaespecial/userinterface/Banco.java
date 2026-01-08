package br.com.isiflix.contaespecial.userinterface;

import br.com.isiflix.contaespecial.core.ContaBancaria;
import br.com.isiflix.contaespecial.core.ContaEspecial;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria(1045, "365.459.658/27", "Emerson Matos Oliveira", 100.00);

        System.out.println(c);

        ContaEspecial e = new ContaEspecial(9876, "35698752147", "Getulio Borborema", 100.0, 1000.0);

        System.out.println(e);

        if(e.debitar(300)) {
            System.out.println("Debito efetuado");
        }
        else {
            System.out.println("Saldo insuficente");
        }
        System.out.println(e);
    }
}
