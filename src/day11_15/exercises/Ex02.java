package day11_15.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
        7. Faça um algoritmo para calcular a área de uma circunferência, considerando a
        fórmula ÁREA = π * RAIO2. Utilize as variáveis AREA e RAIO, a constante π (pi = 3,14159)
        e os operadores aritméticos de multiplicação.
         */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        final float PI = 3.14159F;


        //ÁREA = π * RAIO2

        System.out.println("indique o valor do raio: ");
        double raio = input.nextDouble();

        double area = ( PI * ( raio * raio ) );

        System.out.printf(" o raio da circunferencia e: %.2f " , area);

        input.close();
    }
}
