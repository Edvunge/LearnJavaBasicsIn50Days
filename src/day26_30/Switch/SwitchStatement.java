package day26_30.Switch;

public class SwitchStatement {
    public static void main(String[] args) {

        /*
        Uma instrução switch permite que uma variável seja testada quanto à igualdade em relação a uma lista de valores.
        Cada valor é chamado de caso, e a variável que está sendo ativada é verificada para cada caso.


Sintaxe
A sintaxe do loop for aprimorado é -


switch(expression) {
   case value :
      // Statements
      break; // optional

   case value :
      // Statements
      break; // optional

   // You can have any number of case statements.
   default : // Optional
      // Statements
}

As seguintes regras se aplicam a uma instrução switch -

A variável usada em uma instrução switch só pode ser inteiros, inteiros convertíveis (byte, short, char), strings e enums.

Você pode ter qualquer número de instruções case dentro de um switch. Cada caso é seguido pelo valor a ser comparado e dois pontos.

O valor de um caso deve ser do mesmo tipo de dados que a variável no comutador e deve ser uma constante ou um literal.

Quando a variável que está sendo ligada é igual a um case, as instruções que seguem esse case serão executadas até que uma instrução break seja alcançada.

Quando uma instrução break é alcançada, o switch termina e o fluxo de controle salta para a próxima linha após a instrução switch.

Nem todo caso precisa conter uma pausa. Se nenhuma interrupção aparecer,
     o fluxo de controle passará para os casos subsequentes até que uma interrupção seja alcançada .

Uma instrução switch pode ter um caso padrão opcional, que deve aparecer no final do switch.
O caso padrão pode ser usado para executar uma tarefa quando nenhum dos casos for verdadeiro. Nenhuma pausa é necessária no caso padrão.

Diagrama de fluxo
Declaração de Troca
Exemplo

public class Test {

   public static void main(String args[]) {
      // char grade = args[0].charAt(0);
      char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}

Compile e execute o programa acima usando vários argumentos de linha de comando.
Isso produzirá o seguinte resultado -

Saída
Well done
Your grade is C
*/
    }
}
