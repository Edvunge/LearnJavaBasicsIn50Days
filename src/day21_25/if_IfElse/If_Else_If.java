package day21_25.if_IfElse;

public class If_Else_If {
    public static void main(String[] args) {

        System.out.println(" if-else-if");
        /*

A tomada de decisão em Java ajuda a escrever instruções orientadas a decisões e a
executar um conjunto específico de código com base em determinadas condições.
A escada Java if-else-if é usada para decidir entre várias opções. As instruções if são executadas de cima para baixo.
Assim que uma das condições que controlam o if for verdadeira, a instrução associada a esse if é executada e o restante da escada é ignorado.
Se nenhuma das condições for verdadeira, a instrução else final será executada.


Sintaxe:


if (condição)
    afirmação 1;
else if (condição)
    afirmação 2;
.
.
else
    demonstração;


Funcionamento da escada if-else-if:


O controle cai no bloco if.
O fluxo salta para a Condição 1.
A condição é testada.
Se Condição for verdadeira, vá para a Etapa 4.
Se Condição for falsa, vá para a Etapa 5.
O bloco atual é executado. Vá para o Passo 7.
O fluxo salta para a Condição 2.
Se Condição for verdadeira, vá para a etapa 4.
Se Condição resultar em falso, vá para a Etapa 6.
O fluxo salta para a Condição 3.
Se Condição for verdadeira, vá para a etapa 4.
Se Condition resultar em false, execute o bloco else.
Vá para o Passo 7.
Saia da escada if-else-if.
Fluxograma if-else-if escada:




Exemplo 1:


Java

// Java program to illustrate if-else-if ladder

import java.io.*;

class GFG {
    public static void main(String[] args)
    {
        // initializing expression
        int i = 20;

        // condition 1
        if (i == 10)
            System.out.println("i is 10\n");

        // condition 2
        else if (i == 15)
            System.out.println("i is 15\n");

        // condition 3
        else if (i == 20)
            System.out.println("i is 20\n");

        else
            System.out.println("i is not present\n");

        System.out.println("Outside if-else-if");
    }
}

Saída:

eu tenho 20

Fora do if-else-if




Exemplo de funcionamento a seco 1:


1. O programa é iniciado.
2. i é inicializado em 20.
3. a condição 1 é verificada. 20 == 10, produz falso.
4. a condição 2 é verificada. 20 == 15, produz falso.
5. a condição 3 é verificada. 20 == 20, resulta verdadeiro.
  5.a) "i é 20" é impresso.
6. "Fora if-else-if" é impresso.
7. O programa termina.
Exemplo 2:


Java

// Java program to illustrate if-else-if ladder

import java.io.*;

class GFG {
    public static void main(String[] args)
    {

        // initializing expression
        int i = 20;

        // condition 1
        if (i < 10)
            System.out.println("i is less than 10\n");

        // condition 2
        else if (i < 15)
            System.out.println("i is less than 15\n");

        // condition 3
        else if (i < 20)
            System.out.println("i is less than 20\n");

        else
            System.out.println("i is greater than or equal to 20\n");

        System.out.println("Outside if-else-if");
    }
}

Saída:

i é maior ou igual a 20

Fora do if-else-if

         */
    }
}
