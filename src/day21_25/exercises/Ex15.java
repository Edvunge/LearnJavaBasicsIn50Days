package day21_25.exercises;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        /*
        Faça um programa para a leitura de duas notas parciais de um aluno.
        O programa deve calcular a média alcançada por aluno e apresentar:

        A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        A mensagem "Reprovado", se a média for menor do que sete;
        A mensagem "Aprovado com Distinção", se a média for igual a dez.
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println("indique a sua primeira nota?");
        double nota1 = entrada.nextDouble();

        System.out.println("indique a sua segunda nota?");
        double nota2 = entrada.nextDouble();

        System.out.println("indique a sua terceira nota?");
        double nota3 = entrada.nextDouble();

        double mediaAluno = (  ( nota1 + nota2 + nota3 ) / 3 );
        System.out.println("media: "+mediaAluno);

        if ( mediaAluno >= 7) {
            System.out.println("Aprovado.");
        } else
                if ( mediaAluno < 7 ) {
                    System.out.println("Reprovado.");
                }   else
                        if ( mediaAluno == 10 ) {
                                System.out.println("Aprovado com Distincao");
                            }
        entrada.close();
    }
}