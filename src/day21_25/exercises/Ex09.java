package day21_25.exercises;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        /*
        50. Suponha que o conceito de um aluno seja determinado em função da sua nota.
        Suponha, também, que esta nota seja um valor inteiro na faixa de 0 a 100,
        conforme a seguinte faixa:
        Nota Conceito
        0 a 49 Insuficiente
        50 a 64 Regular
        65 a 84 Bom
        85 a 100 Ótimo
        Crie um algoritmo que apresente o conceito e a nota do aluno.
        */

        Scanner input = new Scanner(System.in);
        int notaAluno = (int) (Math.random() * 100);

        System.out.println(notaAluno);

        if (notaAluno < 49 ) {
            System.out.println("Insuficiente.");
        } else
                if ( ( notaAluno < 50 ) || ( notaAluno < 64 ) ) {
                    System.out.println("Regular.");
                } else
                        if (  ( notaAluno < 65 ) || ( notaAluno < 84 ) ) {
                            System.out.println("Bom.");
                        } else
                                if ( ( notaAluno < 85 ) || ( notaAluno < 100 ) ) {
                                    System.out.println("Otimo.");
                                }

        input.close();
    }
}
