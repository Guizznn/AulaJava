
package com.mycompany.estruturarepeticao;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        String nome;
        int numero;
        
        System.out.println("Digite seu nome");
        nome = scr.next();
        
        System.out.println("Digite numero");
        numero = scr.nextInt();
        
        for (int i = 1; i <= numero; i++){
            System.out.println(nome);
    }
    }
    
}
