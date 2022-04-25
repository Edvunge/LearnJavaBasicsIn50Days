package day16_20.for_loop;

public class ForLoop {
    public static void main(String[] args) {

        System.out.println(" For Loop em Java ");
        /*
Looping em linguagens de programação é um recurso que facilita a execução de um conjunto
de instruções/funções repetidamente enquanto alguma condição é avaliada como verdadeira.
Em Java, é improvável que qualquer linguagem de programação forneça quatro maneiras de executar os loops, ou
seja, while loop, for loop, for-each loop, do-while loop ou podemos chamá-lo basicamente de três tipos de loops em alguns livros,
como for-each loop é tratado como aprimorado para loop. Vamos discutir para loop em detalhes.

Geralmente, tendemos a usar loops while, pois entendemos melhor se estamos em loops de aprendizado, mas depois de uma saturação, nós,
como programadores, tendemos a inclinar-se para o loop for,
pois é mais limpo e as fundações são realizadas em uma sequência direta para a qual temos que entender cuidadosamente a sintaxe da seguinte forma:


Sintaxe: Consiste em três partes, a saber, conforme listado:

Inicialização de variáveis
Condição específica de acordo com o requisito sobre o qual essas variáveis definidas precisam ser iteradas
Uma parte final onde geralmente jogamos com variáveis para chegar ao estado de condição final.

for(inicialização; expressão booleana; instrução de atualização) {
// Corpo do loop for
}
Esta é geralmente a estrutura básica de peregrinação do loop for.

Vejamos alguns exemplos básicos do uso do loop for e as armadilhas comuns no uso do loop for,
o que nos permite saber ainda melhor como o trabalho interno será representado enquanto brincamos com códigos.
*/


        System.out.println("Caso de uso 1:");

        /*
        fornecer expressão no loop for é uma obrigação

O loop for deve consistir em uma expressão válida na falha da instrução de loop, o que pode levar a um loop infinito. A declaração

for ( ; ; )
 é semelhante a
while(true)
Nota: O que foi dito acima é o cerne da programação avançada, pois é a origem da construção da lógica na programação.

Exemplo

// Java program to illustrate Infinite For loop

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // For loop
        for (;;) {

            // Print statement everytime condition holds
            // true making body to execute
            System.out.println("This is an infinite loop");
        }
    }
}

Saída: Imprime a declaração “Este é um loop infinito” repetidamente.

Este é um loop infinito
Este é um loop infinito
Este é um loop infinito
Este é um loop infinito
...
...
Este é um loop infinito
*/


        System.out.println("Caso de uso 2: ");

        /*
        inicializando várias variáveis

Em Java, várias variáveis podem ser inicializadas no bloco de inicialização do loop for, independentemente de você usá-las no loop ou não.

Exemplo:


// Java Program to Illustrate Initializing Multiple
// Variables in Initialization Block

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Declaring an integer variable
        int x = 2;

        // For loop to iterate
        for (long y = 0, z = 4; x < 10 && y < 10;
             x++, y++) {
            // Printing value/s stored in variable named y
            // defined inside body of for loop
            System.out.println(y + " ");
        }

        // Printing value/s stored in variable named x
        // defined outside body of for loop
        System.out.println(x);
    }
}

Saída

0
1
2
3
4
5
6
7
10

No código acima, há uma variação simples no loop for. Duas variáveis são declaradas e inicializadas no bloco de inicialização.
A variável 'z' não está sendo usada. Além disso, os outros dois componentes contêm variáveis extras.
Assim, pode-se ver que os blocos podem incluir variáveis extras que podem não ser referenciadas umas pelas outras.
*/

        System.out.println("Caso de uso 3:");

        /*
        Redeclaração de uma variável no bloco de inicialização

Suponha que uma variável de inicialização já esteja declarada como um inteiro.
Aqui não podemos declará-lo novamente no loop for com outro tipo de dados da seguinte forma:

Exemplo 1:


// Java Program to Illustrate Redeclaring a Variable
// in Initialization Block

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Declaring an integer variable
        int x = 0;

        // Redeclaring above variable
        // as long will not work
        for (long y = 0, x = 1; x < 5; x++) {

            // Printing the value inside the variable
            System.out.print(x + " ");
        }
    }
}

Saída:

Example3.java:12: erro: variável x já está definida no método main(String[])
        for(y longo = 0, x = 1; x < 5; x++)
Aqui, x já foi inicializado como zero como um inteiro e está sendo declarado novamente no loop com o tipo de dados long.

Mas esse problema pode ser corrigido modificando ligeiramente o código. Aqui, as variáveis x e y são declaradas de uma maneira diferente.

Exemplo 2:


// Java Program to Illustrate Redeclaring a Variable
// in Initialization Block

// Main class
public class GFG {

    // main driver method
    public static void main(String[] args)
    {
        // Declaring and initializing variables
        int x = 0;
        long y = 10;

        // For loop to iterate over till
        // custom specified check
        for (y = 0, x = 1; x < 5; x++) {

            // Printing value contained in memory block
            // of the variable
            System.out.print(x + " ");
        }
    }
}

Saída:

1 2 3 4
         */

        System.out.println("Caso de uso 4:");
/*
 As variáveis declaradas no bloco de inicialização devem ser do mesmo tipo

É apenas senso comum que quando declaramos uma variável como mostrado abaixo:

int x, y;
Aqui ambas as variáveis são do mesmo tipo. É exatamente o mesmo no bloco de inicialização do loop for também.

Exemplo:


// Java program to Illustrate Declaring a Variable
// in Initialization Block

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Declaring integer variable
        // int x;

        // Note:  This will cause error;

        // Redeclaring x as long will not work
        for (long y = 0, x = 1; x < 5; x++) {

            // Printing the value stored
            System.out.print(x + " ");
        }
    }
}

Saída

1 2 3 4
*/

        System.out.println("Caso de uso 5:");
/*
As variáveis no loop são acessíveis apenas dentro

As variáveis que são declaradas no bloco de inicialização podem ser acessadas
apenas dentro do loop conforme temos pelo conceito de escopo de variáveis.

Exemplo:


// Java Program to Illustrate Scope of Initializing
// Variables Within the oop

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // x and y scope is declared only
        // within for loop
        for (int x = 0, y = 0; x < 3 && y < 3; x++, y++) {
            // Printing value stored in variable named y
            System.out.println(y + " ");
        }

        // Printing value stored in variable named x
        // after inner loop is over
        System.out.println(x);
    }
}

Erro:

Example5.java:13: erro: não é possível encontrar o símbolo
        System.out.println(x);
No exemplo acima, a variável x não é acessível fora do loop. A instrução que é comentada dá um erro de compilador.
         */
    }
}