package com.elizeu;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Conta {
    public String agencia;
    public String CC;
    private double saldo;
    public double valor;
    public String destino;

    ArrayList<String> agencias = new ArrayList<>();
    ArrayList<String> ccs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> valores = new ArrayList<>();
    ArrayList<String> saldos = new ArrayList<>();
    ArrayList<String> chaves = new ArrayList<>();
    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor, double saldo){
        this.valor = valor;
        return saldo + valor;
    }

    public double sacar(double valor,double saldo){
        this.valor = valor;
        return saldo - valor;
    }

    public double transferir(double valor, String destino, double saldo){
        this.valor = valor;
        this.destino = destino;
        System.out.print("TRANSFERÊNCIA FEITA NO VALOR DE: R$ " + this.valor);
        System.out.print("CONTA DESTINO: " + destino);
        return this.saldo -= valor;
    }

    public void infoConta(){
        System.out.print("AGÊNCIA: ");
        agencia = scanner.next();
        agencias.add(agencia);
        System.out.print("CONTA CORRENTE: ");
        CC = scanner.next();
        ccs.add(CC);
    }

    public void decisao(){
        Conta conta = new Conta();
        double setSaldo = conta.setSaldo(3000);

        System.out.println(" A - sacar | B - depositar | C - transferir ");
        String resposta = scanner.next();

        if (Objects.equals(resposta, "A") || Objects.equals(resposta, "a")) {
            System.out.print("VALOR: ");
            valor = scanner.nextDouble();
            valores.add(String.valueOf(valor));
            double saldoAtual = conta.sacar(valor, setSaldo);
            saldos.add(String.valueOf(saldoAtual));
        } else if (Objects.equals(resposta, "B") || Objects.equals(resposta, "b")) {
            System.out.print("VALOR: ");
            valor = scanner.nextDouble();
            valores.add(String.valueOf(valor));
            double saldoAtual = conta.depositar(valor,setSaldo);
            saldos.add(String.valueOf(saldoAtual));
        } else {
            System.out.print("VALOR: ");
            valor = scanner.nextDouble();
            valores.add(String.valueOf(valor));
            System.out.print("CONTA DESTINO: ");
            destino = scanner.next();
            chaves.add(destino);
            double saldoAtual = conta.transferir(valor,destino,setSaldo);
            saldos.add(String.valueOf(saldoAtual));
        }
    }

}