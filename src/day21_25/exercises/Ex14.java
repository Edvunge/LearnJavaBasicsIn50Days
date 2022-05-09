package day21_25.exercises;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        /*
        4.18 (Calculador de limite de crédito) Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o
        limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:

        a) Número de conta.
        b) Saldo no início do mês.
        c) Total de todos os itens cobrados desse cliente no mês.
        d) Total de créditos aplicados ao cliente no mês.
        e) Limite de crédito autorizado.

        O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos), exibir o novo saldo e
        determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve
        exibir a mensagem "Limite de crédito excedido".
        */

        Scanner entrada = new Scanner(System.in);

        int min = -900000000;
        int max = 900000000;

        int numeroConta = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(numeroConta);

        int saldoInicioMes = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(numeroConta);

        int totalTodosItensCobradosClienteMes = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(numeroConta);

        int totalCreditoscAplicadosClienteMes = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(numeroConta);

        int limiteCreditoAutorizado = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(numeroConta);

        double despesas = 0;
        double creditos = 0;


         // double novoSaldo = ( saldoInicioMes + despesas – creditos );

        entrada.close();
    }
}