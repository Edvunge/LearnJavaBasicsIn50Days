package day26_30.exercises;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*
        72. Um determinado clube de futebol pretende classificar seus atletas em categorias
e para isto ele contratou um programador para criar um programa que
executasse esta tarefa. Para isso o clube criou uma tabela que continha a faixa
etária do atleta e sua categoria. A tabela está demonstrada abaixo:
IDADE CATEGORIA
De 05 a 10 Infantil
De 11 a 15 Juvenil
De 16 a 20 Junior
De 21 a 25 Profissional
Construa um programa que solicite o nome e a idade de um atleta e imprima a
sua categoria.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("indique o seu nome?");
        String nomeAtleta = input.next();

        System.out.println("indique a sua idade?");
        int idadeAtleta = input.nextInt();

        switch (idadeAtleta) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("INFANTIL");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("JUVENIL");
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("JUNIOR");
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                System.out.println("PROFISSIONAL");
                break;
            default:
                System.out.println("INVALIDO");
        }
        input.close();
    }
}