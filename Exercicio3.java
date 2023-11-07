package com.mycompany.estruturarepeticao;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        String nome;
        System.out.print("Digite seu nome");
        nome = scr.next();

        for (int i = 1; i < 10; i++) {
            System.out.println(nome);
        }

    }

}
