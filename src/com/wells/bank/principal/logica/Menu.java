package com.wells.bank.principal.logica;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Map<String, CadastrarConta> contas = new HashMap<>();

    public void exibirMenu() {
        boolean running = true;
        while (running) {

            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Consultar Saldo");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();

            CadastrarConta conta;
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = scanner.next();
                    System.out.println("Digite a agência: ");
                    String agencia = scanner.next();
                    System.out.println("Digite o número da conta: ");
                    String numeroConta = scanner.next();

                    CadastrarConta novaConta = new CadastrarConta(); // Create a new Conta object
                    novaConta.cadastrarConta(nome, agencia, numeroConta); // Call cadastrarConta on the Conta object
                    contas.put(numeroConta, novaConta); // Put the Conta object into the map
                    break;
                case 2:
                    System.out.println("Digite o número da conta: ");
                    String numeroContaDeposito = scanner.next();
                    CadastrarConta contaDeposito = contas.get(numeroContaDeposito); // Get the Conta from the map
                    if (contaDeposito != null) {
                        System.out.println("Digite o valor a ser depositado: ");
                        double deposito = scanner.nextDouble();
                        contaDeposito.depositar(deposito);
                        System.out.println("Depósito realizado com sucesso.");
                        System.out.println("Nome: " + contaDeposito.getNome() + "\n" + "Agência: "
                                + contaDeposito.getAgencia() + "\n" + "Conta: " + contaDeposito.getConta() + "\n"
                                +
                                "Saldo atual: " + contaDeposito.consultarSaldo());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da conta: ");
                    String numeroContaSaque = scanner.next();
                    CadastrarConta contaSaque = contas.get(numeroContaSaque); // Get the Conta from the map
                    if (contaSaque != null) {
                        System.out.println("Digite o valor a ser sacado: ");
                        double saque = scanner.nextDouble();
                        contaSaque.retirar(saque);
                        System.out.println("Saque realizado com sucesso.");
                        System.out.println("Nome: " + contaSaque.getNome() + "\n" + "Agência: "
                                + contaSaque.getAgencia() + "\n" + "Conta: " + contaSaque.getConta() + "\n"
                                +
                                "Saldo atual: " + contaSaque.consultarSaldo());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da conta: ");
                    String numeroContaConsulta = scanner.next();
                    CadastrarConta contaConsulta = contas.get(numeroContaConsulta); // Get the Conta from the map
                    if (contaConsulta != null) {
                        System.out.println(
                                "Nome: " + contaConsulta.getNome() + "\n" + "Agência: " + contaConsulta.getAgencia()
                                        + "\n"
                                        + "Conta: " + contaConsulta.getConta() + "\n" +
                                        "Saldo: " + contaConsulta.consultarSaldo());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Saindo...");
                    break;
            }
        }
    }
}