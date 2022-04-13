package day03;

public class IntroducaoTecnologiaDeObjetos {
    public static void main(String[] args) {

        System.out.println("Introdução à tecnologia de objetos ");
        /*
        Hoje, como a demanda por software novo e mais poderoso está aumentando, construir softwares de maneira rápida, correta e
        econômica continua a ser um objetivo indefinido. Objetos ou, mais precisamente, as classes de onde os objetos vêm são essencialmente
        componentes reutilizáveis de software. Há objetos data, objetos data/hora, objetos áudio, objetos vídeo, objetos automóvel, objetos
        pessoas etc. Quase qualquer substantivo pode ser razoavelmente representado como um objeto de software em termos dos atributos
        (por exemplo, nome, cor e tamanho) e comportamentos (por exemplo, calcular, mover e comunicar). Grupos de desenvolvimento
        de software podem usar uma abordagem modular de projeto e implementação orientados a objetos para que sejam muito mais produtivos
        do que com as técnicas anteriormente populares como “programação estruturada” — programas orientados a objetos são
        muitas vezes mais fáceis de entender, corrigir e modificar.
         */


        System.out.println("1.5.1 O automóvel como um objeto ");
        /*
        Para ajudar a entender objetos e seus conteúdos, vamos começar com uma analogia simples. Suponha que você queira guiar
        um carro e fazê-lo andar mais rápido pisando no pedal acelerador. O que deve acontecer antes que você possa fazer isso? Bem,
                antes de poder dirigir um carro, alguém tem de projetá-lo. Um carro tipicamente começa como desenhos de engenharia, semelhantes
        a plantas que descrevem o projeto de uma casa. Esses desenhos incluem o projeto do pedal do acelerador. O pedal oculta do motorista
        os complexos mecanismos que realmente fazem o carro ir mais rápido, assim como o pedal de freio “oculta” os mecanismos que
        diminuem a velocidade do carro e a direção “oculta” os mecanismos que mudam a direção dele. Isso permite que pessoas com pouco
        ou nenhum conhecimento sobre como motores, freios e mecanismos de direção funcionam consigam dirigir um carro facilmente.
        Assim como você não pode cozinhar refeições na planta de uma cozinha, não pode dirigir os desenhos de engenharia de um
        carro. Antes de poder guiar um carro, ele deve ser construído a partir dos desenhos de engenharia que o descrevem. Um carro pronto
        tem um pedal de acelerador real para fazê-lo andar mais rápido, mas mesmo isso não é suficiente — o carro não acelerará por conta
        própria (tomara!), então o motorista deve pressionar o pedal do acelerador.
         */


        System.out.println("1.5.2 Métodos e classes ");
        /*
        Vamos usar nosso exemplo do carro para introduzir alguns conceitos fundamentais da programação orientada a objetos. Para
        realizar uma tarefa em um programa é necessário um método. O método armazena as declarações do programa que, na verdade,
                executam as tarefas; além disso, ele oculta essas declarações do usuário, assim como o pedal do acelerador de um carro oculta do
            motorista os mecanismos para fazer o veículo ir mais rápido. No Java, criamos uma unidade de programa chamada classe para armazenar
        o conjunto de métodos que executam as tarefas dela. Por exemplo, uma classe que representa uma conta bancária poderia
        conter um método para fazer depósitos de dinheiro, outro para fazer saques e um terceiro para perguntar qual é o saldo atual.
                Uma classe é similar em termos do conceito aos desenhos de engenharia de um carro, que armazenam o projeto de um pedal de
        acelerador, volante etc.
         */


        System.out.println("1.5.3 Instanciação ");
        /*
        Assim como alguém tem de fabricar um carro a partir dos desenhos de engenharia antes que possa realmente dirigi-lo, você
        deve construir um objeto de uma classe antes que um programa possa executar as tarefas que os métodos da classe definem. O
        processo para fazer isso é chamado instanciação. Um objeto é então referido como uma instância da sua classe.
         */


        System.out.println("   1.5.4 Reutilização ");
        /*
        Assim como os desenhos de engenharia de um carro podem ser reutilizados várias vezes para fabricar muitos carros, você pode
        reutilizar uma classe muitas vezes para construir vários objetos. A reutilização de classes existentes ao construir novas classes e programas
        economiza tempo e esforço. Também ajuda a construir sistemas mais confiáveis e eficientes, porque classes e componentes
        existentes costumam passar por extensos testes, depuração e ajuste de desempenho. Assim como a noção das partes intercambiáveis
        foi crucial para a Revolução Industrial, classes reutilizáveis são fundamentais para a revolução de software que foi estimulada pela
        tecnologia de objetos.
         */


        System.out.println(" 1.5.5 Mensagens e chamadas de método ");
        /*
        Ao dirigir um carro, o ato de pressionar o acelerador envia uma mensagem para o veículo realizar uma tarefa — isto é, ir mais
        rápido. Da mesma forma, você envia mensagens para um objeto. Cada mensagem é implementada como uma chamada de método
        que informa a um método do objeto a maneira de realizar sua tarefa. Por exemplo, um programa pode chamar o método depósito
        de um objeto conta bancária para aumentar o saldo da conta.
         */


        System.out.println("1.5.6 Atributos e variáveis de instância ");
        /*
        Um carro, além de ter a capacidade de realizar tarefas, também tem atributos, como cor, número de portas, quantidade de gasolina
        no tanque, velocidade atual e registro das milhas totais dirigidas (isto é, a leitura do odômetro). Assim como suas capacidades, os
        atributos do carro são representados como parte do seu projeto nos diagramas de engenharia (que, por exemplo, incluem um odômetro
        e um medidor de combustível). Ao dirigir um carro real, esses atributos são incorporados a ele. Cada carro mantém seus próprios
        atributos. Cada carro sabe a quantidade de gasolina que há no seu tanque, mas desconhece quanto há no tanque de outros carros.
        Um objeto, da mesma forma, tem atributos que ele incorpora à medida que é usado em um programa. Esses atributos são especificados
        como parte da classe do objeto. Por exemplo, um objeto conta bancária tem um atributo saldo que representa a quantidade
        de dinheiro disponível. Cada objeto conta bancária sabe o saldo que ele representa, mas não os saldos de outras contas bancárias. Os
        atributos são especificados pelas variáveis de instância da classe.
         */


        System.out.println(" 1.5.7 Encapsulamento e ocultamento de informações ");
        /*
        Classes (e seus objetos) encapsulam, isto é, contêm seus atributos e métodos. Os atributos e métodos de uma classe (e de seu
                objeto) estão intimamente relacionados. Os objetos podem se comunicar entre si, mas eles em geral não sabem como outros objetos
        são implementados — os detalhes de implementação permanecem ocultos dentro dos próprios objetos. Esse ocultamento de informações,
        como veremos, é crucial à boa engenharia de software.
         */


        System.out.println("  1.5.8 Herança ");
        /*
        Uma nova classe de objetos pode ser criada convenientemente por meio de herança — ela (chamada subclasse) começa com
        as características de uma classe existente (chamada superclasse), possivelmente personalizando-as e adicionando aspectos próprios.

        Na nossa analogia do carro, um objeto da classe “conversível” decerto é um objeto da classe mais geral “automóvel”, mas, especificamente,
                o teto pode ser levantado ou baixado.
         */


        System.out.println("1.5.9 Interfaces ");
        /*
        O Java também suporta interfaces — coleções de métodos relacionados que normalmente permitem informar aos objetos o que
        fazer, mas não como fazer. Na analogia do carro, uma interface das capacidades “básicas
        de dirigir” consistindo em um volante, um pedal de acelerador e um pedal de freio permitiria que um motorista informasse ao carro
        o que fazer. Depois que você sabe como usar essa interface para virar, acelerar e frear, você pode dirigir muitos tipos de carro, embora
                os fabricantes possam implementar esses sistemas de forma diferente.
        Uma classe implementa zero ou mais interfaces — cada uma das quais pode ter um ou mais métodos —, assim como um carro
        implementa interfaces separadas para as funções básicas de dirigir, controlar o rádio, controlar os sistemas de aquecimento, ar-condicionado
        e afins. Da mesma forma que os fabricantes de automóveis implementam os recursos de forma distinta, classes podem
        implementar métodos de uma interface de maneira diferente. Por exemplo, um sistema de software pode incluir uma interface de
“backup” que ofereça os métodos save e restore. As classes podem implementar esses métodos de modo diferente, dependendo dos
        tipos de formato em que é feito o backup, como programas, textos, áudios, vídeos etc., além dos tipos de dispositivo em que esses
        itens serão armazenados.
         */


        System.out.println("1.5.10 Análise e projeto orientados a objetos (OOAD) ");
        /*
                Logo você estará escrevendo programas em Java. Como criará o código (isto é, as instruções do programa) para seus programas?
                Talvez, como muitos programadores, simplesmente ligará seu computador e começará a digitar. Essa abordagem pode funcionar
        para pequenos programas (como os apresentados nos primeiros capítulos deste livro), mas e se você fosse contratado para criar um
        sistema de software para controlar milhares de caixas automáticos de um banco importante? Ou se fosse trabalhar em uma equipe
        de 1.000 desenvolvedores de software para construir a próxima geração de sistema de controle de tráfego aéreo dos Estados Unidos?
        Para projetos tão grandes e complexos, não sentaria e simplesmente começaria a escrever programas.
                Para criar as melhores soluções, você deve seguir um processo de análise detalhado a fim de determinar os requisitos do projeto
                (isto é, definir o que o sistema deve fazer) e desenvolver um design que os atenda (isto é, especificar como o sistema deve fazê-lo).
                Idealmente, você passaria por esse processo e revisaria cuidadosamente o projeto (e teria seu projeto revisado por outros profissionais
                de software) antes de escrever qualquer código. Se esse processo envolve analisar e projetar o sistema de um ponto de vista orientado
        a objetos, ele é chamado de processo de análise e projeto orientados a objetos (object-oriented analysis and design — OOAD).
                Linguagens como Java são orientadas a objetos. A programação nessa linguagem, chamada programação orientada a objetos
        (object-oriented programming — OOP), permite-lhe implementar um projeto orientado a objetos como um sistema funcional.
         */


        System.out.println("1.5.11 A UML (unified modeling language) ");
        /*
        Embora existam muitos processos OOAD diferentes, uma única linguagem gráfica para comunicar os resultados de qualquer
        processo desse tipo veio a ser amplamente utilizada. A unified modeling language (UML) é agora o esquema gráfico mais utilizado
        para modelagem de sistemas orientados a objetos. Apresentaremos nossos primeiros diagramas UML nos capítulos 3 e 4, então os
        usaremos no nosso tratamento mais profundo da programação orientada a objetos até o Capítulo 11. No nosso estudo de caso opcional
        sobre engenharia e software da ATM referente aos capítulos 33 e 34 (Sala Virtual, em inglês), apresentaremos um subconjunto
        simples dos recursos do UML à medida que o orientamos por uma experiência de projeto orientado a objetos.
         */

    }
}