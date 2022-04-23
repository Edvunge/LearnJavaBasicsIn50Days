package day11_15.operator_ternary;

public class OperatorTernary {
    public static void main(String[] args) {

        System.out.println("Operador Ternário");
        /*
O operador ternário Java é o único operador condicional que recebe três operandos.
É uma substituição de uma linha para a instrução if-then-else e é muito usada no Java.
Podemos usar o operador ternário no lugar de condições if-else ou até mesmo alternar condições usando operadores ternários aninhados.
Embora siga o mesmo algoritmo da instrução if-else,
o operador condicional ocupa menos espaço e ajuda a escrever as instruções if-else da maneira mais curta possível.

Operador Ternário em Java

Sintaxe:

                variável  =  Expressão1  ?  Expressão2:  Expressão3

If opera de forma semelhante à da instrução if-else como em Exression2 é executado se Expression1 for true else Expression3 é executado.

if(Expressão1)
{
    variável = Expressão2;
}
senão
{
    variável = Expressão3;
}
Exemplo:

num1 = 10;
num2 = 20;

res=(num1>num2) ? (num1+num2):(num1-num2)

Como num1<num2,
a segunda operação é realizada
res = num1-num2 = -10
Fluxograma de Operação Ternária
Fluxograma para Operador Ternário

Exemplo 1:

Java

// Java program to find largest among two
// numbers using ternary operator

import java.io.*;

class Ternary {
    public static void main(String[] args)
    {

        // variable declaration
        int n1 = 5, n2 = 10, max;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;

        // Print the largest number
        System.out.println("Maximum is = " + max);
    }
}

Saída

Primeiro número: 5
Segundo número: 10
O máximo é = 10
Exemplo 2:

Java

// Java code to illustrate ternary operator

import java.io.*;

class Ternary {
    public static void main(String[] args)
    {

        // variable declaration
        int n1 = 5, n2 = 10, res;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Performing ternary operation
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);

        // Print the largest number
        System.out.println("Result = " + res);
    }
}

Saída

Primeiro número: 5
Segundo número: 10
Resultado = -5
         */
    }
}