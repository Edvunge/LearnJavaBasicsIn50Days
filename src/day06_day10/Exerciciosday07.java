package day06_day10;

public class Exerciciosday07 {
    public static void main(String[] args) {

        /*
    Execícios
1 Abaixo segue uma lista de valores de diversos tipos. Identifique o(s) tipo(s) de cada um:
1. “Bom dia”
2. 3
3. 235.13
4. true
5. -135
6. 256.23F
7. ‘A’
8. 6463275245745L
 */

        String gretting = "Bom Dia";
        byte age = 3;
        double altura = 235.13;
        boolean isCanadian = false;
        int value = -135;
        float alturaDeUmPoste = 256.23F;
        char letra = 'A';
        long numeroDeSerie = 6463275245745L;


  /*
  2. Suponha que iremos começar a desenvolver o programa de gerenciamento de mercadorias de
uma loja. Escreva um código que declare variáveis para representar os seguintes dados:
número do pedido,
código do produto,
quantidade compra e
valor total da compra.
   */

        int numeroDoPedido;

        String codigoDoProduto;

        int quantidadeCompra;

        int valorTotalDaCompra;


        /*
        3. Continuando o exercício anterior, inicialize as variáveis com valores de acordo com o tipo de
        variável que você escolheu em cada declaração.
         */

        numeroDoPedido = 2338;

        codigoDoProduto = "25AC";

        quantidadeCompra = 2;

        valorTotalDaCompra = numeroDoPedido * quantidadeCompra;


/*
4. Continuando o exercício anterior, imprima na tela o valor de cada variável.
*/

        System.out.println("o numero do pedido e: " + numeroDoPedido);

        System.out.println("o codigo do produto e: " + codigoDoProduto);

        System.out.println("o valor final total da compra e de: " + valorTotalDaCompra);

    }
}