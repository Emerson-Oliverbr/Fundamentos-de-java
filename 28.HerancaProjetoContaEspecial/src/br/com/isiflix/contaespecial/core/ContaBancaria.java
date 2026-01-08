package br.com.isiflix.contaespecial.core;

public class ContaBancaria {
    protected int numeroConta;
    protected String cpfTitular;
    protected String nomeTitular;
    protected double saldo;

    public ContaBancaria(int numeroConta, String cpfTitular, String nomeTitular, double saldo) {
        super();
        this.numeroConta = numeroConta;
        this.cpfTitular = cpfTitular;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {

        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {

        this.numeroConta = numeroConta;
    }

    public String getCpfTitular() {

        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {

        this.cpfTitular = cpfTitular;
    }

    public String getNomeTitular() {

        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {

        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {

        return saldo;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public boolean debitar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

   @Override
    public String toString() {
        return "Dados do cliente: Número da conta " + numeroConta + ", CPF: ("+cpfTitular+")" + ", Saldo: " + String.format("%.2f", saldo);
    }
}
