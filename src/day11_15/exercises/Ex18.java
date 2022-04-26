package day11_15.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        /*
        26. Considere a seguinte situação: descontam-se inicialmente 10% do salário bruto
        do trabalhador como contribuição à previdência social. Após esse desconto, há
        um outro desconto de 5% sobre o valor restante do salário bruto, a título de um
        determinado imposto. Faça um algoritmo que leia o salário bruto de um cidadão e
        imprima o seu salário líquido.
        */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("indique o seu salario bruto?");
        double salario = input.nextDouble();

        double salarioBruto = salario;

        double desc = ( 10 * salarioBruto / 100 );
        double contribuicaoProvidenciaSocial = salarioBruto - desc;

        double desc2 = ( 5 * salarioBruto / 100 );
        double impostoDAE = salarioBruto - desc2;

        double salarioLiquido = ( salarioBruto - contribuicaoProvidenciaSocial ) - (impostoDAE);

        System.out.println("o seu salario bruto e de: " + salario);
        System.out.println(" o seu salario liquido e de: " + salarioLiquido);

        input.close();
    }
}