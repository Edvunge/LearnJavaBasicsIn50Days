package day06.variables_comments;

public class Comments {
    public static void main(String[] args) {

        System.out.println(" Comentários em Java ");

        /*
            Inserimos comentários para documentar programas e aprimorar sua legibilidade.
                O compilador Java ignora os comentários, portanto, eles não fazem o computador realizar qualquer ação quando o programa é executado.
        Por convenção, iniciamos cada programa com um comentário indicando o número da figura e o nome do arquivo.

        Na programação de computadores, os comentários são uma parte do programa que é completamente ignorada pelos compiladores Java.
        Eles são usados principalmente para ajudar os programadores a entender o código. Por exemplo,

// declaraçao e inicializaçao de duas variaveis
        int a =1;
        int b = 3;

// print the output
        System.out.println("This is output");
        Aqui, usamos os seguintes comentários,

                declarar e inicializar duas variáveis
        imprima a saída
        Tipos de comentários em Java
        Em Java, existem dois tipos de comentários:

        comentário de linha única
        comentário de várias linhas
        Comentário de linha única
        Um comentário de linha única começa e termina na mesma linha.
        Para escrever um comentário de uma linha, podemos usar o //símbolo. Por exemplo,
         */

// "Hello, World!" program example

        /*
        class Main {
            public static void main(String[] args) {
                {
                    // prints "Hello, World!"
                    System.out.println("Hello, World!");
                }
            }
            Saída :

            Olá Mundo!
            Aqui, usamos dois comentários de linha única:
            "Olá Mundo!" exemplo de programa imprime "Olá mundo!"
            O compilador Java ignora tudo, desde //o final da linha.
            Por isso, também é conhecido como comentário de fim de linha.
*/


        System.out.println("Comentário de várias linhas ");
            // Quando queremos escrever comentários em várias linhas, podemos usar o comentário de várias linhas.
            // Para escrever comentários de várias linhas, podemos usar o símbolo /*....*/. Por exemplo,


            /* This is an example of  multi-line comment.
             * The program prints "Hello, World!" to the standard output.
             */

        /*
            class HelloWorld {
                public static void main(String[] args) {
                    {
                        System.out.println("Hello, World!");
                    }
                }
                Saída :

                Olá Mundo!
                Aqui, usamos o comentário de várias linhas:
        */

                /* This is an example of multi-line comment.
                 * The program prints "Hello, World!" to the standard output.
                 */


    //            Esse tipo de comentário também é conhecido como Comentário Tradicional.
        //          Nesse tipo de comentário, o compilador Java ignora tudo, de /*até */.

        System.out.println("Use os comentários da maneira certa");
        /*
                Uma coisa que você deve sempre considerar é que os comentários não devem substituir uma maneira de explicar o código mal escrito em inglês.
                Você deve sempre escrever um código bem estruturado e autoexplicativo. E, em seguida, use comentários.

                Alguns acreditam que o código deve ser autodescritivo e os comentários raramente devem ser usados.
                No entanto, na minha opinião pessoal, não há nada de errado em usar comentários.
                Podemos usar comentários para explicar algoritmos complexos,
                regex ou cenários onde temos que escolher uma técnica entre diferentes técnicas para resolver problemas.

                Nota : Na maioria dos casos, sempre use comentários para explicar ' por que ' em vez de ' como ' e pronto.
    */

    }
}