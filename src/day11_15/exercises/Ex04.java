package day11_15.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        9. Faça um algoritmo que:
    a) Leia o nome;
    b) Leia o sobrenome;
    c) Concatene o nome com o sobrenome;
    d) Apresente o nome completo.
        */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("indique o seu nome:?");
        String nome = input.next();

        System.out.println("indique o seu sobrenome:?");
        String sobreNome = input.next();

        System.out.println(nome + " " + sobreNome);

        String nomeCompleto = nome + " " + sobreNome;

        System.out.println("o seu nome completo e: " + nomeCompleto );

        input.close();
    }
}