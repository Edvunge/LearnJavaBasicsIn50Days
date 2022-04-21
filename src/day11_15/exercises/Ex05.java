package day11_15.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*
        10. Faça um algoritmo que:
a) Leia um número inteiro;
b) Leia um segundo número inteiro;
c) Efetue a adição dos dois valores;
d) Apresente o valor calculado.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("indique um numero inteiro:?");
        int numeroInteiro = entrada.nextInt();

        System.out.println("indique o segundo numero:?");
        int segundoNumero = entrada.nextInt();

        int soma = ( numeroInteiro + segundoNumero );

        System.out.println("o valor calculado e: " + soma );

        entrada.close();
    }
}
