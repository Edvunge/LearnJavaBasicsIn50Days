package day21_25.break_continue_jump;

public class ReturnKeyword {
    public static void main(String[] args) {

        System.out.println("palavra-chave de retorno ");
        /*

Em Java, return é uma palavra-chave reservada, ou seja, não podemos usá-la como identificador.
É usado para sair de um método, com ou sem valor.
Uso da palavra- chave return , pois existem duas maneiras, conforme listado abaixo:

Caso 1: Métodos que retornam um valor
Caso 2: Métodos que não retornam um valor
Vamos ilustrar implementando-os diretamente da seguinte forma:

Caso 1: Métodos que retornam um valor

Para métodos que definem um tipo de retorno, a instrução return deve ser imediatamente seguida pelo valor de retorno.

Exemplo:


// Java Program to Illustrate Usage of return Keyword

// Main method
class GFG {

    // Method 1
    // Since return type of RR method is double
    // so this method should return double value
    double RR(double a, double b) {
        double sum = 0;
        sum = (a + b) / 2.0;

        // Return statement as we already above have declared
        // return type to be double
        return sum;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Print statement
        System.out.println(new GFG().RR(5.5, 6.5));
    }
}

Saída

6,0


Explicação da saída:

Quando estamos chamando um método de classe GFG que tem return sum que retorna o valor de sum e esse valor é exibido no console.

Caso 2: Métodos que não retornam um valor

Para métodos que não retornam um valor, a instrução return em Java pode ser ignorada.
aqui surgem dois casos em que não há valor retornado pelo usuário conforme listado abaixo:


#1: Método que não usa a instrução return na função void
#2: Métodos com tipo de retorno void
#1: Método que não usa a instrução return na função void

Exemplo

// Java program to illustrate no return
// keyword needed inside void method

// Main class
class GFG {

    // Since return type of RR method is
    // void so this method shouldn't return any value
    void demoSum(int a, int b)
    {
        int sum = 0;
        sum = (a + b) / 10;
        System.out.println(sum);

        // No return statement in this method
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Calling the method
        // Over custom inputs
        new GFG().demoSum(5, 5);

        // Display message on the console for successful
        // execution of the program
        System.out.print(
            "No return keyword is used and program executed successfully");
    }

    // Note here we are not returning anything
    // as the return type is void
}

Saída

1

Nenhuma palavra-chave de retorno é usada e o programa é executado com sucesso
Nota:
A instrução de retorno não é necessária ( mas pode ser usada ) para métodos com tipo de retorno void.
Podemos usar “retorno”; o que significa não retornar nada .

#2: Métodos com tipo de retorno void

Exemplo 1-A:


// Java program to illustrate usage of
// return keyword in void method

// Class 1
// Main class
class GFG {

    // Method 1
    // Since return type of RR method is
    // void so this method should not return any value
    void demofunction(double j)
    {
        if (j < 9)

            // return statement below(only using
            // return statement and not returning
            // anything):
            // control exits the method if this
            // condition(i.e, j<9) is true.
            return;
        ++j;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Calling above method declared in above class
        new GFG().demofunction(5.5);

        // Display message on console to illustrate
        // successful execution of program
        System.out.println("Program executed successfully");
    }
}

Saída

Programa executado com sucesso

Explicação da saída:

Se a instrução if(j<9) for verdadeira, o controle sai do método e não executa o restante da instrução do método RR e,
portanto, volta novamente ao método main() .

Agora, seguindo em frente geek, você deve estar se perguntando e se usarmos a instrução return no final do programa?

A instrução return pode ser usada em vários lugares no método, mas precisamos garantir que ela seja a última instrução a ser executada em um método.

Nota : a instrução return não precisa ser a última instrução em um método, mas deve ser a última instrução a ser executada em um método.

Exemplo 1-B:


// Java program to illustrate return must not be always
// last statement, but must be last statement
// in a method to execute

// Main class
class GFG {

    // Method 1
    // Helper method
    // Since return type of RR method is void
    // so this method should not return any value
    void demofunction(double i)
    {
        // Demo condition check
        if (i < 9)

            // See here return need not be last
            // statement but must be last statement
            // in a method to execute
            return;

        else
            ++i;
    }

    // Method 2
    // main driver method
    public static void main(String[] args)
    {
        // Calling the method
        new GFG().demofunction(7);

        // Display message to illustrate
        // successful execution of program
        System.out.println("Program executed successfully");
    }
}

Saída

Programa executado com sucesso

Explicação da saída:

À medida que a condição (i<9) se torna verdadeira, ela executa a instrução return e, portanto,
o fluxo sai do método 'demofunction' e volta novamente para main. Depois disso,
a instrução return deve ser a última instrução a ser executada em um método,
o que significa que não há sentido em definir qualquer código após o retorno que é esclarecido abaixo da seguinte forma:

Exemplo 2A

// Java program to illustrate usage of
// statement after return statement

// Main class
class GFG {

    // Since return type of RR method is void
    // so this method should return any value
    // Method 1
    void demofunction(double j)
    {
        return;

        // Here get compile error since can't
        // write any statement after return keyword

        ++j;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        // Calling the above defined function
        new GFG().demofunction(5);
    }
}

Saída:

Exemplo 2-B

// Java program to illustrate usage
// of return keyword

// Main class
class GFG {

    // Since return type of RR method is
    // void so this method should not return any value
    // Method 1
    void demofunction(double val)
    {

        // Condition check
        if (val < 0) {

            System.out.println(val);
            return;

            // System.out.println("oshea");
        }
        else
            ++val;
    }

    // Method 2
    // Main drive method
    public static void main(String[] args)
    {

        // CAlling the above method
        new GFG().demofunction(-1);

        // Display message to illustrate
        // successful execution of program
        System.out.println("Program Executed Successfully");
    }
}

Saída

-1,0

Programa executado com sucesso
Nota: No programa acima, descomentamos as instruções, isso gerará um erro.
         */

    }
}