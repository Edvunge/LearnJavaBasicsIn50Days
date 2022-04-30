package day21_25.if_IfElse;

public class If {
    public static void main(String[] args) {

        System.out.println("if");
        /*

    A tomada de decisão em Java ajuda a escrever instruções orientadas a decisões e a
executar um conjunto específico de código com base em determinadas condições.
A instrução if Java é a instrução de tomada de decisão mais simples.
Ela é usado para decidir se uma determinada instrução ou bloco de instruções será executado ou não, ou seja,
se uma determinada condição for verdadeira, um bloco de instruções será executado, caso contrário, não.


Sintaxe:


se (condição)
{
   // Instruções para executar if
   // condição é verdadeira
}


Funcionamento da instrução if


O controle cai no bloco if.
O fluxo salta para Condição.
A condição é testada.
Se Condição for verdadeira, vá para a Etapa 4.
Se Condição for falsa, vá para a Etapa 5.
O bloco if ou o corpo dentro do if é executado.
O fluxo sai do bloco if.
Fluxograma se declaração:

Operação:
A condição após a avaliação da instrução if será verdadeira ou falsa.
A instrução if em Java aceita valores booleanos e, se o valor for true, ele executará o bloco de instruções abaixo dele.
Nota: Se não fornecermos as chaves '{' e '}' após if( condition ) então, por padrão,
a instrução if considerará a instrução imediata como estando dentro de seu bloco. Por exemplo,


se (condição)
   declaração1;
   declaração2;

// Aqui se a condição for verdadeira, se bloco
// irá considerar apenas o comando1 como dentro
// seu bloco.
Exemplo 1:



// Java program to illustrate If statement

class IfDemo {
    public static void main(String args[])
    {
        int i = 10;

        if (i < 15)
            System.out.println("10 is less than 15");

        // This statement will be executed
        // as if considers one statement by default
        System.out.println("Outside if-block");
    }
}

Saída:

10 é menor que 15
Fora do bloco if

1. O programa é iniciado.
2. i é inicializado em 10.
3. A condição if é verificada. 10<15, resulta verdadeiro.
  3.a) "10 é menor que 15" é impresso.
4. "Fora do bloco if" é impresso.
Exemplo 2:


// Java program to illustrate If statement

class IfDemo {
    public static void main(String args[])
    {
        String str = "GeeksforGeeks";
        int i = 4;

        // if block
        if (i == 4) {
            i++;
            System.out.println(str);
        }

        // Executed by default
        System.out.println("i = " + i);
    }
}

Saída:

GeeksforGeeks

eu = 5
         */
    }
}