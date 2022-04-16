package day06.dataTypes;

public class DataTypesIntro {
    public static void main(String[] args) {

        System.out.println(" Tipos de dados em Java ");
        /*
         Existem basicamente dois tipos de linguagens.

            Primeiro, uma é a linguagem tipada estaticamente, onde cada variável e tipo de expressão já é conhecido em tempo de compilação.
        Uma vez que uma variável é declarada como sendo de um determinado tipo de dados, ela não pode conter valores de outros tipos de dados.
        Exemplo: C, C++, Java.
        A outra são as linguagens tipadas dinamicamente. Essas linguagens podem receber diferentes tipos de dados ao longo do tempo.
        Exemplo: Ruby, Python.

            Java é estaticamente tipada e também uma linguagem fortemente tipada porque, em Java,
        cada tipo de dados (como inteiro, caractere, hexadecimal, decimal compactado e assim por diante)
        é predefinido como parte da linguagem de programação e todas as constantes ou variáveis
        definidas para um determinado programa deve ser descrito com um dos tipos de dados.
         */

        System.out.println("Tipos de dados em Java ");

        /*
         Java tem duas categorias de dados:

        Tipo de dados primitivos: como boolean, char, int, short, byte, long, float e double
        Tipo de dados não primitivo ou tipo de dados de objeto: como String, Array, etc.
        Tipo de dados primitivo
        Dados primitivos são apenas valores únicos e não possuem recursos especiais.
  */

        System.out.println("Tipos de dados primitivos ");

        System.out.println("Existem 8 tipos de dados primitivos. Esses são:");
        System.out.println("1. boolean");
        /*
         o tipo de dados boolean representa apenas um bit de informação true ou false,
        mas o tamanho do tipo de dados boolean depende da máquina virtual.
        Os valores do tipo boolean não são convertidos implícita ou explicitamente (com conversões) para nenhum outro tipo.
        Mas o programador pode escrever facilmente o código de conversão.
  */


      // Programa Java para demonstrar o tipo de dados booleano

                boolean b = true;
                if (b == true)
                    System.out.println("Hi Geek");


        System.out.println(" 2. byte ");
                /*
         O tipo de dados byte é um inteiro de complemento de dois de 8 bits com sinal.
         O tipo de dados byte é útil para economizar memória em matrizes grandes.

                Sintaxe:

        byte byteVar;
        Tamanho:

        1 byte (8 bits)
        Valores:

        -128 a 127
        Valor padrão:
 */

// Programa Java para demonstrar o tipo de dados byte


                byte a = 126;

                // byte is 8 bit value
                System.out.println(a);

                a++;
                System.out.println(a);

                // It overflows here because
                // byte can hold values from -128 to 127
                a++;
                System.out.println(a);

                // Looping back within the range
                a++;
                System.out.println(a);


        System.out.println(" 3. short ");
        /*
         O tipo de dados short é um inteiro de complemento de dois de 16 bits com sinal.
                Semelhante ao byte, use um short para economizar memória em matrizes grandes,
                em situações em que a economia de memória realmente importa.

                Sintaxe:

        shortVar curto;
        Tamanho:

        2 bytes (16 bits)
        Valores:

        -32, 768 a 32, 767 (inclusive)
                Valor padrão:
*/


        System.out.println("4. int ");
/*
 É um inteiro de complemento de dois de 32 bits com sinal.
                Sintaxe:
        int Var;
        Tamanho:

        4 bytes (32 bits)
        Valores:

        -2, 147, 483, 648 a 2, 147, 483, 647 (inclusive)
                Valor padrão:

        Nota: No Java SE 8 e posterior, podemos usar o tipo de dados int para representar um inteiro de 32 bits sem sinal,
        que tem um valor no intervalo [0, 2 32 -1]. Use a classe Integer para usar o tipo de dados int como um inteiro sem sinal.
 */


        System.out.println("5. long");
        /*
        O tipo de dados long é um inteiro de complemento de dois de 64 bits.

                Sintaxe:

        Var longa longa;
        Tamanho:

        8 bytes (64 bits)
        Valores:

        -9, 223, 372, 036, 854, 775, 808
        a
        9, 223, 372, 036, 854, 775, 807
        (inclusive)
                Valor padrão:

        0
        Nota: No Java SE 8 e posterior, você pode usar o tipo de dados longo para representar um comprimento não assinado de 64 bits,
        que tem um valor mínimo de 0 e um valor máximo de 2 64 -1.
        A classe Long também contém métodos como comparar Unsigned, dividir Unsigned,
        etc. para dar suporte a operações aritméticas para unsigned long.

*/

        System.out.println("6. float");
        /*
        O tipo de dados float é um ponto flutuante IEEE 754 de 32 bits de precisão simples.
        Use um float (em vez de double) se precisar economizar memória em grandes arrays de números de ponto flutuante.

        Sintaxe:

        float float Var;
        Tamanho:

        4 bytes (32 bits)
        Valores:

        até 7 dígitos decimais
        Valor padrão:

        0,0
         */


        System.out.println(" 7. double ");
        /*
        O tipo de dados double é um ponto flutuante IEEE 754 de precisão dupla de 64 bits.
            Para valores decimais, esse tipo de dados geralmente é a opção padrão.

        Sintaxe:

        double doubleVar;
        Tamanho:

        8 bytes (64 bits)
        Valores:

        até 16 dígitos decimais
        Valor padrão:

        0,0
        Nota: Os tipos de dados float e double foram projetados especialmente para cálculos científicos, onde erros de aproximação são aceitáveis.
                Se a precisão for a preocupação mais importante, é recomendável não usar esses tipos de dados e usar a classe BigDecimal.
        Por favor, veja isto para detalhes: Arredondando erros em Java
         */


        System.out.println("8. char ");
        /*
         O tipo de dados char é um único caractere Unicode de 16 bits.

                Sintaxe:

        char charVar;
        Tamanho:

        2 bytes (16 bits)
        Valores:

        '\u0000' (0) a '\uffff' (65535)
        Valor padrão:

        '\u0000'
        Por que o tamanho do char é de 2 bytes em java?

        Em outras linguagens como C/C++ usa apenas caracteres ASCII e para representar todos os caracteres ASCII 8 bits é suficiente,
                mas java usa o sistema Unicode não o sistema de código ASCII e para representar o sistema Unicode 8 bits
                não é suficiente para representar todos os caracteres então java usa 2 bytes para caracteres.

                O Unicode define um conjunto de caracteres totalmente internacional que pode representar a maioria dos idiomas escritos do mundo.
                É uma unificação de dezenas de conjuntos de caracteres, como latim, grego, cirílico, katakana , árabe e muitos mais.
         */


// Java program to demonstrate
// primitive data types in Java


                // declaring character
                char aa = 'G';

                // Integer data type is generally
                // used for numeric values
                int ii = 89;

                // use byte and short
                // if memory is a constraint
                byte bb = 4;

                // this will give error as number is
                // larger than byte range
                // byte b1 = 7888888955;

                short ss = 56;

                // this will give error as number is
                // larger than short range
                // short s1 = 87878787878;

                // by default fraction value
                // is double in java
                double dd = 4.355453532;

                // for float use 'f' as suffix
                float ff = 4.7333434f;

                System.out.println("char: " + aa);
                System.out.println("integer: " + ii);
                System.out.println("byte: " + bb);
                System.out.println("short: " + ss);
                System.out.println("float: " + ff);
                System.out.println("double: " + dd);

        System.out.println("Tipo de dados não primitivos ou tipos de dados de referência");
        /*
        Os Tipos de Dados de Referência conterão um endereço de memória de valores de variáveis porque os tipos de referência
        não armazenarão o valor de variável diretamente na memória. São strings, objetos, arrays, etc.

        String : Strings são definidas como uma matriz de caracteres.
        A diferença entre uma matriz de caracteres e uma string em Java é que a string é projetada para conter
        uma sequência de caracteres em uma única variável, enquanto uma matriz de caracteres é uma coleção de entidades separadas do tipo char.
                Ao contrário do C/C++, as strings Java não terminam com um caractere nulo.
        Abaixo está a sintaxe básica para declarar uma string na linguagem de programação Java.
        Sintaxe:

<String_Type> <string_variable> = “<sequence_of_string>”;
        Exemplo:

// Declara String sem usar o novo operador
        String s = "GeeksforGeeks";

// Declara String usando o operador new
        String s1 = new String("GeeksforGeeks");
*/
        /*
        1. Classe : Uma classe é um projeto ou protótipo definido pelo usuário a partir do qual os objetos são criados.
                Ele representa o conjunto de propriedades ou métodos que são comuns a todos os objetos de um tipo.
                Em geral, as declarações de classe podem incluir esses componentes, na ordem:

        Modificadores : Uma classe pode ser pública ou ter acesso padrão (consulte Especificadores de acesso para classes ou
                interfaces em Java para obter detalhes).
                Nome da classe: O nome deve começar com uma letra inicial (maiúscula por convenção).
        Superclass(se houver): O nome do pai da classe (superclasse), se houver, precedido pela palavra-chave extends.
        Uma classe só pode estender (subclasse) um pai.
        Interfaces(se houver): Uma lista separada por vírgulas de interfaces implementadas pela classe, se houver, precedida pela palavra-chave implements.
        Uma classe pode implementar mais de uma interface.
        Corpo: O corpo da classe entre chaves, { }.

        2. Objeto : É uma unidade básica de Programação Orientada a Objetos e representa entidades da vida real.
                Um programa Java típico cria muitos objetos que, como você sabe,
        interagem invocando métodos. Um objeto consiste em:

        Estado : É representado por atributos de um objeto. Também reflete as propriedades de um objeto.
                Comportamento : É representado pelos métodos de um objeto. Também reflete a resposta de um objeto com outros objetos.
        Identidade : dá um nome único a um objeto e permite que um objeto interaja com outros objetos.


        3. Interface : Como uma classe, uma interface pode ter métodos e variáveis,
                mas os métodos declarados em uma interface são abstratos por padrão (somente assinatura de método, ninguém).

        Interfaces especificam o que uma classe deve fazer e não como. É o projeto da classe.
                Uma Interface é sobre capacidades como um Player pode ser uma interface e
                qualquer classe que implemente Player deve ser capaz de (ou deve implementar) mover().
                Portanto, especifica um conjunto de métodos que a classe deve implementar.
                Se uma classe implementa uma interface e não fornece corpos de método para todas as funções especificadas na interface,
        a classe deve ser declarada abstrata.
        Um exemplo de biblioteca Java é a Interface Comparator.
                Se uma classe implementa essa interface, ela pode ser usada para classificar uma coleção.


        4. Array : Um array é um grupo de variáveis do mesmo tipo que são referenciadas por um nome comum.
                Arrays em Java funcionam de forma diferente do que em C/C++.

        A seguir estão alguns pontos importantes sobre matrizes Java.

                Em Java, todos os arrays são alocados dinamicamente. (discutido abaixo)
        Como arrays são objetos em Java, podemos encontrar seu comprimento usando o comprimento do membro.
                Isso é diferente de C/C++, onde encontramos comprimento usando tamanho.
        Uma variável de matriz Java também pode ser declarada como outras variáveis com [] após o tipo de dados.
        As variáveis na matriz são ordenadas e cada uma tem um índice começando em 0.
        O array Java também pode ser usado como um campo estático, uma variável local ou um parâmetro de método.
                O tamanho de uma matriz deve ser especificado por um valor int e não longo ou curto.
        A superclasse direta de um tipo de array é Object.
        Cada tipo de array implementa as interfaces Cloneable e java.io.Serializable.

         */
    }
}