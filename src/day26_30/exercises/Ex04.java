package day26_30.exercises;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        75. Faça um programa que receba o valor da venda, escolha a condição de
        pagamento no menu e mostre o total da venda final conforme condições a seguir:

        1. Venda a Vista - desconto de 10%
        2. Venda a Prazo 30 dias - desconto de 5%
        3. Venda a Prazo 60 dias - mesmo preço
        4. Venda a Prazo 90 dias - acréscimo de 5%
        5. Venda com cartão de débito - desconto de 8%
        6. Venda com cartão de crédito - desconto de 7%
        */

        Scanner input = new Scanner(System.in);

        System.out.println("escolha a condicao de pagamento no menu");
        int operacaoImoveis = input.nextInt();

        switch (operacaoImoveis) {
            case 1:
                System.out.println("Venda a Vista - desconto de 10%");
                break;
            case 2:
                System.out.println("Venda a Prazo 30 dias - desconto de 5%");
                break;
            case 3:
                System.out.println("Venda a Prazo 60 dias - mesmo preco");
                break;
            case 4:
                System.out.println(" Venda a Prazo 90 dias - acrescimo de 5% ");
                break;
            case 5:
                System.out.println(" Venda com cartao de debito - desconto de 8% ");
                break;
            case 6:
                System.out.println(" Venda com cartao de credito - desconto de 7% ");
                break;
            default:
                System.out.println("indique um outro.");
        }
        input.close();
    }
}