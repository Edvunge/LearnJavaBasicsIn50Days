package day26_30.exercises;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
        74. O programa de uma loja de móveis mostra o seguinte menu na tela de vendas:

        1-Venda a Vista
        2-Venda a Prazo 30 dias
        3-Venda a Prazo 60 dias
        4-Venda a Prazo com 90 dias
        5-Venda com cartão de débito
        6-Venda com cartão de crédito
        Escolha a opção:
        */

        Scanner input = new Scanner(System.in);

        System.out.println(" indique a escolha desejada.");
        int operacaoImoveis = input.nextInt();

        switch ( operacaoImoveis ) {
            case 1:
                System.out.println("Venda a Vista");
                break;
            case 2:
                System.out.println("Venda a Prazo 30 dias");
                break;
            case 3:
                System.out.println("Venda a Prazo 60 dias");
                break;
            case 4:
                System.out.println(" Venda a Prazo com 90 dias ");
                break;
            case 5:
                System.out.println(" Venda com cartão de débito ");
                break;
            case 6:
                System.out.println(" Venda com cartão de crédito ");
                break;
            default:
                System.out.println("indique um outro.");
        }
        input.close();

    }
}