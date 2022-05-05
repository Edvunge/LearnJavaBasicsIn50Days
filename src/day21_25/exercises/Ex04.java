package day21_25.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        35. Considere que o último concurso vestibular apresentou três provas: Português,
        Matemática e Conhecimentos Gerais. Considerando que para cada candidato
        tem-se um registro contendo o seu nome e as notas obtidas em cada uma das
        provas, construa um algoritmo que forneça:

        a) o nome e as notas em cada prova do candidato.
        b) a média do candidato.
        c) uma informação dizendo se o candidato foi aprovado ou não. Considere que
        um candidato é aprovado se sua média for maior que 7.0 e se não apresentou
        nenhuma nota abaixo de 5.0
        */

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println(" qual o seu Nome?");
        String nomeAluno = entrada.next();

        System.out.println("indique a sua nota do exame de Portugues?");
        double notaPortugues = entrada.nextDouble();

        System.out.println("indique a sua nota do exame Matematica?");
        double notaMatematica = entrada.nextDouble();

        System.out.println("indique a sua nota do exame Conhecimentos Gerais?");
        double notaConhecimentosGerais = entrada.nextDouble();

        double media = ( ( notaPortugues + notaMatematica + notaConhecimentosGerais ) / 3 );


        if ( media > 7.0 ) {
            System.out.printf( nomeAluno + " Aprovado.");
        } else if ( media < 5.0  ) {
            System.out.printf( nomeAluno + " Reprovado.");
        }


        entrada.close();
    }
}