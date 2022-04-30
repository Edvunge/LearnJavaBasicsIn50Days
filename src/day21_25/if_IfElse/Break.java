package day21_25.if_IfElse;

public class Break {
    public static void main(String[] args) {

        System.out.println("Instrução de quebra (break)");
        /*

A instrução Break é uma instrução de controle de loop que é usada para encerrar o loop.
Assim que a instrução break é encontrada dentro de um loop,
as iterações do loop param ali e o controle retorna do loop imediatamente para a primeira instrução após o loop.

Sintaxe:

break;

Basicamente, as instruções break são usadas em situações em que não temos certeza sobre o
número real de iterações do loop ou queremos encerrar o loop com base em alguma condição.


Break: Em Java, o break é usado principalmente para:

Encerre uma sequência em uma instrução switch (discutida acima).
Para sair de um loop.
Usado como uma forma “civilizada” de goto.
Usando break para sair de um Loop

Usando break, podemos forçar o término imediato de um loop, ignorando a expressão condicional e qualquer código restante no corpo do loop.

Nota: Break, quando usado dentro de um conjunto de loops aninhados, apenas sairá do loop mais interno.

usando-break-to-exit-a-loop-in-java

Exemplo:


// Java program to illustrate using
// break to exit a loop
class BreakLoopDemo {
    public static void main(String args[])
    {
        // Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {
            // terminate loop when i is 5.
            if (i == 5)
                break;

            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }
}

Saída :

eu: 0
eu: 1
eu: 2
eu: 3
eu: 4

Loop completo.

Complexidade de tempo: O(1)

Espaço Auxiliar: O(1)

Usando break como uma forma de Goto

Java não possui uma instrução goto porque fornece uma maneira de ramificar de maneira arbitrária e não estruturada.
Java usa o rótulo. Um Label é usado para identificar um bloco de código.

Sintaxe:

rótulo:
{
  declaração1;
  declaração2;
  declaração3;
  .
  .
}

Agora, a instrução break pode ser usada para sair do bloco de destino.

Nota: Você não pode quebrar para nenhum rótulo que não esteja definido para um bloco delimitador.

Sintaxe:

break label;

Exemplo:


// Java program to illustrate
// using break with goto
class BreakLabelDemo {
    public static void main(String args[])
    {
        boolean t = true;

    // label first
    first : {

    // Illegal statement here
    // as label second is not
    // introduced yet break second;
    second : {
    third : {
        // Before break
        System.out.println("Before the break statement");

        // break will take the control out of
        // second label
        if (t)
            break second;
        System.out.println("This won't execute.");
    }
        System.out.println("This won't execute.");
    }

        // First block
        System.out.println("This is after second block.");
    }
    }
}

Saída :

Antes da instrução break.
Isso é depois do segundo bloco.
         */
    }
}