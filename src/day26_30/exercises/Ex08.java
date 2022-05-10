package day26_30.exercises;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*
        80. Construa um algoritmo que leia um número inteiro de 1 a 7 e informe o dia da
        semana correspondente, sendo domingo o dia de número 1. Se o número não
        corresponder a um dia da semana, mostre uma mensagem de erro.
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println("indique um numero correspondente ao dia da semana?");
        System.out.println("1 - domingo, 2- segunda, 3- terca, 4- quarta, 5- quinta, 6- sexta, 7- sabado");
        int diaSemana = entrada.nextInt();

        switch (diaSemana)  {
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA-FEIRA");
                break;
            case 3:
                System.out.println("TERCA-FEIRA");
                break;
            case 4:
                System.out.println("QUARTA-FEIRA");
                break;
            case 5:
                System.out.println("QUINTA-FEIRA");
                break;
            case 6:
                System.out.println("SEXTA-FEIRA");
                break;
            case 7:
                System.out.println("SABADO");
                break;
            default:
                System.out.println("WRONG CHARACTER");
        }
        entrada.close();
    }
}