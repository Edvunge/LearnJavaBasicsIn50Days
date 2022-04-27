package day16_20.for_loop;

public class ForLoopEmGeral {
    public static void main(String[] args) {
        /*
        Loops em Java
    O loop for Java é usado para iterar uma parte do programa várias vezes.
    Se o número de iteração for fixo , é recomendável usar o loop for.

Existem três tipos de loops for em Java.

Loops em Java

Simples para Loop
Para cada
ou Aprimorado para Loop
Rotulado para Loop
Java Simples para Loop
Um laço for simples é o mesmo que C/C++ .Podemos inicializar a variável, verifique a condição e o valor de incremento/diminuição.

É composto por quatro partes:

Inicialização : É a condição inicial que é executada uma vez quando o loop é iniciado.
Aqui, podemos inicializar a variável, ou podemos usar uma variável já inicializada. É uma condição opcional.

Condição : É a segunda condição que é executada a cada vez para testar a condição do loop.
Ele continua a execução até que a condição seja falsa. Ele deve retornar o valor booleano true ou false. É uma condição opcional.

Increment/Decrement : Aumenta ou diminui o valor da variável. É uma condição opcional.

Instrução : A instrução do loop é executada a cada vez até que a segunda condição seja falsa.

Sintaxe:

for (inicialização; condição; incremento/decremento){
//instrução ou código a ser executado
}
Fluxograma:

for loop no fluxograma java
Exemplo:

ForExample.java

//Programa Java para demonstrar o exemplo de loop for
//que imprime a tabela de 1

classe pública  Por exemplo {
public static void  main(String[] args) {
    //Código de Java para loop
    for ( int  i= 1 ;i<= 10 ;i++){
        System.out.println(i);
    }
}
}

Teste agora

Saída:

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

Java aninhado para loop

Se tivermos um loop for dentro de outro loop, ele é conhecido como loop for aninhado.
O loop interno é executado completamente sempre que o loop externo é executado.

Exemplo:

NestedForExample.java

classe pública  NestedForExample {
public static void  main(String[] args) {
//loop de i
for ( int  i= 1 ;i<= 3 ;i++){
//loop de j
for ( int  j= 1 ;j<= 3 ;j++){
        System.out.println(i+ " " +j);
} // fim de i
} // fim de j
}
}

Saída:


1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
Exemplo de pirâmide 1:

PyramidExample.java

public class  PyramidExample {
public static void  main(String[] args) {
for ( int  i= 1 ;i<= 5 ;i++){
for ( int  j= 1 ;j<=i;j++){
        System.out.print( "* " );
}
System.out.println(); //nova linha
}
}
}

Saída:

*
* *
* * *
* * * *
* * * * *

Exemplo de pirâmide 2:

PyramidExample2.java


classe pública  PyramidExample2 {
public static void  main(String[] args) {
int  termo = 6 ;
for ( int  i= 1 ;i<=termo;i++){
for ( int  j=termo;j>=i;j--){
        System.out.print( "* " );
}

System.out.println(); //nova linha

}
}
}

Saída:

* * * * * *
* * * * *
* * * *
* * *
* *
*

Java para cada loop
O loop for-each é usado para percorrer arrays ou coleções em Java.
É mais fácil de usar do que um loop for simples porque não precisamos incrementar o valor e usar a notação de subscrito.

Funciona com base em elementos e não no índice. Ele retorna um elemento por um na variável definida.


Sintaxe:

for (variável data_type: array_name){
//código a ser executado
}
Exemplo:

ForEachExample.java

// Exemplo de loop Java For-each que imprime o
//elementos do array
classe pública  ForEachExample {
public static void  main(String[] args) {
    //Declarando um array
    int  arr[]={ 12 , 23 , 44 , 56 , 78 };
    // Imprimindo array usando for-each loop
    for ( int  i:arr){
        System.out.println(i);
    }
}
}

Teste agora

Saída:

12
23
44
56
78

Java rotulado para loop
Podemos ter um nome de cada loop for Java. Para fazer isso, usamos label antes do loop for.
É útil ao usar o loop for aninhado, pois podemos interromper/continuar o loop for específico.

Nota: As palavras-chave break e continue quebram ou continuam o loop for mais interno, respectivamente.
Sintaxe:

nome do rótulo:
for (inicialização; condição; incremento/decremento){
//código a ser executado
}
Exemplo:

LabeledForExample.java

//Um programa Java para demonstrar o uso do laço for rotulado
classe pública  LabeledForExample {
public static void  main(String[] args) {
    //Usando Label para loop externo e for
    aa:
        for ( int  i= 1 ;i<= 3 ;i++){
            bb:
                for ( int  j= 1 ;j<= 3 ;j++){
                    if (i== 2 &&j== 2 ){
                        quebrar  aa;
                    }
                    System.out.println(i+ " " +j);
                }
        }
}
}

Saída:


1 1
1 2
1 3
2 1

Se você usar break bb; , ele interromperá apenas o loop interno, que é o comportamento padrão de qualquer loop.

LabeledForExample2.java

classe pública  LabeledForExample2 {
public static void  main(String[] args) {
    aa:
        for ( int  i= 1 ;i<= 3 ;i++){
            bb:
                for ( int  j= 1 ;j<= 3 ;j++){
                    if (i== 2 &&j== 2 ){
                        quebrar  bb;
                    }
                    System.out.println(i+ " " +j);
                }
        }
}
}

Saída:

1 1
1 2
1 3
2 1
3 1
3 2
3 3

Java Infinitivo para Loop
Se você usar dois pontos e vírgulas ;; no loop for, será infinitivo for loop.

Sintaxe:

para (;;){
//código a ser executado
}
Exemplo:

ForExample.java

//Programa Java para demonstrar o uso do loop for infinito
//que imprime uma declaração
classe pública  Por exemplo {
public static void  main(String[] args) {
    //Não usa nenhuma condição no loop for
    para (;;){
        System.out.println( "loop infinitivo" );
    }
}
}

Saída:

loop infinito
loop infinito
loop infinito
loop infinito
loop infinito

ctrl+c
Agora, você precisa pressionar ctrl+c para sair do programa.

Java para Loop vs while Loop vs do-while Loop
Comparação	para loop	loop while	loop do-while
Introdução	O loop for Java é uma instrução de fluxo de controle que itera uma parte dos programas
várias vezes.

O loop while Java é uma instrução de fluxo de controle que executa uma parte dos programas repetidamente com base em uma determinada condição booleana.
O loop Java do while é uma instrução de fluxo de controle que executa uma parte dos programas pelo menos uma vez
e a execução posterior depende da condição booleana fornecida.

Quando usar	Se o número de iteração for fixo, é recomendável usar o loop for.
Se o número de iterações não for fixo, é recomendável usar o loop while.
Se o número de iterações não for fixo e você precisar executar o loop pelo menos uma vez, é recomendável usar o loop do-while.
         */
    }
}
