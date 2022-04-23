package day11_15.operator_unary;

public class JavaUnaryOperatorWithExamples {
    public static void main(String[] args) {

        System.out.println("Operadores Unários em Java");
        /*

Os operadores unários Java são os tipos que precisam de apenas um operando para realizar qualquer operação como incremento,
decremento, negação,
etc. Consiste em vários operadores aritméticos, lógicos e outros que operam em um único operando.
Vamos examinar os vários operadores unários em detalhes e ver como eles operam.
*/
        System.out.println("Operador 1: Unário menos (-)");
        /*
Este operador pode ser usado para converter um valor positivo em um negativo.

Sintaxe:

~(operando)


Ilustração:

a = -10

Exemplo:

// Java Program to Illustrate Unary - Operator

// Importing required classes
import java.io.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Declaring a custom variable
        int n1 = 20;

        // Printing the above variable
        System.out.println("Number = " + n1);

        // Performing unary operation
        n1 = -n1;

        // Printing the above result number
        // after unary operation
        System.out.println("Result = " + n1);
    }
}
Saída
Número = 20
Resultado = -20
*/

        System.out.println("Operador 2: Operador 'NÃO' (!)");
/*
Isso é usado para converter verdadeiro em falso ou vice-versa. Basicamente, ele inverte o estado lógico de um operando.

Sintaxe:

!(operando)

Ilustração:

cond = !true;
//cond < falso

Exemplo:

// Java Program to Illustrate Unary NOT Operator

// Importing required classes
import java.io.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Initializing variables
        boolean cond = true;
        int a = 10, b = 1;

        // Displaying values stored in above variables
        System.out.println("Cond is: " + cond);
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);

        // Displaying values stored in above variables
        // after applying unary NOT operator
        System.out.println("Now cond is: " + !cond);
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
    }
}

Saída:

Cond é: verdadeiro
Var1 = 10
Var2 = 1
Agora cond é: false
!(a < b) = verdadeiro
!(a > b) = falso
*/
        System.out.println("Operador 3: Incremento(++)");
/*
É usado para incrementar o valor de um inteiro. Pode ser usado de duas maneiras distintas:
*/

System.out.println("3.1: Operador pós-incremento");

/*
Quando colocado após o nome da variável, o valor do operando é incrementado,
mas o valor anterior é retido temporariamente até a execução desta instrução e é atualizado antes da execução da próxima instrução.

Sintaxe:

num++
Ilustração:

número = 5
num++ = 6
*/
        System.out.println("3.2: Operador de pré-incremento");
/*
Quando colocado antes do nome da variável, o valor do operando é incrementado instantaneamente.

Sintaxe:

++num
Ilustração:

número = 5
++num = 6
*/
        System.out.println("Operador 4: Decremento (–)");
/*
É usado para decrementar o valor de um inteiro. Pode ser usado de duas maneiras distintas:
*/

        System.out.println("4.1: Operador pós-decremento");

                /*
Quando colocado após o nome da variável, o valor do operando é decrementado,
mas os valores anteriores são retidos temporariamente até a execução desta instrução e é atualizado antes da execução da próxima instrução.

Sintaxe:

num--
Ilustração:

número = 5
num-- = 4
*/
        System.out.println("4.2: Operador de pré-decremento");
/*
Quando colocado antes do nome da variável, o valor do operando é decrementado instantaneamente.

Sintaxe:

--num
Ilustração:

número = 5
--num = 4
*/
        System.out.println("Operador 5: Complemento bit a bit(~)");
/*
Este operador unário retorna a representação em complemento de um do valor ou operando de entrada,
ou seja, com todos os bits invertidos, ou seja, faz cada 0 para 1, e cada 1 para 0.

Sintaxe:

~(operando)
Ilustração:

a = 5 [0101 em binário]
resultado = ~5

Isso executa um complemento bit a bit de 5
~0101 = 1010 = 10 (em decimal)

Então o compilador dará o complemento de 2
desse número.
O complemento de 2 de 10 será -6.
resultado = -6
Exemplo:

// Java program to Illustrate Unary
// Bitwise Complement Operator

// Importing required classes
import java.io.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Declaring a variable
        int n1 = 6, n2 = -2;

        // Printing numbers on console
        System.out.println("First Number = " + n1);
        System.out.println("Second Number = " + n2);

        // Printing numbers on console after
        // performing bitwise complement
        System.out.println(
            n1 + "'s bitwise complement = " + ~n1);
        System.out.println(
            n2 + "'s bitwise complement = " + ~n2);
    }
}

Saída:

Primeiro número = 6
Segundo Número = -2
complemento bit a bit de 6 = -7
complemento bit a bit de -2 = 1
         */
    }
}