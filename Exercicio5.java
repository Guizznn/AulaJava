package com.mycompany.estruturarepeticao;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite 10 numeros");

        for (int i = 1; i <= 10; i++) {
            int n;
            n = scr.nextInt();

            soma += n;
        }
        System.out.println(soma);

    }

}
