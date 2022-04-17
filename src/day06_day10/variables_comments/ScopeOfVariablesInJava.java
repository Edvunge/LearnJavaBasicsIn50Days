package day06_day10.variables_comments;

public class ScopeOfVariablesInJava {
    public static void main(String[] args) {

        System.out.println("Escopo das variáveis em Java");
        /*
Escopo de uma variável é a parte do programa onde a variável é acessível. Como C/C++, em Java,
todos os identificadores têm escopo léxico (ou estático), ou seja,
o escopo de uma variável pode ser determinado em tempo de compilação e independente da pilha de chamadas de função.
Os programas Java são organizados na forma de classes. Cada classe é parte de algum pacote.
As regras de escopo Java podem ser cobertas nas categorias a seguir.
*/

        System.out.println("Variáveis de Membro (Escopo de Nível de Classe)");
        // Member Variables (Class Level Scope)

        /*
Essas variáveis devem ser declaradas dentro da classe (fora de qualquer função).
Eles podem ser acessados diretamente em qualquer lugar da Class.

 exemplo:

public class Test
{
    // All variables defined directly inside a class
    // are member variables
    int a;
    private String b;
    void method1() {....}
    int method2() {....}
    char c;
}

Podemos declarar variáveis de classe em qualquer lugar da classe, mas fora dos métodos.
O acesso especificado de variáveis de membro não afeta o escopo delas dentro de uma classe.
As variáveis de membro podem ser acessadas fora de uma classe com as seguintes regras


Modifier      Package  Subclass  World

public          Yes      Yes     Yes

protected       Yes      Yes     No

Default (no
modifier)       Yes       No     No

private         No        No     No
*/

        System.out.println("Variáveis Locais (Escopo em Nível de Método)");
        // Local Variables (Method Level Scope)

        /*
Variáveis declaradas dentro de um método têm escopo de nível de método e
não podem ser acessadas fora do método.

public class Test
{
    void method1()
    {
       // Variável local (escopo de nível de método)
       int x;
    }
}

Nota: As variáveis locais não existem após o término da execução do método.

Aqui está outro exemplo de escopo de método,
exceto que desta vez a variável foi passada como um parâmetro para o método:

class Teste
{
    private int x;
    public void setX(int x)
    {
        this.x = x;
    }
}

O código acima usa essa palavra-chave para diferenciar entre as variáveis locais e de classe.

Como exercício, preveja a saída do seguinte programa Java.


public class Test
{
    static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
        Test t = new Test();
        this.x = 22;
        y = 44;

        System.out.println("Test.x: " + Test.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String args[])
    {
        Test t = new Test();
        t.method1(5);
    }
}

Saída:

Teste.x: 22
tx: 22
ty: 33
y: 44
*/

        System.out.println("Variáveis de Loop (Escopo do Bloco)");
        // Loop Variables (Block Scope)
/*
Uma variável declarada dentro do par de colchetes “{” e “}” em um método tem escopo somente dentro dos colchetes.

public class Test
{
    public static void main(String args[])
    {
        {
            // The variable x has scope within
            // brackets
            int x = 10;
            System.out.println(x);
        }

        // Uncommenting below line would produce
        // error since variable x is out of scope.

        // System.out.println(x);
    }
}
Saída: 10

Como outro exemplo, considere seguir o programa com um loop for.


class Test
{
    public static void main(String args[])
    {
        for (int x = 0; x < 4; x++)
        {
            System.out.println(x);
        }

        // Will produce error
        System.out.println(x);
    }
}

Saída: 11

erro: não é possível encontrar o símbolo
        System.out.println(x);
A maneira correta de fazer acima é,


// Above program after correcting the error
class Test
{
    public static void main(String args[])
    {
        int x;
        for (x = 0; x < 4; x++)
        {
            System.out.println(x);
        }

       System.out.println(x);
    }
}

Saída:

0
1
2
3
4

Vejamos um exemplo complicado de escopo de loop. Preveja a saída do programa a seguir.
Você pode se surpreender se for um programador C/C++ regular.


class Test
{
    public static void main(String args[])
    {
        int a = 5;
        for (int a = 0; a < 5; a++)
        {
            System.out.println(a);
        }
    }
}

Saída: 6

erro: a variável a já está definida no método go(int)
       for (int a = 0; a < 5; a++)
                ^
1 erro
Nota: - Em C++, ele será executado. Mas em java é um erro porque em java, o nome da variável do loop interno e externo deve ser diferente.
Um programa semelhante em C++ funciona.

Como exercício, preveja a saída do seguinte programa Java.





class Test
{
    public static void main(String args[])
    {
        {
            int x = 5;
            {
                int x = 10;
                System.out.println(x);
            }
        }
    }
}

P. A partir do conhecimento acima, diga se o código abaixo será executado ou não.


class Test {
    public static void main(String args[])
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 20;
        System.out.println(i);
    }
}

Saída :

1
2
3
4
5
6
7
8
9
10
20


Sim, vai rodar!
Veja o programa com atenção, o loop interno terminará antes que a variável do loop externo seja declarada.
Assim, a variável do loop interno é destruída primeiro e, em seguida, a nova variável de mesmo nome foi criada.

Alguns pontos importantes sobre escopo de variável em Java:

Em geral, um conjunto de chaves {} define um escopo.
Em Java, geralmente podemos acessar uma variável desde que ela tenha sido definida dentro do mesmo conjunto de colchetes que o
código que estamos escrevendo ou
entre quaisquer colchetes dentro dos colchetes onde a variável foi definida.
Qualquer variável definida em uma classe fora de qualquer método pode ser usada por todos os métodos membros.
Quando um método tem a mesma variável local como membro, a palavra-chave “this” pode ser usada para referenciar a variável de classe atual.
Para que uma variável seja lida após o término de um loop, ela deve ser declarada antes do corpo do loop.
 */

    }
}