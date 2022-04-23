package day11_15.operator_logical;

public class OperatorLogical {
    public static void main(String[] args) {
        System.out.println("Operadores lógicos");
        /*
Esses operadores são usados para realizar a operação lógica “AND”, “OR” e “NOT”, ou seja,
a função semelhante à porta AND e OR na eletrônica digital.
Eles são usados para combinar duas ou mais condições/restrições ou para complementar a avaliação da condição original sob consideração particular.
Uma coisa a ter em mente é que a segunda condição não é avaliada se a primeira for falsa, ou seja, tem um efeito de curto-circuito.
Usado extensivamente para testar várias condições para tomar uma decisão. Vejamos cada um dos operadores lógicos de maneira detalhada:
*/

        System.out.println("Operador 'E lógico'(&&): ");
/*
Este operador retorna verdadeiro quando ambas as condições em consideração são satisfeitas ou são verdadeiras.
Se mesmo um dos dois resultar em falso, o operador resultará em falso.
Por exemplo, cond1 && cond2 retorna true quando cond1 e cond2 são true (ou seja, diferente de zero).
Sintaxe:
condição1 && condição2
Exemplo:

a = 10, b = 20, c = 20

condição1: a < b
condição2: b == c

if(condição1 && condição2)
d = a+b+c

// Já que ambas as condições são verdadeiras
d = 50.

// Java code to illustrate
// logical AND operator

import java.io.*;

class Logical {
    public static void main(String[] args)
    {
        // initializing variables
        int a = 10, b = 20, c = 20, d = 0;

        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);

        // using logical AND to verify
        // two constraints
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
    }
}

Saída:

Var1 = 10
Var2 = 20
Var3 = 20
A soma é: 50
*/

        System.out.println("Operador 'OR lógico'(||): ");
/*

 Este operador retorna verdadeiro quando uma das duas condições em consideração é satisfeita ou verdadeira.
 Se mesmo um dos dois resultar em verdadeiro, o operador resultará em verdadeiro.
 Para tornar o resultado falso, ambas as restrições precisam retornar falso.

Sintaxe:

condição1 || condição2

Exemplo:

a = 10, b = 20, c = 20

condição1: a < b
condição 2: b > c

if(condição1 || condição2)
d = a+b+c

// Como uma das condições é verdadeira
d = 50.

// Java code to illustrate
// logical OR operator

import java.io.*;

class Logical {
    public static void main(String[] args)
    {
        // initializing variables
        int a = 10, b = 1, c = 10, d = 30;

        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        System.out.println("Var4 = " + d);

        // using logical OR to verify
        // two constraints
        if (a > b || c == d)
            System.out.println("One or both"
                               + " the conditions are true");
        else
            System.out.println("Both the"
                               + " conditions are false");
    }
}

Saída:

Var1 = 10
Var2 = 1
Var3 = 10
Var4 = 30
Uma ou ambas as condições são verdadeiras
*/

        System.out.println("Operador 'NOT lógico'(!):");
/*

 Ao contrário dos dois anteriores,
 este é um operador unário e retorna verdadeiro quando a condição em consideração não é satisfeita ou é uma condição falsa.
 Basicamente, se a condição for falsa, a operação retornará verdadeiro e quando a condição for verdadeira, a operação retornará falso.

Sintaxe:

!(doença)
Exemplo:

a = 10, b = 20

!(a<b) // retorna falso
!(a>b) // retorna verdadeiro

// Java code to illustrate
// logical NOT operator
import java.io.*;

class Logical {
    public static void main(String[] args)
    {
        // initializing variables
        int a = 10, b = 1;

        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);

        // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
    }
}

Saída:

Var1 = 10
Var2 = 1
!(a < b) = verdadeiro
!(a > b) = falso
*/
    }
}