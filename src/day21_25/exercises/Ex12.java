package day21_25.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        /*
        71. Crie um algoritmo que peça o nome, a altura e o peso de duas pessoas e
        apresente o nome da mais pesada e o nome da mais alta.
        */

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("indique o seu nome:?");
        String nomePessoa1 = entrada.next();

        System.out.println(" indique a sua altura?");
        double alturaPessoa1 = entrada.nextDouble();

        System.out.println(" indique o seu peso?");
        double pesoPessoa1 = entrada.nextDouble();


        System.out.println("indique o nome da segunda pessoa:?");
        String nomePessoa2 = entrada.next();

        System.out.println(" indique a altura da segunda pessoa?");
        double alturaPessoa2 = entrada.nextDouble();

        System.out.println(" indique o peso da segunda pessoa?");
        double pesoPessoa2 = entrada.nextDouble();

        if ( pesoPessoa1 > pesoPessoa2 ) {
            System.out.println("o(a) " + nomePessoa1 + " e a pessoa mais pesada.");
        } else {
            System.out.println("o(a) " + nomePessoa2 + " e a pessoa mais pesada.");
        }

        System.out.printf("%n");

        if ( alturaPessoa1 < alturaPessoa2 ) {
            System.out.println("o(a) " + nomePessoa2 + " e a pessoa com a maior altura.");
        } else {
            System.out.println("o(a) " + nomePessoa1 + " e a pessoa com a maior altura.");
        }
        entrada.close();
    }
}