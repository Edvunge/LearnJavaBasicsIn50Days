package day21_25.exercises;

public class ExercicicioGeral {
    public static void main(String[] args) {
        double d = 100.675;
        double e = 100.500;
        double f = 100.200;

        System.out.println(Math.rint(d));
        System.out.println(Math.rint(e));
        System.out.println(Math.rint(f));
        /*
        C. EXERCÍCIOS ESTRUTURA SE...ENTAO

39. Suponha que um caixa disponha apenas de notas de 1, 10 e 100 reais.
Considerando que alguém está pagando uma compra, escreva um algoritmo que
mostre o número mínimo de notas que o caixa deve fornecer como troco. Mostre
também: o valor da compra, o valor do troco e a quantidade de cada tipo de nota
do troco. Suponha que o sistema monetário não utilize moedas.

40. Uma empresa produz três tipos de peças mecânicas: parafusos, porcas e
arruelas. Têm-se os preços unitários de cada tipo de peça e sabe-se que sobre
estes preços incidem descontos de 10% para porcas, 20% para parafusos e 30%
para arruelas. Escreva um algoritmo que calcule o valor total da compra de um
cliente. Deve ser mostrado o nome do cliente. O número de cada tipo de peça
que o mesmo comprou, o total de desconto e o total a pagar pela compra.

41. A revendedora de carros Pica-Pau Ltda. paga aos seus funcionários vendedores
dois salários mínimos fixos, mais uma comissão fixa de R$ 50,00 por carro
vendido e mais 5% do valor das vendas. Faça um algoritmo que determine o
salário total de um vendedor.

42. Uma pessoa comprou quatro artigos em uma loja. Para cada artigo, tem-se
nome, preço e percentual de desconto. Faça um algoritmo que imprima nome,
preço e preço com desconto de cada artigo e o total a pagar.



44. Uma sorveteria vende três tipos de picolés. Sabendo-se que o picolé do tipo 1 é
vendido por R$ 0.50, o do tipo 2 por R$ 0.60 e o do tipo 3 por R$ 0.75, faça um
algoritmo que, para cada tipo de picolé, mostre a quantidade vendida e o total
arrecadado.

45. Escreva um algoritmo que, para uma conta bancária, leia o seu número, o saldo,
o tipo de operação a ser realizada (depósito ou retirada) e o valor da operação.
Após, determine e mostre o novo saldo. Se o novo saldo ficar negativo, deve ser
mostrada, também, a mensagem “conta estourada”.
CADERNO DE EXERCÍCIOS
ALGORITMOS

46. Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de
serviços é de:
• R$ 5.50 por diária, se o número de diárias for maior que 15;
• R$ 6.00 por diária, se o número de diárias for menor que 15.
Construa um algoritmo que mostre o nome e o total da conta de um cliente.

47. Construir um algoritmo que tome como entradas três valores distintos e os
apresente (imprima) em ordem crescente (menor para o maior).

48. Faça um algoritmo que leia 3 números inteiros distintos e escreva o menor deles.

49. Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos
lados de um triângulo, e se forem, verificar se é um triângulo equilátero, isóscele
ou escaleno. Se eles não formarem um triângulo, escrever uma mensagem.
Antes da elaboração do algoritmo, torna-se necessário a revisão de algumas
propriedades e definições.
Propriedade – o comprimento de cada lado de um triângulo é menor do que a
soma dos comprimentos dos outros dois lados.
Definição 1 - chama-se de triângulo equilátero o que tem os comprimentos dos
três lados iguais;
Definição 2 - chama-se de triângulo isóscele o triângulo que tem os
comprimentos de dois lados iguais;
Definição 3 - chama-se triângulo escaleno o triângulo que tem os
comprimentos dos três lados diferentes.

50. Suponha que o conceito de um aluno seja determinado em função da sua nota.
Suponha, também, que esta nota seja um valor inteiro na faixa de 0 a 100,
conforme a seguinte faixa:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 a 100 Ótimo
Crie um algoritmo que apresente o conceito e a nota do aluno.

51. Faça um algoritmo que leia dois números e mostre qual o maior dos dois.

52. Faça um algoritmo que leia dois números e indique se são iguais ou se são
diferentes. Mostre o maior e o menor (nesta sequência).

53. Faça um algoritmo que leia três números e mostre-os em ordem decrescente.
CADERNO DE EXERCÍCIOS
ALGORITMOS

54. Faça um algoritmo que leia quatro números (Opção , Num1 , Num2 e Num3) e
mostre o valor de Num1 se Opção for igual a 2; o valor de Num2 se Opção for
igual a 3; e o valor de Num3 se Opção for igual a 4. Os únicos valores possíveis
para a variável Opção são 2, 3 e 4.

55. Calcule a média aritmética das três notas de um aluno e mostre, além do valor
da média, uma mensagem de "Aprovado", caso a média seja igual ou superior a
7; a mensagem “em prova final” caso a média seja menor que 7 e maior ou igual
a 4; e "reprovado", caso contrário.

56. Elaborar um algoritmo que lê três valores a, b, c e os escreve. A seguir, encontre
o maior dos três valores e o escreva com a mensagem : "É o maior”.

57. Elaborar um algoritmo que lê dois valores a e b e os escreve com a mensagem:
“São múltiplos” ou “Não são múltiplos”.

58. Escreva um algoritmo que leia o código de um aluno e suas três notas. Calcule a
média ponderada do aluno, considerando que o peso para a maior nota seja 4 e
para as duas restantes, 3. Mostre o código do aluno, suas três notas, a média
calculada e uma mensagem: "APROVADO" se a média for maior ou igual a 5 e
"REPROVADO" se a média for menor que 5.

59. Faça um algoritmo que leia um número inteiro e mostre uma mensagem
indicando se este número é par ou ímpar e se é positivo ou negativo.

60. O cardápio de uma lanchonete é o seguinte:
Especificação Preço unitário
100 Cachorro quente 1,10
101 Bauru simples 1,30
102 Bauru c/ovo 1,50
103 Hamburger 1,10
104 Cheeseburger 1,30
105 Refrigerante 1,00
Escrever um algoritmo que leia o código do item pedido, a quantidade e calcule
o valor a ser pago por aquele lanche. Considere que a cada execução somente
será calculado um item.

61. Um usuário deseja um algoritmo pelo qual possa escolher que tipo de média
deseja calcular a partir de três notas. Faça um algoritmo que leia as notas, a
opção escolhida pelo usuário e calcule a média:
1- aritmética
2- ponderada (pesos 3, 3, 4)
CADERNO DE EXERCÍCIOS
ALGORITMOS

62. Um banco concederá um crédito especial aos seus clientes, variável com o saldo
médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e
calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem
informando o saldo médio e o valor do crédito.
Saldo médio Percentual
de 0 a 200 nenhum crédito
de 201 a 400 20% do valor do saldo médio
de 401 a 600 30% do valor do saldo médio
acima de 601 40% do valor do saldo médio

63. Um vendedor necessita de um algoritmo que calcule o preço total devido por um
cliente. O algoritmo deve receber o código de um produto e a quantidade
comprada e calcular o preço total, usando a tabela abaixo:
Código do produto Preço unitário
1001 5,32
1324 6,45
6548 2,37
0987 5,32
7623 6,45

64. Um vendedor precisa de um algoritmo que calcule o preço total devido por um
cliente. O algoritmo deve receber o código de um produto e a quantidade
comprada e calcular o preço total, usando a tabela abaixo. Mostre uma
mensagem no caso de código inválido.
Código Preço Unitário
'ABCD' R$ 5,30
'XYPK' R$ 6,00
'KLMP' R$ 3,20
'QRST' R$ 2,50

65. Crie um algoritmo em que o aluno digita duas notas bimestrais e informa se o
aluno foi aprovado ou não. Nota: Considere aprovado se a nota for maior que
5.0.

66. Escreva um algoritmo que leia dois números inteiros e determine qual é o menor
e qual é o maior também.

67. Crie o algoritmo Funcionario para calcular o aumento salarial de um empregado.
Por padrão, o aumento será de 15%. Entretanto, deve ser aplicada uma regra
diferente para cada faixa salarial. Regras:
a) se 1.500,00 <= salarioAtual < 1.750,00: aumento igual a 12%
b) se 1.750,00 <= salarioAtual < 2.000,00: aumento igual a 10%
c) se 2.000,00 <= salarioAtual < 3.000,00: aumento igual a 7%
d) se salarioAtual acima de 3.000,00: aumento igual a 5%.
CADERNO DE EXERCÍCIOS
ALGORITMOS

68. Crie um algoritmo que calcula o desconto previdenciário de um funcionário. Dado
um salário, o programa deve retornar o valor do desconto proporcional ao
mesmo. O cálculo segue a regra: o desconto é de 11% do valor do salário,
entretanto, o valor máximo de desconto é 318,20. Sendo assim, ou o algoritmo
retorna o valor equivalente a 11% sobre o salário ou 318,20.

69. Crie um algoritmo chamado Zodiaco. Este algoritmo deve ler a data do seu
aniversário e atribuir um valor para a variável inteira chamada signo, conforme
lista abaixo:
a) 1o signo do zodíaco: Aquário (21/jan a 19/fev)
b) 2o signo do zodíaco: Peixes (20/fev a 20/mar)
c) 3o signo do zodíaco: Áries (21/mar a 20/abr)
d) 4o signo do zodíaco: Touro (21/abr a 20/mai)
e) 5o signo do zodíaco: Gêmeos (21/mai a 20/jun)
f) 6o signo do zodíaco: Câncer (21/jun a 21/jul)
g) 7o signo do zodíaco: Leão (22/jul a 22/ago)
h) 8o signo do zodíaco: Virgem (23/ago a 22/set)
i) 9o signo do zodíaco: Libra (23/set a 22/out)
j) 10o signo do zodíaco: Escorpião (23/out a 21/nov)
k) 11o signo do zodíaco: Sagitário (22/nov a 21/dez)
l) 12o signo do zodíaco: Capricórnio (22/dez a 20/jan)
O algoritmo deve imprimir uma mensagem, como o exemplo: "Você é do seguinte
signo do zodíaco: Libra"

70. Crie um algoritmo que retorne verdadeiro quando um número fornecido for par.

71. Crie um algoritmo que peça o nome, a altura e o peso de duas pessoas e
apresente o nome da mais pesada e o nome da mais alta.
         */
    }
}