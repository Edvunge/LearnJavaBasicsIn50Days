package day06_day10.variables_comments;

public class RulesForVariableDeclarationInJava {
    public static void main(String[] args) {

        System.out.println("Regras para declaração de variável em Java ");
        /*

    A variável em Java é um contêiner de dados que salva os valores dos dados durante a execução do programa Java.
    Cada variável recebe um tipo de dados que designa o tipo e a quantidade de valor que ela pode conter.
    Variável é um nome de local de memória dos dados.


    Sintaxe:

    data _type nome_variável = valor;

    Regras para declarar uma variável
    Um nome de variável pode consistir em letras maiúsculas AZ ,
    letras minúsculas az dígitos 0-9 e dois caracteres especiais,
    como _ sublinhado e $ cifrão.
    O primeiro caractere não deve ser um dígito.
    Espaços em branco não podem ser usados em nomes de variáveis.
    Palavras-chave Java não podem ser usadas como nomes de variáveis.
    Os nomes de variáveis diferenciam maiúsculas de minúsculas.
    O comprimento máximo da variável é de 64 caracteres.
    Os nomes de variáveis sempre devem existir no lado esquerdo dos operadores de atribuição.
    Lista de palavras-chave Java
*/

        System.out.println("List of Java keywords");
/*


abstract	continue	  for	        new	          switch
assert	    package   	synchronized	default	        goto
boolean 	do	        if	            private 	    this
break	    else	    import  	    public  	    throw
byte	     enum	    implements 	    protected 	   throws
case	     double 	instanceof 	    return	    transient
catch	     extends 	int	short	    try
char	     final	    interface	    static	        void
class	     finally	long	        strictfp  	volatile
const	      float 	native	        super	        while
 */

        /*
A tabela acima mostra a lista de todas as palavras-chave java que os programadores não podem usar para nomear suas variáveis,
 métodos, classes, etc. As palavras-chave const e goto são reservadas, mas não são usadas atualmente.
 As palavras true, false e null podem parecer palavras-chave, mas na verdade são literais,
 você não pode usá-las como identificadores em seus programas.


import java.io.*;

class GFG {
    public static void main(String[] args)
    {
        // Declaring all the
        // possible combinations of
        // variable format
        int _a = 10;
        int $b = 20;
        int C = 30;
        int c = 40;

        int result = _a + $b + C + c;

        // Displaying O/P
        System.out.println("Result: " + result);
    }
}
Saída:

Resultado: 100
Aqui estão alguns exemplos de nomes de variáveis Java válidos:

myvar
minhaVar
MYVAR
_myVar
$myVar
minhaVar1
minhaVar_1
 */
    }
}