package com.elizeu;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    private int cod;
    public String nome;
    public float valor;
    public int quantidade;
    private CartaoCredito[] cartoes;

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> clientes = new ArrayList<>();

    private  static int contador = 1;

    public Cliente(){
        cartoes = new CartaoCredito[2];
        cod = contador;
        contador++;
    }

    public static int getContador(){
        return contador;
    }

    public static void setContador(int contador){
        Cliente.contador = contador;
    }

    public void digitarNome(){
        System.out.print("\nDIGITE SEU NOME: ");
        nome = scanner.next();
        clientes.add(nome);
    }

    public int getCod(){
        return cod;
    }

    public void setCod(int cod){
        this.cod = cod;
    }

    public float comprar(float valor,int quantidade){
        this.valor = valor;
        this.quantidade = quantidade;
        return valor*quantidade;

    }


}