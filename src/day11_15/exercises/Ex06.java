package day11_15.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*
        11. Faça um algoritmo que:

        a) Obtenha o valor para a variável HT (horas trabalhadas no mês);
        b) Obtenha o valor para a variável VH (valor hora trabalhada):
        c) Obtenha o valor para a variável PD (percentual de desconto);
        d) Calcule o salário bruto => SB = HT * VH;
        e) Calcule o total de desconto => TD = (PD/100)*SB;
        f) Calcule o salário líquido => SL = SB – TD;
        g) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário
        Liquido.

         */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("indique as horas trabalhadas no mes:?");
        double horasTrabalhadasNoMes = input.nextDouble();

        System.out.println("indique o valor da hora trabalhada no mes:?");
        double valorHoraTrabalhada = input.nextDouble();

        System.out.println("indique o percentual de desconto:?");
        double percentualDeDesconto = input.nextDouble();

        double salarioBruto = ( horasTrabalhadasNoMes * valorHoraTrabalhada );

        double totalDeDescontos = ( ( percentualDeDesconto / 100 ) * salarioBruto );

        double salarioLiquido = ( salarioBruto - totalDeDescontos );

        System.out.println("As Horas trabalhadas sao: " + horasTrabalhadasNoMes );
        System.out.println("o seu salrio bruto e: " + salarioBruto );
        System.out.println(" o seu desconto e de: " + totalDeDescontos );
        System.out.println(" o seu salario liquido e de: " + salarioLiquido );

        input.close();
    }
}