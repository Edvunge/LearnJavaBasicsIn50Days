package day16_20.forEach;

public class ForEachLoop {
    public static void main(String[] args) {
        System.out.println("For-each loop em Java");
        /*

// Como Pré-requisito: Tomada de decisão em Java

For-each é outra técnica de passagem de array como loop for, loop while, loop do-while introduzida em Java5.

Ele começa com a palavra-chave for como um loop for normal.
Em vez de declarar e inicializar uma variável de contador de loop, você declara uma variável que é do mesmo tipo que o tipo base do array,
seguido por dois pontos, que é seguido pelo nome do array.

No corpo do loop, você pode usar a variável de loop que criou em vez de usar um elemento de array indexado.

É comumente usado para iterar sobre um array ou uma classe Collections (por exemplo, ArrayList)


Sintaxe:

for (digite var : array)
{
    declarações usando var;
}
é equivalente a:


for (int i=0; i<arr.length; i++)
{
    tipo var = arr[i];
    declarações usando var;
}



// Java program to illustrate
// for-each loop
class For_Each
{
    public static void main(String[] arg)
    {
        {
            int[] marks = { 125, 132, 95, 116, 110 };

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        }
    }
    public static int maximum(int[] numbers)
    {
        int maxSoFar = numbers[0];

        // for each loop
        for (int num : numbers)
        {
            if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
    return maxSoFar;
    }
}

Saída:


A pontuação mais alta é 132

       Limitações da tomada de decisão para cada loop

Os loops for-each não são apropriados quando você deseja modificar o array :

for (int num : marcas)
{
    // apenas altera num, não o elemento do array
    num = num*2;
}
       2. Os loops for-each não acompanham o índice . Portanto, não podemos obter o índice do array usando o loop For-Each


for (int num: números)
{
    if (num == alvo)
    {
        Retorna ???; // não sabe o índice de num
    }
}
        3. For-each apenas itera para frente na matriz em etapas únicas


// não pode ser convertido em um loop for-each
for (int i=numbers.length-1; i>0; i--)
{
      System.out.println(numbers[i]);
}
        4. For-each não pode processar duas declarações de tomada de decisão ao mesmo tempo


// não pode ser facilmente convertido em um loop for-each
for (int i=0; i<números.comprimento; i++)
{
    if (números[i] == arr[i])
    {...
    }
}
        5. For-each também tem alguma sobrecarga de desempenho em relação à iteração simples:


/*package whatever //do not write package name here */

        /*
import java.io.*;
import java.util.*;

        class GFG {
            public static void main (String[] args) {
                List<Integer> list = new ArrayList<>();
                long startTime;
                long endTime;
                for (int i = 0; i < 1000000; i++) {
                    list.add(i);
                }
                // Type 1
                startTime = Calendar.getInstance().getTimeInMillis();
                for (int i : list) {
                    int a = i;
                }
                endTime = Calendar.getInstance().getTimeInMillis();
                System.out.println("For each loop :: " + (endTime - startTime) + " ms");

                // Type 2
                startTime = Calendar.getInstance().getTimeInMillis();
                for (int j = 0; j < list.size(); j++) {
                    int a = list.get(j);
                }
                endTime = Calendar.getInstance().getTimeInMillis();
                System.out.println("Using collection.size() :: " + (endTime - startTime) + " ms");

                // Type 3
                startTime = Calendar.getInstance().getTimeInMillis();
                int size = list.size();
                for (int j = 0; j < size; j++) {
                    int a = list.get(j);
                }
                endTime = Calendar.getInstance().getTimeInMillis();
                System.out.println("By calculating collection.size() first :: " + (endTime - startTime) + " ms");

                // Type 4
                startTime = Calendar.getInstance().getTimeInMillis();
                for(int j = list.size()-1; j >= 0; j--) {
                    int a = list.get(j);
                }
                endTime = Calendar.getInstance().getTimeInMillis();
                System.out.println("Using [int j = list.size(); j > size ; j--] :: " + (endTime - startTime) + " ms");
            }
        }
         */
    }
}