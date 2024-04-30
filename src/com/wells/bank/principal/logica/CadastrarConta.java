package com.wells.bank.principal.logica;

public class CadastrarConta {
    private String nome;
    private String agencia;
    private String conta;
    private double saldo = 0;

    public void cadastrarConta(String nome, String agencia, String conta) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
    }

    public void depositar(double dinheiro) {
        this.saldo += dinheiro;
    }

    public void retirar(double dinheiro) {
        if (saldo < dinheiro) {
            this.saldo -= dinheiro;
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nAgencia: " + this.agencia + "\nConta: " + this.conta + "\nSaldo: "
                + this.saldo;
    }

}
