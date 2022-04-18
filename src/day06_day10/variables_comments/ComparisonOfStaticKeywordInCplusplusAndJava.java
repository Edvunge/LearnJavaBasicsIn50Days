package day06_day10.variables_comments;

public class ComparisonOfStaticKeywordInCplusplusAndJava {
    public static void main(String[] args) {

        System.out.println("Comparação de palavra-chave estática em C++ e Java");
/*
A palavra-chave static é usada para quase o mesmo propósito em C++ e Java.
Existem algumas diferenças embora. abordaremos as  semelhanças e diferenças de palavras-chave estáticas em C++ e Java.

Semelhanças entre C++ e Java para palavra-chave static:

Membros de dados estáticos podem ser definidos em ambas as linguagens.
As funções de membro estáticas podem ser definidas em ambas as linguagens.

O acesso fácil de membros estáticos é possível, sem a criação de alguns objetos.
Diferenças entre C++ e Java para palavra-chave estática:

C++ não suporta blocos estáticos. Java suporta bloco estático (também chamado de cláusula estática).
É usado para a inicialização estática de uma classe.
Variáveis locais estáticas podem ser declaradas.	Variáveis locais estáticas não são suportadas.
Os pontos acima são discutidos em detalhes abaixo:

1. Membros de dados estáticos:
Como C++, membros de dados estáticos em Java são membros de classe e compartilhados entre todos os objetos.
Por exemplo, no programa Java a seguir, a variável estática count é usada para contar o número de objetos criados.

class Test {
    static int count = 0;

    Test() { count++; }
    public static void main(String arr[])
    {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println("Total " + count
                           + " objects created");
    }
}

Saída
Total de 2 objetos criados

2. Métodos de membro estático: Em C++ e Java, funções de membro estático podem ser definidas.
Métodos declarados como estáticos são membros de classe e possuem as seguintes restrições:

A) Eles só podem chamar outros métodos estáticos. Por exemplo, o programa a seguir falha na compilação.
fun() não é estático e é chamado em static main().

class Main {
    public static void main(String args[])
    {
        System.out.println(fun());
    }
    int fun() { return 20; }
}

B) Eles devem acessar apenas dados estáticos.

C) Eles não podem acessar este ou super. Por exemplo, o programa a seguir falha na compilação.

class Base {
    static int x = 0;
}

class Derived extends Base {
    public static void fun()
    {

        // Compiler Error: non-static variable
        // cannot be referenced from a static context
        System.out.println(super.x);
    }
}

D) Como C++, membros de dados estáticos e métodos estáticos podem ser acessados sem criar um objeto.
Eles podem ser acessados usando os nomes das classes. Por exemplo, no programa a seguir,
a contagem de membros de dados estáticos e o método estático fun() são acessados sem nenhum objeto.

class Test {
    static int count = 0;
    public static void fun()
    {
        System.out.println("Static fun() called");
    }
}

class Main {
    public static void main(String arr[])
    {
        System.out.println("Test.count = " + Test.count);
        Test.fun();
    }
}

Saída
Test.count = 0
Fun estático() chamado

3. Bloco Estático: Diferentemente de C++, Java suporta um bloco especial,
chamado bloco estático (também chamado de cláusula estática) que pode ser usado para inicialização estática de uma classe.
Este código dentro do bloco estático é executado apenas uma vez. Consulte Blocos estáticos em Java para obter detalhes.

4. Variáveis Locais Estáticas: Diferentemente de Java, C++ suporta variáveis locais estáticas.
Por exemplo, o seguinte programa Java falha na compilação.

class Test {
    public static void main(String args[])
    {
        System.out.println(fun());
    }
    static int fun()
    {

        // Compiler Error: Static local
        // variables are not allowed
        static int x = 10;
        return x--;
    }
}
 */
    }
}