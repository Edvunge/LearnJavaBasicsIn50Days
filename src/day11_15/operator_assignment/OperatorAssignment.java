package day11_15.operator_assignment;

public class OperatorAssignment {
    public static void main(String[] args) {
        System.out.println("Operadores de atribuição");
        /*
Esses operadores são usados para atribuir valores a uma variável.
O operando do lado esquerdo do operador de atribuição é uma variável e o operando do lado direito do operador de atribuição é um valor.
O valor do lado direito deve ser do mesmo tipo de dado do operando do lado esquerdo.
Caso contrário, o compilador irá gerar um erro.
Isso significa que os operadores de atribuição têm associatividade da direita para a esquerda, ou seja,
o valor dado à direita do operador é atribuído à variável à esquerda.
Portanto, o valor do lado direito deve ser declarado antes de usá-lo ou deve ser uma constante.
O formato geral do operador de atribuição é, valor do operador variável;
*/

        System.out.println("Tipos de operadores de atribuição em Java");
/*
O Operador de Atribuição é geralmente de dois tipos. Eles estão:
*/

        System.out.println("1. Operador de Atribuição Simples:");
        /*
O Operador de Atribuição Simples é usado com o sinal “=” onde o lado esquerdo consiste no operando e o lado direito consiste em um valor.
O valor do lado direito deve ser do mesmo tipo de dados que foi definido no lado esquerdo.
         */

        System.out.println("2. Operador de Atribuição Composto:");
/*
 O Operador Composto é usado onde +,-,*, e / é usado junto com o operador =.

Vejamos cada um dos operadores de atribuição e como eles operam:
*/

        System.out.println("1. (=) operador:");
/*
Este é o operador de atribuição mais simples, que é usado para atribuir o valor à direita à variável à esquerda.
Esta é a definição básica de um operador de atribuição e como ele funciona.

Sintaxe:

num1 = num2;
Exemplo:

a = 10;
ch = 's';

// Java code to illustrate "=" operator

import java.io.*;

class Assignment {
    public static void main(String[] args)
    {
        // Declaring variables
        int num;
        String name;

        // Assigning values
        num = 10;
        name = "GeeksforGeeks";

        // Displaying the assigned values
        System.out.println("num is assigned: " + num);
        System.out.println("name is assigned: " + name);
    }
}


Saída

número é atribuído: 10
nome é atribuído: GeeksforGeeks
*/

        System.out.println("2. (+=) operador: ");
        /*
Este operador é um composto dos operadores '+' e '='.
Ele opera adicionando o valor atual da variável à esquerda ao valor à direita e, em seguida, atribuindo o resultado ao operando à esquerda.

Sintaxe:

num1 += num2;
Exemplo:

a += 10

Isso significa,
a = a + 10

// Java code to illustrate "+="

import java.io.*;

class Assignment {
    public static void main(String[] args)
    {

        // Declaring variables
        int num1 = 10, num2 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Adding & Assigning values
        num1 += num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1);
    }
}

Saída

num1 = 10
num2 = 20
num1 = 30
*/

        System.out.println("3. (-=) operador: \n");
        /*
Este operador é um composto dos operadores '-' e '='.
Ele opera subtraindo o valor da variável à direita do valor atual da variável à esquerda e atribuindo o resultado ao operando à esquerda.

Sintaxe:

num1 -= num2;
Exemplo:

a -= 10

Isso significa,
a = a - 10

// Java code to illustrate "-="

import java.io.*;

class Assignment {
    public static void main(String[] args)
    {

        // Declaring variables
        int num1 = 10, num2 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Subtracting & Assigning values
        num1 -= num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1);
    }
}

Saída

num1 = 10
num2 = 20
num1 = -10
*/
        System.out.println("4. Operador (*=):");
/*
 Este operador é um composto dos operadores '*' e '='.
 Ele opera multiplicando o valor atual da variável à esquerda pelo valor à direita e, em seguida, atribuindo o resultado ao operando à esquerda.

Sintaxe:

num1 *= num2;
Exemplo:

a *= 10
Isso significa,
a = a * 10

// Java code to illustrate "*="

import java.io.*;

class Assignment {
    public static void main(String[] args)
    {

        // Declaring variables
        int num1 = 10, num2 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Multiplying & Assigning values
        num1 *= num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1);
    }
}

Saída

num1 = 10
num2 = 20
num1 = 200
*/

        System.out.println("5. (/=) operador: ");
/*
Este operador é um composto dos operadores '/' e '='.
Ele opera dividindo o valor atual da variável à esquerda pelo valor à direita e, em seguida, atribuindo o quociente ao operando à esquerda.

Sintaxe:

num1 /= num2;
Exemplo:

a /= 10
Isso significa,
a = a/10

// Java code to illustrate "/="

import java.io.*;

class Assignment {
    public static void main(String[] args)
    {

        // Declaring variables
        int num1 = 20, num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Dividing & Assigning values
        num1 /= num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1);
    }
}

Saída

num1 = 20
num2 = 10
num1 = 2
*/

        System.out.println("6. (%=) operador:");
/*
Este operador é um composto dos operadores '%' e '='.
Ele opera dividindo o valor atual da variável à esquerda pelo valor à direita e atribuindo o restante ao operando à esquerda.

Sintaxe:

num1 %= num2;
Exemplo:

a %= 3

Isso significa,
a = a % 3

// Java code to illustrate "%="

import java.io.*;

class Assignment {
    public static void main(String[] args)
    {

        // Declaring variables
        int num1 = 5, num2 = 3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Moduling & Assigning values
        num1 %= num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1);
    }
}

Saída

num1 = 5
num2 = 3
num1 = 2
         */
    }
}