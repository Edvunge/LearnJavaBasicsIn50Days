package day04;

public class ExempleJava {
    public static void main(String[] args) {

        System.out.println("Java");
        /*
                A contribuição mais importante até agora da revolução dos microprocessadores é que ela permitiu o desenvolvimento de computadores
        pessoais. Os microprocessadores estão tendo um impacto profundo em dispositivos eletrônicos inteligentes de consumo
        popular. Reconhecendo isso, a Sun Microsystems, em 1991, financiou um projeto de pesquisa corporativa interna chefiado por James
        Gosling, que resultou em uma linguagem de programação orientada a objetos chamada C++, que a empresa chamou de Java.
                Um objetivo-chave do Java é ser capaz de escrever programas a serem executados em uma grande variedade de sistemas computacionais
        e dispositivos controlados por computador. Isso às vezes é chamado de “escreva uma vez, execute em qualquer lugar”.
        Por uma feliz casualidade, a web explodiu em popularidade em 1993 e a Sun viu o potencial de utilizar o Java para adicionar
        conteúdo dinâmico, como interatividade e animações, às páginas da web. O Java chamou a atenção da comunidade de negócios por
        causa do interesse fenomenal pela web.
                Ele é agora utilizado para desenvolver aplicativos corporativos de grande porte, aprimorar a
        funcionalidade de servidores da web (os computadores que fornecem o conteúdo que vemos em nossos navegadores), fornecer aplicativos
        para dispositivos voltados ao consumo popular (por exemplo, telefones celulares, smartphones, televisão, set-up boxes etc.)
        e para muitos outros propósitos. Ainda, ele também é a linguagem-chave para desenvolvimento de aplicativos Android adequados a
        smartphones e tablets. A Sun Microsystems foi adquirida pela Oracle em 2010.
         */

        System.out.println("Bibliotecas de classe do Java ");
        /*
            Você pode criar cada classe e método de que precisa para formar seus programas Java. Porém, a maioria dos programadores Java
        tira proveito das ricas coleções de classes existentes e métodos nas bibliotecas de classe Java, também conhecidas como Java APIs
        (application programming interfaces).
         */

        System.out.println(" Um ambiente de desenvolvimento Java típico");
        /*
                Agora explicaremos os passos para criar e executar um aplicativo Java. Normalmente, existem cinco fases: editar, compilar, carregar,
                verificar e executar. Nós as discutiremos no contexto do Java SE 8 Development Kit ( JDK). Consulte a seção “Antes de começar”
        (nas páginas iniciais do livro) para informações sobre como baixar e instalar o JDK no Windows, Linux e OS X.
                */

        System.out.println(" Fase 1: criando um programa");
        /*
            A Fase 1 consiste em editar um arquivo com um programa editor, muitas vezes conhecido simplesmente como um editor.
        Você digita um programa Java (em geral referido como código-fonte) utilizando o editor, faz quaisquer correções necessárias
        e salva o programa em um dispositivo de armazenamento secundário, como sua unidade de disco. Arquivos de código-fonte Java
        recebem um nome que termina com a extensão .java, que indica um arquivo contendo código-fonte Java.
         */

        System.out.println("Ambiente típico de desenvolvimento Java");
        /*
                Dois editores amplamente utilizados nos sistemas Linux são vi e emacs. O Windows fornece o Bloco de Notas. Já o OS X fornece
        o TextEdit. Também há muitos editores freeware e shareware disponíveis on-line, incluindo Notepad++ (notepad-plus-plus.
                org), EditPlus (www.editplus.com), TextPad (www.textpad.com) e jEdit (www.jedit.org).
                Ambientes de desenvolvimento integrado (IDEs) fornecem ferramentas que suportam o processo de desenvolvimento de software,
        como editores e depuradores para localizar erros lógicos (que fazem programas serem executados incorretamente) e outros.
        Há muitos IDEs Java populares, incluindo:
        • Eclipse (www.eclipse.org)
        • NetBeans (www.netbeans.org)
        • IntelliJ IDEA (www.jetbrains.com)
                No site dos autores (Seção Antes de começar, nas páginas iniciais do livro) estão os vídeos Dive Into®, que mostram como executar
        os aplicativos Java desta obra e como desenvolver novos aplicativos Java com o Eclipse, NetBeans e IntelliJ IDEA.
         */

        System.out.println("Fase 2: compilando um programa Java em bytecodes ");
        /*
                Na Fase 2, utilize o comando javac (o compilador Java) para compilar um programa (Figura 1.7). Por exemplo, a fim de
        compilar um programa chamado Welcome.java, você digitaria
        javac Welcome.java
        na janela de comando do seu sistema (isto é, o Prompt do MS-DOS, no Windows, ou o aplicativo Terminal, no Mac OS X) ou em um
        shell Linux (também chamado Terminal em algumas versões do Linux). Se o programa compilar, o compilador produz um arquivo
        .class chamado Welcome.class que contém a versão compilada. IDEs tipicamente fornecem um item de menu, como Build ou
        Make, que chama o comando javac para você. Se o compilador detectar erros, você precisa voltar para a Fase 1 e corrigi-los. No
        Capítulo 2, discutiremos com detalhes os tipos de erro que o compilador pode detectar.

                O compilador Java converte o código-fonte Java em bytecodes que representam as tarefas a serem executadas na fase de execução
        (Fase 5). O Java Virtual Machine (JVM) — uma parte do JDK e a base da plataforma Java — executa bytecodes. A máquina
        virtual (virtual machine) é um aplicativo de software que simula um computador, mas oculta o sistema operacional e o
        hardware subjacentes dos programas que interagem com ela. Se a mesma máquina virtual é implementada em muitas plataformas
        de computador, os aplicativos escritos para ela podem ser utilizados em todas essas plataformas. A JVM é uma das máquinas virtuais
        mais utilizadas.

                O .NET da Microsoft utiliza uma arquitetura de máquina virtual semelhante.
        Diferentemente das instruções em linguagem de máquina, que são dependentes de plataforma (isto é, de hardware específico
        de computador), instruções bytecode são independentes de plataforma. Portanto, os bytecodes do Java são portáveis — sem recompilar
        o código-fonte, as mesmas instruções em bytecodes podem ser executadas em qualquer plataforma contendo uma JVM que
        entende a versão do Java na qual os bytecodes foram compilados. A JVM é invocada pelo comando java. Por exemplo, para executar
        um aplicativo Java chamado Welcome, você digitaria
         */

        System.out.println("Fase 3: carregando um programa na memória ");
        /*
                Na Fase 3, a JVM armazena o programa na memória para executá-lo — isso é conhecido como carregamento (Figura 1.8). O
        carregador de classe da JVM pega os arquivos .class que contêm os bytecodes do programa e os transfere para a memória primária.
        Ele também carrega qualquer um dos arquivos .class fornecidos pelo Java que seu programa usa. Os arquivos .class podem ser
        carregados a partir de um disco em seu sistema ou em uma rede (por exemplo, sua faculdade local ou rede corporativa ou a internet).
         */

        System.out.println(" Fase 4: verificação de bytecode ");
        /*
                Na Fase 4, enquanto as classes são carregadas, o verificador de bytecode examina seus bytecodes para assegurar que eles são
        válidos e não violam restrições de segurança do Java (Figura 1.9). O Java impõe uma forte segurança para certificar-se de que os
        programas Java que chegam pela rede não danificam os arquivos ou o sistema (como vírus e worms de computador).
         */

        System.out.println(" Fase 5: execução");
        /*
                Na Fase 5, a JVM executa os bytecodes do programa, realizando, assim, as ações especificadas por ele (Figura 1.10). Nas primeiras
        versões do Java, a JVM era simplesmente um interpretador para bytecodes. A maioria dos programas Java executava lentamente,
                porque a JVM interpretava e executava um bytecode de cada vez. Algumas arquiteturas modernas de computador podem executar várias
        instruções em paralelo. Em geral, as JVMs atuais executam bytecodes utilizando uma combinação de interpretação e a chamada
        compilação just in time ( JIT). Nesse processo, a JVM analisa os bytecodes à medida que eles são interpretados, procurando hot spots
        (pontos ativos) — partes dos bytecodes que executam com frequência. Para essas partes, um compilador just in time (JIT), como o
        compilador Java HotSpot™ da Oracle, traduz os bytecodes para a linguagem de máquina do computador subjacente. Quando a JVM
        encontra de novo essas partes compiladas, o código de linguagem de máquina mais rápido é executado. Portanto, os programas Java
        realmente passam por duas fases de compilação: uma em que o código-fonte é traduzido em bytecodes (para a portabilidade entre
        JVMs em diferentes plataformas de computador) e outra em que, durante a execução, os bytecodes são traduzidos em linguagem de
        máquina para o computador real no qual o programa é executado.
         */

        System.out.println("Problemas que podem ocorrer no tempo de execução");
        /*
                Os programas podem não funcionar na primeira tentativa. Cada uma das fases anteriores pode falhar por causa de vários erros
        que discutiremos ao longo dos capítulos. Por exemplo, um programa executável talvez tente realizar uma operação de divisão por
        zero (uma operação ilegal para a aritmética de número inteiro em Java). Isso faria o programa Java imprimir uma mensagem de
        erro. Se isso ocorresse, você teria de retornar à fase de edição, realizar as correções necessárias e passar novamente pelas demais fases
        para determinar se as correções resolveram o(s) problema(s). [Observação: a maioria dos programas Java realiza entrada ou saída
        de dados. Quando afirmamos que um programa exibe uma mensagem, normalmente queremos dizer que ele a apresenta pela tela
        do computador. As mensagens e outros dados podem ser enviados a outros dispositivos de saída, como discos e impressoras, ou até
        mesmo uma rede para transmissão a outros computadores.]
        */
    }
}