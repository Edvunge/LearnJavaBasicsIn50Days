package day06.variables_comments;

public class Variables {
    public static void main(String[] args) {

     System.out.println("Variáveis em Java");

/*
        A variável em Java é um contêiner de dados que salva os valores dos dados durante a execução do programa Java.
        Cada variável recebe um tipo de dados que designa o tipo e a quantidade de valor que ela pode conter.
        Variável é um nome de local de memória dos dados.

        Uma variável é um nome dado a um local de memória. É a unidade básica de armazenamento em um programa.

                O valor armazenado em uma variável pode ser alterado durante a execução do programa.
                Uma variável é apenas um nome dado a um local de memória, todas as operações feitas na variável afetam esse local de memória.
        Em Java, todas as variáveis devem ser declaradas antes do uso.
                Como declarar variáveis?
        Podemos declarar variáveis em java conforme ilustrado abaixo como um auxílio visual.

                A partir da imagem, pode-se perceber facilmente que ao declarar uma variável, precisamos cuidar de duas coisas que são:

        1. Datatype : Tipo de dado que pode ser armazenado nesta variável.

        2. Dataname: Nome foi dado à variável.

                Desta forma, um nome só pode ser dado a uma posição de memória. Os valores podem ser atribuídos de duas maneiras:

        Inicialização de variável
        Atribuindo valor tomando entrada
        Como inicializar variáveis?
                Pode ser percebido com a ajuda de 3 componentes que são os seguintes:

        data type : Tipo de dado que pode ser armazenado nesta variável.
                nome_variável : Nome dado à variável.
        value: É o valor inicial armazenado na variável.


                Ilustrações:

        flutuar juros simples;
// Declarando a variável float
        int tempo = 10, velocidade = 20;
// Declarando e inicializando a variável inteira
        char var = 'h';
// Declarando e inicializando a variável de caractere
        Tipos de variáveis em Java
        Agora vamos discutir diferentes tipos de variáveis que estão listadas a seguir:

        Variáveis locais
        Variáveis de instância
        Variáveis estáticas

        Vamos discutir os traços de cada variável aqui em detalhes.
*/

        System.out.println("1. Variáveis Locais");
        /*
        Uma variável definida dentro de um bloco ou método ou construtor é chamada de variável local.

        Essas variáveis são criadas quando o bloco é inserido, ou a função é chamada e destruída após sair do bloco ou
        quando a chamada retorna da função.
        O escopo dessas variáveis existe apenas dentro do bloco em que a variável é declarada.
        ou seja, podemos acessar essas variáveis apenas dentro desse bloco.
        A inicialização da variável local é obrigatória antes de usá-la no escopo definido.

                int var = 10; // Declared a Local Variable
                // This variable is local to this main method only
                System.out.println("Local Variable: " + var);

        // Variável Local: 10
 */


        System.out.println("2. Variáveis de instância");
 /*
        Variáveis de instância são variáveis não estáticas e são declaradas em uma classe fora de qualquer método, construtor ou bloco.

        Como as variáveis de instância são declaradas em uma classe,
        essas variáveis são criadas quando um objeto da classe é criado e destruídas quando o objeto é destruído.
        Ao contrário das variáveis locais, podemos usar especificadores de acesso para variáveis de instância.
        Se não especificarmos nenhum especificador de acesso, o especificador de acesso padrão será usado
        A inicialização da variável de instância não é obrigatória. Seu valor padrão é 0
        A variável de instância pode ser acessada apenas criando objetos.
*/


/*
            public String geek; // Declared Instance Variable

            public GFG()
            { // Default Constructor

                this.geek = "Shubham Jain"; // instializing Instance Variable
            }
            //Main Method
            public static void main(String[] args)
            {

                // Object Creation
                GFG name = new GFG();
                // Displaying O/P
                System.out.println("Geek name is: " + name.geek);
            }
        }
        Saída
        O nome geek é: Shubham Jain
 */

        System.out.println("3. Variáveis Estáticas");
 /*
        Variáveis estáticas também são conhecidas como variáveis de classe.

        Essas variáveis são declaradas de forma semelhante às variáveis de instância.
        A diferença é que as variáveis estáticas são declaradas usando a palavra-chave static
        dentro de uma classe fora de qualquer construtor de método ou bloco.

        Ao contrário das variáveis de instância, só podemos ter uma cópia de uma variável estática por classe,
        independentemente de quantos objetos criamos.

        As variáveis estáticas são criadas no início da execução do programa e destruídas automaticamente quando a execução termina.
        A inicialização da variável estática não é obrigatória. Seu valor padrão é 0
        Se acessarmos a variável estática como a variável Instance (através de um objeto),
        o compilador mostrará a mensagem de aviso, que não interromperá o programa.
        O compilador substituirá o nome do objeto pelo nome da classe automaticamente.

        Se acessarmos a variável estática sem o nome da classe, o compilador anexará automaticamente o nome da classe.
  */


        /*

import java.io.*;

        class GFG {

            public static String geek = "Shubham Jain";         //Declared static variable

            public static void main (String[] args) {

                //geek variable can be accessed withod object creation
                //Displaying O/P
                //GFG.geek --> using the static variable
                System.out.println("Geek Name is : "+GFG.geek);
            }
        }
        Saída
        Nome Geek é: Shubham Jain
        */



        System.out.println("Diferenças entre a variável de instância vs. as variáveis estáticas ");
        /*

        Agora vamos discutir as diferenças entre a variável Instance vs. as variáveis estáticas

        Cada objeto terá sua cópia da variável de instância, enquanto que só podemos ter uma cópia de uma variável estática por classe,
        independentemente de quantos objetos criamos.
        As alterações feitas em uma variável de instância usando um objeto não serão refletidas em outros objetos,
        pois cada objeto tem sua própria cópia da variável de instância. No caso de static,
        as alterações serão refletidas em outros objetos, pois as variáveis estáticas são comuns a todos os objetos de uma classe.
        Podemos acessar variáveis de instância por meio de referências de objetos,
        e variáveis estáticas podem ser acessadas diretamente usando o nome da classe.
        Sintaxe: variáveis estáticas e de instância

        classe GFG
        {
            // Variável estática
            estático int a;

            // Variável de instância
            intb;
        }
*/

    }
}
