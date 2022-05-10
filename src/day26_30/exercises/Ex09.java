package day26_30.exercises;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        /*
        82. Construa um algoritmo que, tendo como dados de entrada o preço de um
        produto e um código de origem, mostre o preço junto de sua procedência (ex.
        500,00 – Sul). Caso o código não seja nenhum dos especificados, o produto
        deve ser encarado como importado.

        Código de origem
        1 – Sul 5
        2 - 6 – Nordeste
        3 – Norte 7
        4 - 9 – Sudeste
        5 – Leste 10
        6 - 20 – Centro Oeste
        7 – Oeste 25
        8 - 35 – Nordeste
        */

        Scanner input = new Scanner(System.in);

        System.out.println(" indique o preco de um produto?");
        System.out.println(" 1  Sul 5  \n" +
                "        2 - 6  Nordeste\n" +
                "        3 – Norte 7   \n" +
                "        4 - 9  Sudeste\n" +
                "        5 – Leste 10 \n" +
                "        6 - 20  Centro Oeste\n" +
                "        7 – Oeste 25 \n" +
                "        8 - 35  Nordeste ");
        int diaSemana = input.nextInt();

        switch (diaSemana)  {
            case 1:
                System.out.println("Sul 5");
                break;
            case 2:
                System.out.println("6 – Nordeste");
                break;
            case 3:
                System.out.println("Norte 7");
                break;
            case 4:
                System.out.println("9 – Sudeste");
                break;
            case 5:
                System.out.println("Leste 10");
                break;
            case 6:
                System.out.println("20 – Centro Oeste");
                break;
            case 7:
                System.out.println("Oeste 25");
                break;
            case 8:
                System.out.println("35 – Nordeste");
                break;
            default:
                System.out.println("WRONG CHARACTER");
        }
        input.close();

    }
}