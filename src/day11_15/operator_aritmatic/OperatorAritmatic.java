package day11_15.operator_aritmatic;

public class OperatorAritmatic {
    public static void main(String[] args) {

        System.out.println("Operadores aritméticos Java com exemplos");
        /*
    Os operadores constituem o bloco de construção básico de qualquer linguagem de programação.
o Java também oferece muitos tipos de operadores que podem ser utilizados de acordo com a necessidade de realizar diversos cálculos e funções,
sejam elas lógicas, aritméticas, relacionais, etc. Eles são classificados de acordo com a funcionalidade que oferecem.

Aqui estão alguns tipos:

Operadores aritméticos
Operadores Unários
Operador de Atribuição
Operadores Relacionais
Operadores lógicos
Operador Ternário

Operadores aritméticos
Esses operadores envolvem os operadores matemáticos que podem ser usados para realizar várias operações aritméticas simples ou
avançadas nos tipos de dados primitivos chamados de operandos.
Esses operadores consistem em vários operadores unários e binários que podem ser aplicados em um ou dois operandos.
Vejamos os vários operadores que Java tem que fornecer sob os operadores aritméticos.

Operadores aritméticos em Java

Agora vamos ver cada um dos operadores aritméticos em Java:
*/

        System.out.println("1. Adição(+): ");
        /*
        Este operador é um operador binário e é usado para adicionar dois operandos.

Sintaxe:

num1 + num2
Exemplo:

num1 = 10, num2 = 20
soma = num1 + num2 = 30

// o codigo a seguir ilustra o operador de adiçao

import java.io.*;

class Addition {
    public static void main(String[] args)
    {
        // initializing variables
        int num1 = 10, num2 = 20, sum = 0;

        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // adding num1 and num2
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}

Saída

num1 = 10
num2 = 20
A soma = 30
*/

        System.out.println("2. Subtração(-):");
        /*
        Este operador é um operador binário e é usado para subtrair dois operandos.

Sintaxe:

num1 - num2
Exemplo:

num1 = 20, num2 = 10
sub = num1 - num2 = 10

// o codigo a seguir ilustra o operador de Subtracçao

import java.io.*;

class Subtraction {
    public static void main(String[] args)
    {
        // initializing variables
        int num1 = 20, num2 = 10, sub = 0;

        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // subtracting num1 and num2
        sub = num1 - num2;
        System.out.println("Subtraction = " + sub);
    }
}

Saída

num1 = 20
num2 = 10
Subtração = 10
*/

        System.out.println("3. Multiplicação(*): ");
        /*
        Este operador é um operador binário e é usado para multiplicar dois operandos.

Sintaxe:

num1 * num2
Exemplo:

num1 = 20, num2 = 10
mult = num1 * num2 = 200

// o codigo a seguir ilustra o operador de Multiplicaçao

import java.io.*;

class Multiplication {
    public static void main(String[] args)
    {
        // initializing variables
        int num1 = 20, num2 = 10, mult = 0;

        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Multiplying num1 and num2
        mult = num1 * num2;
        System.out.println("Multiplication = " + mult);
    }
}

Saída

num1 = 20
num2 = 10
Multiplicação = 200
*/
        System.out.println("4. Divisão(/): ");

/*
Este é um operador binário que é usado para dividir o primeiro operando (dividendo) pelo segundo operando (divisor) e
dar o quociente como resultado.

Sintaxe:

num1 / num2
Exemplo:

num1 = 20, num2 = 10
div = num1 / num2 = 2

// Java code to illustrate Division operator

import java.io.*;

class Division {
    public static void main(String[] args)
    {
        // initializing variables
        int num1 = 20, num2 = 10, div = 0;

        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Dividing num1 and num2
        div = num1 / num2;
        System.out.println("Division = " + div);
    }
}
Saída
num1 = 20
num2 = 10
Divisão = 2
*/
        System.out.println("5. Módulo(%): ");

/*
Este é um operador binário que é usado para retornar o resto quando o primeiro operando(dividendo) é dividido pelo segundo operando(divisor).

Sintaxe:

num1 % num2
Exemplo:

num1 = 5, num2 = 2
mod = num1 % num2 = 1

// Java code to illustrate Modulus operator

import java.io.*;

class Modulus {
    public static void main(String[] args)
    {
        // initializing variables
        int num1 = 5, num2 = 2, mod = 0;

        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Remaindering num1 and num2
        mod = num1 % num2;
        System.out.println("Remainder = " + mod);
    }
}

Saída

num1 = 5
num2 = 2
Restante = 1
         */
    }
}