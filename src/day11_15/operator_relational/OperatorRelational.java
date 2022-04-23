package day11_15.operator_relational;

public class OperatorRelational {
    public static void main(String[] args) {
        System.out.println("Operadores Relacionais");
        /*
Operadores Relacionais Java são vários operadores binários usados para verificar as relações entre dois operandos,
incluindo igualdade, maior que, menor que, etc.
Eles retornam um resultado booleano após a comparação e são amplamente usados em instruções de loop,
bem como condicionais if- else declarações e assim por diante. O formato geral de representação do operador relacional é:

Sintaxe:

         variável1  relação_operador  variável2

Vejamos cada um dos operadores relacionais em Java:
*/

        System.out.println("Operador 1: operador 'igual a' (==)");
/*
Este operador é usado para verificar se os dois operandos fornecidos são iguais ou não.
O operador retorna true se o operando do lado esquerdo for igual ao lado direito, caso contrário, false.

Sintaxe:

var1 == var2
Ilustração:

var1 = "GeeksforGeeks"
var2 = 20
var1 == var2 resulta em falso
Exemplo:


// Java Program to Illustrate equal to Operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Initializing variables
        int var1 = 5, var2 = 10, var3 = 5;

        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);

        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 == var2: "
                           + (var1 == var2));

        // Comparing var1 and var3 and
        // printing corresponding boolean value
        System.out.println("var1 == var3: "
                           + (var1 == var3));
    }
}

Saída

Var1 = 5
Var2 = 10
Var3 = 5
var1 == var2: falso
var1 == var3: verdadeiro
*/


        System.out.println("Operador 2: Operador 'Diferente de'(!=)");
/*
Este operador é usado para verificar se os dois operandos fornecidos são iguais ou não.
Funciona de forma oposta à do operador igual ao operador.
Retorna verdadeiro se o operando do lado esquerdo não for igual ao do lado direito, senão falso.

Sintaxe:

var1 != var2
Ilustração:

var1 = "GeeksforGeeks"
var2 = 20

var1 != var2 resulta em verdadeiro
Exemplo:


// Java Program to Illustrate No- equal-to Operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Initializing variables
        int var1 = 5, var2 = 10, var3 = 5;

        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);

        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 == var2: "
                           + (var1 != var2));

        // Comparing var1 and var3 and
        // printing corresponding boolean value
        System.out.println("var1 == var3: "
                           + (var1 != var3));
    }
}

Saída

Var1 = 5
Var2 = 10
Var3 = 5
var1 == var2: verdadeiro
var1 == var3: falso
*/

        System.out.println("Operador 3: operador 'maior que'(>)");
        /*
Isso verifica se o primeiro operando é maior que o segundo operando ou não.
O operador retorna true quando o operando do lado esquerdo é maior que o do lado direito.

Sintaxe:

var1 > var2
Ilustração:

var1 = 30
var2 = 20

var1 > var2 resulta em verdadeiro
Exemplo:


// Java code to Illustrate Greater than operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Initializing variables
        int var1 = 30, var2 = 20, var3 = 5;

        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);

        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 > var2: " + (var1 > var2));

        // Comparing var1 and var3 and
        // printing corresponding boolean value
        System.out.println("var3 > var1: "
                           + (var3 >= var1));
    }
}

Saída

Var1 = 30
Var2 = 20
Var3 = 5
var1 > var2: verdadeiro
var3 > var1: falso
*/

        System.out.println("Operador 4: Operador 'Menor que' (<)");
/*
Isso verifica se o primeiro operando é menor que o segundo operando ou não.
O operador retorna true quando o operando do lado esquerdo é menor que o do lado direito.
Funciona de forma oposta à do operador maior que.

Sintaxe:

var1 < var2
Ilustração:

var1 = 10
var2 = 20

var1 < var2 resulta em verdadeiro
Exemplo:


// Java code to Illustrate Less than Operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Initializing variables
        int var1 = 10, var2 = 20, var3 = 5;

        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);

        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 < var2: " + (var1 < var2));

        // Comparing var2 and var3 and
        // printing corresponding boolean value
        System.out.println("var2 < var3: " + (var2 < var3));
    }
}

Saída

Var1 = 10
Var2 = 20
Var3 = 5
var1 < var2: verdadeiro
var2 < var3: falso
*/


        System.out.println("Operador 5: Maior ou igual a (>=)");
/*
Isso verifica se o primeiro operando é maior ou igual ao segundo operando ou não.
O operador retorna verdadeiro quando o operando do lado esquerdo é maior ou igual ao do lado direito.

Sintaxe:

var1 >= var2
Ilustração:

var1 = 20
var2 = 20
var3 = 10

var1 >= var2 resulta em verdadeiro
var2 >= var3 resulta em verdadeiro
Exemplo:


// Java Program to Illustrate Greater than or equal to
// Operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Initializing variables
        int var1 = 20, var2 = 20, var3 = 10;

        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);

        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 >= var2: "
                           + (var1 >= var2));

        // Comparing var2 and var3 and
        // printing corresponding boolean value
        System.out.println("var2 >= var3: "
                           + (var3 >= var1));
    }
}

Saída

Var1 = 20
Var2 = 20
Var3 = 10
var1 >= var2: verdadeiro
var2 >= var3: falso
*/


        System.out.println("Operador 6: Menor ou igual a (<=)");
/*
Isso verifica se o primeiro operando é menor ou igual ao segundo operando ou não.
O operador retorna verdadeiro quando o operando do lado esquerdo é menor ou igual ao do lado direito.

Sintaxe:

var1 <= var2
Ilustração:

var1 = 10
var2 = 10
var3 = 9

var1 <= var2 resulta em verdadeiro
var2 <= var3 resulta em falso
Exemplo:


// Java Program to Illustrate Less
// than or equal to operator

// Importing I/O classes
import java.io.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Initializing variables
        int var1 = 10, var2 = 10, var3 = 9;

        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);

        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 <= var2: "
                           + (var1 <= var2));

        // Comparing var2 and var3 and
        // printing corresponding boolean value
        System.out.println("var2 <= var3: "
                           + (var2 <= var3));
    }
}

Saída

Var1 = 10
Var2 = 10
Var3 = 9
var1 <= var2: verdadeiro
var2 <= var3: falso
         */
    }
}