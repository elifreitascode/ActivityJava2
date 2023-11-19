package com.elizeu;

import java.util.ArrayList;
import java.util.Scanner;

public class CartaoCredito {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> cartoes = new ArrayList<>();
    ArrayList<String> vencimentos = new ArrayList<>();
    ArrayList<String> cvvs = new ArrayList<>();

    public String DataVencimento;
    public int cvv;
    private Cliente cliente;
    private int limite;
    public float valorT;
    public String nCartao;

    public CartaoCredito(String nome){

    }
    public CartaoCredito(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int setLimite(int limite) {
        this.limite = limite;
        return limite;
    }

    public int getLimite() {
        return limite;
    }

    public float limiteAtual(float valorT, int limite){
        this.valorT = valorT;
        return limite - valorT;
    }

    public void validarlimite(int limite,float valorT){
        if (valorT > limite){
            System.out.print("LIMITE INDISPONIVEL !");
        }
        else{
            System.out.println("Valor total da compra: R$ " + valorT);
            System.out.print("\nLIMITE ATUAL: R$ " + (limite - valorT));
        }
    }
    public void infoCartao(){
        System.out.println("-=-=-=-=-= CARTÃO =-=-=-=-=-");
        System.out.print("N° CARTÃO: ");
        nCartao = scanner.next();
        cartoes.add(nCartao);
        System.out.print("VENCIMENTO: ");
        DataVencimento = scanner.next();
        vencimentos.add(DataVencimento);
        System.out.print("CVV: ");
        cvv = scanner.nextInt();
        cvvs.add(String.valueOf(cvv));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}