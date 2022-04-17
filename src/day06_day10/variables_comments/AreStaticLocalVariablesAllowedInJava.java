package day06_day10.variables_comments;

public class AreStaticLocalVariablesAllowedInJava {
    public static void main(String[] args) {

        System.out.println("As variáveis locais estáticas são permitidas em Java?");

        /*
Ao contrário do C/C++, as variáveis locais estáticas não são permitidas em Java.
Por exemplo, o seguinte programa Java falha na compilação com o erro “Variáveis locais estáticas não são permitidas”

class Test {
   public static void main(String args[]) {
     System.out.println(fun());
   }

   static int fun()
   {
     static int x= 10;  //Error: Static local variables are not allowed
     return x--;
   }
}

Em Java, uma variável estática é uma variável de classe (para toda a classe).
Portanto, se tivermos uma variável local estática (uma variável com escopo limitado a função), ela viola o propósito de estática.
Portanto, o compilador não permite variável local estática.
 */
    }
}