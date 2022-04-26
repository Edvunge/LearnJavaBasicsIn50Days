package day16_20.while_loop;

public class WhileLoop {
    public static void main(String[] args) {

        System.out.println(" Java while loop ");
        /*

Java while loop é uma instrução de fluxo de controle que permite que o código seja executado repetidamente com base em uma determinada condição booleana.
O loop while pode ser pensado como uma instrução if de repetição.
While loop em Java entra em uso quando precisamos executar repetidamente um bloco de instruções.
O loop while é considerado como uma instrução if de repetição. Se o número de iterações não for fixo, é recomendável usar o loop while.

Sintaxe:

while (expressão_teste)
{
   // declarações

  expressão_atualização;
}
As várias partes do loop While são:
*/


        System.out.println("1. Expressão de Teste:");
/*
 Nesta expressão, temos que testar a condição. Se a condição for verdadeira,
executaremos o corpo do loop e iremos atualizar a expressão. Caso contrário, sairemos do loop while.

Exemplo:

eu <= 10
*/


        System.out.println("2. Expressão de Atualização :");
/*
 Após executar o corpo do laço, esta expressão incrementa/diminui a variável do laço em algum valor.

Exemplo:

i++;
Como um loop while é executado?

O controle cai no loop while.
O fluxo salta para Condição
A condição é testada.
Se Condition for true, o fluxo entrará no Body.
Se Condition for false, o fluxo sairá do loop
As instruções dentro do corpo do loop são executadas.
A atualização ocorre.
O controle flui de volta para a Etapa 2.
O loop do-while terminou e o fluxo foi para fora.
Fluxograma para loop while (fluxo de controle):

Exemplo 1: Este programa tentará imprimir “Hello World” 5 vezes.


// Java program to illustrate while loop.

class whileLoopDemo {
    public static void main(String args[])
    {
        // initialization expression
        int i = 1;

        // test expression
        while (i < 6) {
            System.out.println("Hello World");

            // update expression
            i++;
        }
    }
}



Saída

Olá Mundo
Olá Mundo
Olá Mundo
Olá Mundo
Olá Mundo

Complexidade de tempo: O(1)

Espaço Auxiliar: O(1)
*/


        System.out.println("Exemplo de funcionamento a seco 1:");
/*
 O programa será executado da seguinte maneira.


1. O programa é iniciado.
2. i é inicializado com valor 1.
3. A condição é verificada. 1 < 6 resulta verdadeiro.
  3.a) "Hello World" é impresso pela primeira vez.
  3.b) A atualização é feita. Agora i = 2.
4. A condição é verificada. 2 < 6 resulta verdadeiro.
  4.a) "Hello World" é impresso pela 2ª vez.
  4.b) A atualização é feita. Agora i = 3.
5. A condição é verificada. 3 < 6 resulta verdadeiro.
  5.a) "Hello World" é impresso pela 3ª vez
  5.b) A atualização é feita. Agora i = 4.
6. A condição é verificada. 4 < 6 resulta verdadeiro.
  6.a) "Hello World" é impresso pela 4ª vez
  6.b) A atualização é feita. Agora i = 5.
7. A condição é verificada. 5 < 6 resulta verdadeiro.
  7.a) "Hello World" é impresso pela 5ª vez
  7.b) A atualização é feita. Agora i = 6.
8. A condição é verificada. 6 < 6 produz falso.
9. O fluxo sai do loop. O programa termina.

Exemplo 2: Este programa encontrará a soma de números de 1 a 10.


// Java program to illustrate while loop

class whileLoopDemo {
    public static void main(String args[])
    {
        int x = 1, sum = 0;

        // Exit when x becomes greater than 4
        while (x <= 10) {
            // summing up x
            sum = sum + x;

            // Increment the value of x for
            // next iteration
            x++;
        }
        System.out.println("Summation: " + sum);
    }
}

Saída

Soma: 55
Complexidade de tempo: O(1)

Espaço Auxiliar: O(1)

         */
    }
}