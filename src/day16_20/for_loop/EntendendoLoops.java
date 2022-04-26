package day16_20.for_loop;

public class EntendendoLoops {
    public static void main(String[] args) {

        System.out.println(" Entendendo loops ");
        /*

Suponha que seja necessário imprimir números de 1 a 5.
Uma maneira possível de fazer isso é com a ajuda do código abaixo:


class GFG {
    public static void main(String args[])
    {

        int a;
        a = 1;
        System.out.println(a);
        a=2;
        System.out.println(a);
        a=3;
        System.out.println(a);
        a=4;
        System.out.println(a);
        a=5;
        System.out.println(a);
    }
}

O código acima pode parecer simples, mas tem muitas desvantagens, como:

Código Fixo: O código é feito para imprimir apenas os números de 1 a 5.
E se for necessário algum outro número ou algum outro padrão?
Nesse caso, esta solução sugere escrever outro programa com os novos valores necessários ou alterar cada valor individual no programa existente.
E isso continuará sempre, resultando em uma estrutura longa e fixa escrita várias vezes.
*/

        System.out.println("Código Repetitivo:");
        /*
 Como mencionado no último ponto, esta solução sugere escrever
todo o programa novamente com o valor modificado ou modificar os valores no programa existente todas as vezes.
 Mas e se forem necessários 100s desses padrões. Isso resultaria em muito código repetitivo e desnecessário.
Não generalizado: A solução sugerida não é generalizada. Isso significa que os números a serem impressos são inseridos no código pelo usuário estaticamente.
Não há um padrão predefinido que o código esteja seguindo e imprimindo o código de acordo com o padrão.
Não escalável: Todo código escrito em ciência da computação deve ser escrito de maneira escalável.
                Isso significa que o código deve funcionar bem com número mínimo de alterações para imprimir os números de 1 a 100.
Aí vem o “Loop” para ajuda, sempre que for necessária a repetição de um processo.
*/

        System.out.println("O que são Loops?");
/*
Looping em linguagens de programação é um recurso que facilita a execução de um conjunto de
instruções/funções repetidamente enquanto alguma condição é avaliada como verdadeira.
Java fornece três maneiras de executar os loops. Embora todas as formas forneçam funcionalidades básicas semelhantes,
elas diferem em sua sintaxe e tempo de verificação de condição.*/


        System.out.println("loop while:");
        /*
 Um loop while é uma instrução de fluxo de controle que permite que o código seja executado
repetidamente com base em uma determinada condição booleana. O loop while pode ser pensado como uma instrução if de repetição.

Sintaxe:

while (condição booleana)
{
   instruções de loop...
}
*/


        System.out.println("for loop:");
/*
 for loop fornece uma maneira concisa de escrever a estrutura do loop. Ao contrário de um loop while,
uma instrução for consome a inicialização, condição e incremento/decremento em uma linha,
fornecendo assim uma estrutura de loop mais curta e fácil de depurar.
Sintaxe:
for (condição de inicialização; condição de teste;
                              aumentar/diminuir)
{
    declarações)
}

Loop For aprimorado

Java também inclui outra versão do loop for introduzida no Java 5.
O loop for aprimorado fornece uma maneira mais simples de iterar pelos elementos de uma coleção ou array.
É inflexível e deve ser usado somente quando houver necessidade de iterar pelos elementos de
maneira sequencial sem conhecer o índice do elemento atualmente processado.
Sintaxe:

for (elemento T: coleção obj/array)
{
    declarações)
}
do while: do while loop é semelhante ao while, com a única diferença de que verifica a condição após a execução das instruções e,
portanto, é um exemplo de Exit Control Loop.
Sintaxe:
Faz
{
    declarações..
}
enquanto (condição);
*/


        System.out.println("Como escrever um loop?");
/*
Ao observar cuidadosamente o código fornecido acima, ele pode ser dividido nos seguintes processos ou etapas:
1) Inicialize um valor para uma variável
2) Imprima o valor
3) Altere o valor
4) Imprima o valor

Esses processos são repetidos uma e outra vez. Isso pode ser substituído por um loop da seguinte forma:

No código mostrado acima, a inicialização é a=1, a mesma coisa pode ser feita no loop for.
A segunda expressão é condição. A condição deve especificar quantas vezes o loop deve ser executado.
Depende do número de vezes que o processo deve ser repetido. Neste caso, ele deve ser executado por 5 vezes.
O valor de “a” começa em 1 e deve ser impresso até que seu valor seja 5. Portanto, a condição a ser adicionada é a<=5 .
A terceira expressão é a atualização. Toda vez que a variável de loop, aqui 'a', precisa ser atualizada de acordo com o código esperado.
Aqui o valor de 'a' é incrementado em 1 em cada operação de impressão. Portanto , a++ seria adequado nessa situação.
A última expressão é o corpo, que é a ação necessária a ser executada repetidamente. Aqui o valor de 'a' é impresso em cada execução.
Abaixo está a execução do código necessário com a ajuda do Loop:


class GFG {
    public static void main(String args[])
    {
        int a;
        for (a = 1; a <= 5; a++) {
            System.out.println(a);
        }
    }
}
         */
    }
}