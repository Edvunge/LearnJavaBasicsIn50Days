package day06_day10.variables_comments;

public class InstanceVariableHidingInJava {
    public static void main(String[] args) {

        System.out.println("Ocultação de variável de instância em Java");
        /*
Deve-se ter uma forte compreensão dessa palavra-chave em herança em Java para se familiarizar com o conceito.
A ocultação de variáveis de instância refere-se a um estado quando
variáveis de instância com o mesmo nome estão presentes na superclasse e na subclasse.
Agora, se tentarmos acessar usando o objeto da subclasse,
a variável de instância da subclasse oculta a variável de instância da superclasse,
independentemente de seus tipos de retorno.

Em Java, se houver uma variável local em um método com o mesmo nome da variável de instância,
a variável local ocultará a variável de instância. Se quisermos refletir a mudança feita na variável de instância,
isso pode ser feito com a ajuda desta referência.

Exemplo:

// Java Program to Illustrate Instance Variable Hiding

// Class 1
// Helper class
class Test {

    // Instance variable or member variable
    private int value = 10;

    // Method
    void method() {

        // This local variable hides instance variable
        int value = 40;

        // Note: this keyword refers to the current instance

        // Printing the value of instance variable
        System.out.println("Value of Instance variable : "
                           + this.value);

        // Printing the value of local variable
        System.out.println("Value of Local variable : "
                           + value);
    }
}

// Class 2
// Main class
class GFG {

    // Main driver method
    public static void main(String args[]) {

        // Creating object of current instance
        // inside main() method
        Test obj1 = new Test();

        // Callling method of above class
        obj1.method();
    }
}

Saída

Valor da variável de instância: 10
Valor da variável local: 40

 */
    }
}