package day21_25.exercises;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*
        49. Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos
        lados de um triângulo, e se forem, verificar se é um triângulo equilátero, isóscele
        ou escaleno. Se eles não formarem um triângulo, escrever uma mensagem.
        Antes da elaboração do algoritmo, torna-se necessário a revisão de algumas
        propriedades e definições.
        Propriedade – o comprimento de cada lado de um triângulo é menor do que a
        soma dos comprimentos dos outros dois lados.
        Definição 1 - chama-se de triângulo equilátero o que tem os comprimentos dos
        três lados iguais;
        Definição 2 - chama-se de triângulo isóscele o triângulo que tem os
        comprimentos de dois lados iguais;
        Definição 3 - chama-se triângulo escaleno o triângulo que tem os
        comprimentos dos três lados diferentes.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("indique o valor do lado x?");
        double ladoX = input.nextDouble();

        System.out.println("indique o valor do lado y?");
        double ladoY = input.nextDouble();

        System.out.println("indique o valor do lado Z?");
        double ladoZ = input.nextDouble();

        if (  ( ladoX < ( ladoY + ladoZ ) ) && ( ladoY < ( ladoX + ladoZ ) ) && ( ladoZ < ( ladoX + ladoY ) ) ) {

                if ( ladoX == ladoY &&  ladoZ == ladoX  && ladoZ == ladoY ){
                    System.out.println(" chama-se de triangulo equilatero ");
                } else
                    if(  ladoX == ladoY &&  ladoZ == ladoX  ||  ladoY == ladoZ  ){
                        System.out.println(" chama-se de triangulo isoscele ");
                    } else
                        if( ladoX != ladoY  ||  ladoZ != ladoX ){
                            System.out.println(" chama-se de triangulo escaleno ");
                        }
        } else {
            System.out.println(" LAMENTAMOS MAIS NAO E UM TRIANGULO. ");
        }

        input.close();
    }
}