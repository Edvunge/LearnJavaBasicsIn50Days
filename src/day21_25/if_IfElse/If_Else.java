package day21_25.if_IfElse;

public class If_Else {
    public static void main(String[] args) {

        System.out.println("Instrução if-else");
        /*

A tomada de decisão em Java ajuda a escrever instruções orientadas a decisões e a
executar um conjunto específico de código com base em determinadas condições.

A instrução if sozinha nos diz que, se uma condição for verdadeira, ela executará um bloco de instruções e,
se a condição for falsa, não. Mas e se quisermos fazer outra coisa se a condição for falsa. Aqui vem a instrução else.
Podemos usar a instrução else com a instrução if para executar um bloco de código quando a condição for falsa.

if-else em Java

Sintaxe:

if (condição)
{
    // Executa este bloco se
    // condição é verdadeira
}
else
{
    // Executa este bloco se
    // condição é falsa
}
Funcionamento de instruções if-else

O controle cai no bloco if.
O fluxo salta para Condição.
A condição é testada.
Se Condição for verdadeira, vá para a Etapa 4.
Se Condição resultar em falso, vá para a Etapa 5.
O bloco if ou o corpo dentro do if é executado.
O bloco else ou o corpo dentro do else é executado.
Flow sai do bloco if-else.
Fluxograma if-else:


Fluxograma de if-else em Java

Exemplo 1:


// Java program to illustrate if-else statement

class IfElseDemo {
    public static void main(String args[])
    {
        int i = 20;

        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");

        System.out.println("Outside if-else block");
    }
}

Saída

i é maior que 15
Fora do bloco if-else
Complexidade de tempo: O(1)

Espaço Auxiliar: O(1)

Exemplo de Funcionamento a Seco 1:

1. O programa é iniciado.
2. i é inicializado em 20.
3. A condição if é verificada. 20<15, produz falso.
4. o fluxo entra no bloco else.
  4.a) "i é maior que 15" é impresso
5. "Fora do bloco if-else" é impresso.
Exemplo 2:


// Java program to illustrate if-else statement

class IfElseDemo {
    public static void main(String args[])
    {
        String str = "geeksforgeeks";

        if (str == "geeks")
            System.out.println("Hello geek");
        else
            System.out.println("Welcome to GeeksforGeeks");
    }
}

Saída

Bem-vindo ao GeeksforGeeks

         */
    }
}