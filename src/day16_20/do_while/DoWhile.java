package day16_20.do_while;

public class DoWhile {
    public static void main(String[] args) {

        System.out.println("Loop do-while");
        /*
Os loops em Java são usados quando precisamos executar repetidamente um bloco de instruções.
O loop do-while Java é um loop de controle Exit.
Portanto, diferentemente do loop for ou while, um do-while verifica a condição após executar as instruções do corpo do loop.

Sintaxe:

do
{
    // Loop Body
    Update_expression
}

// Condition check
while (test_expression);


Ilustração:


// Java Program to Illusterate One Time Iteration
// Inside do-while Loop
// When Condition IS Not Satisfied

// Class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // initial counter variable
        int i = 0;

        do {

            // Body of loop that will execute minimum
            // 1 time for sure no matter what
            System.out.println("Print statement");
            i++;
        }

        // Checking condition
        // Note: It is being checked after
        // minimum 1 iteration
        while (i < 0);
    }
}


Saída
Imprimir extrato
Explicação da saída:

No código acima, descobrimos que a condição é verificada posteriormente, pois o corpo dentro do será executado uma vez sem falhas,
pois a condição é verificada posteriormente.
Portanto, sempre que queremos exibir o menu e, posteriormente, o comando continuar no terminal, sempre usamos o loop do-while.

Componentes do loop do-while
A. Expressão de Teste:
Nesta expressão, temos que testar a condição. Se a condição for verdadeira, executaremos o corpo do loop e iremos atualizar a expressão.
Caso contrário, sairemos do loop while. Por exemplo:

eu <= 10


B. Expressão de Atualização : Após executar o corpo do laço, esta expressão incrementa/diminui a variável do laço em algum valor.

Por exemplo:

i++;
Execução do loop do-While
O controle cai no loop do-while.
As instruções dentro do corpo do loop são executadas.
A atualização ocorre.
O fluxo salta para Condição
A condição é testada.
Se Condição for verdadeira, vá para a Etapa 6.
Se Condition for false, o fluxo sairá do loop
O fluxo volta para a Etapa 2.
Loop do-while do fluxograma:



Implementação:

Exemplo 1: Este programa tentará imprimir “Hello World” 5 vezes.


// Java Program to Illustrate Do-while Loop

// Class
class GFG {

    // Main driver method
    public static void main(String args[])
    {

        // Declaring and initialization expression
        int i = 1;

        // Do-while loop
        do {

            // Body od do-while loop
            // Print statement
            System.out.println("Hello World");

            // Update expression
            i++;
        }

        // Test expression
        while (i < 6);
    }
}

Saída:

Olá Mundo
Olá Mundo
Olá Mundo
Olá Mundo
Olá Mundo


Espaço Auxiliar: O(1)

Explicação da saída:

O programa será executado da seguinte maneira:

O programa é iniciado.
i é inicializado com valor 1.
A execução entra no loop
“Hello World” é impresso pela primeira vez.
A atualização está feita. Agora i = 2.
A condição é verificada. 2 < 6 resulta verdadeiro.
A execução entra no loop.
“Hello World” é impresso pela 2ª vez.
A atualização está feita. Agora i = 3.
A condição é verificada. 3 < 6 resulta verdadeiro.
A execução entra no loop
“Hello World” é impresso pela 3ª vez
A atualização está feita. Agora i = 4.
A condição é verificada. 4 < 6 resulta verdadeiro.
A execução entra no loop
“Hello World” é impresso pela 4ª vez
A atualização está feita. Agora i = 5.
A condição é verificada. 5 < 6 resulta verdadeiro.
A execução entra no loop
“Hello World” é impresso pela 5ª vez
A atualização está feita. Agora i = 6.
A condição é verificada. 6 < 6 produz falso.
O fluxo sai do loop.
Exemplo 2

// Java Program to Illustrate Do-while Loop

// Class
class GFG {

    // Main driver method
    public static void main(String args[])
    {
        // Declaring and initializing integer values
        int x = 21, sum = 0;

        // Do-while loop
        do {

            // Execution statements(Body of loop)

            // Here, the line will be printed even
            // if the condition is false
            sum += x;
            x--;
        }

        // Now checking condition
        while (x > 10);

        // Summing up
        System.out.println("Summation: " + sum);
    }
}

Saída:

Soma: 176
         */
    }
}
