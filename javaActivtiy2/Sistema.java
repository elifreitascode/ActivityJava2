package com.elizeu;

import java.util.*;
import java.io.IOException;
public class Sistema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta contas = new Conta();
        CartaoCredito cartao = new CartaoCredito(cliente);

        for (int i = 0; i < 2; i++) {
            cliente.digitarNome();
            contas.infoConta();
            cartao.infoCartao();
            contas.decisao();
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("\n" + cliente.clientes.get(i));
            System.out.println("----------------------------------");
            System.out.println("AGÊNCIA: " + contas.agencias.get(i));
            System.out.println("CONTA: " + contas.ccs.get(i));
            System.out.println("-----------------------------------");
            System.out.println("Nº cartao: " + cartao.cartoes.get(i) + " \tVENC: " + cartao.vencimentos.get(i) + " \tCVV: " + cartao.cvvs.get(i));
            System.out.println("-----------------------------------");
            System.out.println("SALDO ATUAL: R$ " + contas.saldos.get(i));
        }
    }
}