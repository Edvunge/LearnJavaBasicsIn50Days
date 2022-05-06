package day21_25.exercises;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*
        46. Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de
            serviços é de:
        • R$ 5.50 por diária, se o número de diárias for maior que 15;
        • R$ 6.00 por diária, se o número de diárias for menor que 15.
        Construa um algoritmo que mostre o nome e o total da conta de um cliente.
        */

        Scanner input = new Scanner(System.in);
        double diariaHotel = 60.00;

        System.out.println("qual e o seu nome?");
        String nomeCliente = input.next();

        System.out.println("qual o numero de dias pretende ficar em nosso hotel?");
        int numeroDiaria = input.nextInt();

        double valorTotalDiaria = numeroDiaria * diariaHotel;

        double valorFinalComTaxaServiço1 = valorTotalDiaria + 5.50;
        double valorFinalComTaxaServiço2 = valorTotalDiaria + 6.00;

        if ( numeroDiaria > 15 ) {
            System.out.println("o seu nome: " + nomeCliente);
            System.out.println(" o valor final da sua conta e de: " + valorFinalComTaxaServiço1);
        } else if ( numeroDiaria < 15 ) {
            System.out.println("o seu nome: " + nomeCliente);
            System.out.println(" o valor final da sua conta e de: " + valorFinalComTaxaServiço2);
        }

        input.close();
    }
}