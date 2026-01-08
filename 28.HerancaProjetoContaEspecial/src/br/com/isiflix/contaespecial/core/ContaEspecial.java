
package br.com.isiflix.contaespecial.core;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(int numeroConta, String cpfTitular, String nome, double saldo, double limite) {
        super(numeroConta, cpfTitular, nome, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public boolean debitar(double valor) {
        if(super.saldo + this.limite >= valor ) {
            super.saldo -= valor;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Dados da Conta Especial: " + super.numeroConta + " " + super.cpfTitular + " " + super.nomeTitular + " R$" + super.saldo + " Limite R$" + this.limite;
    }
}
