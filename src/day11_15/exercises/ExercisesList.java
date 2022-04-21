package day11_15.exercises;

public class ExercisesList {
    /*

    B. EXERCÍCIOS DE LÓGICA


7. Faça um algoritmo para calcular a área de uma circunferência, considerando a
fórmula ÁREA = π * RAIO2. Utilize as variáveis AREA e RAIO, a constante π (pi =
3,14159) e os operadores aritméticos de multiplicação.


8. Faça um algoritmo que calcule a área de um triângulo, considerando a fórmula
Á􀜴􀜧􀜣 􀵌 􀮻􀮺􀯌􀮾 .􀮺􀯅􀯍􀯎􀯋􀮺
􀬶 . Utilize as variáveis AREA, BASE e ALTURA e os
operadores aritméticos de multiplicação e divisão.


9. Faça um algoritmo que:
a) Leia o nome;
b) Leia o sobrenome;
c) Concatene o nome com o sobrenome;
d) Apresente o nome completo.


10. Faça um algoritmo que:
a) Leia um número inteiro;
b) Leia um segundo número inteiro;
c) Efetue a adição dos dois valores;
d) Apresente o valor calculado.


11. Faça um algoritmo que:
a) Obtenha o valor para a variável HT (horas trabalhadas no mês);
b) Obtenha o valor para a variável VH (valor hora trabalhada):
c) Obtenha o valor para a variável PD (percentual de desconto);
d) Calcule o salário bruto => SB = HT * VH;
e) Calcule o total de desconto => TD = (PD/100)*SB;
f) Calcule o salário líquido => SL = SB – TD;
g) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário
Liquido.


12. Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a
convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5,
na qual F é a temperatura em Fahrenheit e C é a temperatura em Celsius;


13. Faça um algoritmo que leia uma temperatura em Fahrenheit e a apresente
convertida em graus Celsius. A fórmula de conversão é C = (F – 32) * ( 5 / 9), na
qual F é a temperatura em Fahrenheit e C é a temperatura em Celcius.


14. Faça um algoritmo que calcule e apresente o valor do volume de uma lata de
óleo, utilizando a fórmula VOLUME = 3,14159 * RAIO2 * ALTURA.
CADERNO DE EXERCÍCIOS
ALGORITMOS


15. Faça um algoritmo que calcule a quantidade de litros de combustível gasta em
uma viagem, utilizando um automóvel que faz 12Km por litro. Para obter o
cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média
durante ela. Desta forma, será possível obter a distância percorrida com a
fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância,
basta calcular a quantidade de litros de combustível utilizada na viagem com a
fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os
valores da velocidade média, tempo gasto na viagem, a distância percorrida e a
quantidade de litros utilizada na viagem.


16. Faça um algoritmo que leia dois valores para as variáveis A e B e efetue a troca
dos valores de forma que a variável A passe a possuir o valor da variável B e a
variável B passe a possuir o valor da variável A. Apresente os valores trocados.


17. Faça um algoritmo que leia quatro números e apresente os resultados de adição
e multiplicação dos valores entre si, baseando-se na utilização da propriedade
distributiva, ou seja, se forem lidas as variáveis A, B, C e D, devem ser somadas
e multiplicadas A com B, A com C e A com D; B com C, B com D e por último C
com D.


18. Faça um algoritmo que leia os valores de COMPRIMENTO, LARGURA e
ALTURA e apresente o valor do volume de uma caixa retangular. Utilize para o
cálculo a fórmula VOLUME = COMPRIMENTO * LARGURA * ALTURA.


19. Faça um algoritmo que leia um valor inteiro e apresente os resultados do
quadrado e do cubo do valor lido.


20. Faça um algoritmo que leia dois valores inteiros (A e B) e apresente o resultado
do quadrado da soma dos valores lidos.


21. Faça um algoritmo que leia dois valores inteiros (A e B) e apresente o resultado
da soma do quadrado de cada valor lido.


22. Faça um algoritmo que leia dois números nas variáveis Val1 e Val2, calcule sua
média na variável Media e imprima seu valor.


23. Faça um algoritmo que leia dois números nas variáveis NumA e NumB, nessa
ordem, e imprima em ordem inversa, isto é, se os dados lidos forem 5 e 9, por
exemplo, devem ser impressos na ordem 9 e 5.



24. Faça um algoritmo que leia a velocidade de um veículo em km/h e calcule e
imprima a velocidade em m/s (metros por segundo).



25. Faça um algoritmo que leia dois números inteiros (Int1 e Int2) e imprima o
quociente e o resto da divisão inteira de Int1 por Int2.
CADERNO DE EXERCÍCIOS
ALGORITMOS


26. Considere a seguinte situação: descontam-se inicialmente 10% do salário bruto
do trabalhador como contribuição à previdência social. Após esse desconto, há
um outro desconto de 5% sobre o valor restante do salário bruto, a título de um
determinado imposto. Faça um algoritmo que leia o salário bruto de um cidadão e
imprima o seu salário líquido.
DICA: Para a solução dos exercícios abaixo utilize os operadores de divisão inteira e
de módulo.


27. Leia um código de cinco algarismos (variável Codigo) e gere o digito verificador
(DigitoV) módulo 7 para o mesmo.
Supondo que os cinco algarismos do código são ABCDE, uma forma de calcular
o dígito desejado, com módulo 7 é:
DigitoV = resto da divisão de S por 7, onde
S = 6*A + 5*B + 4*C + 3*D + 2*E


28. Dado um número de três algarismos N = CDU (onde C é o algarismo das
centenas, D é o algarismo das dezenas e U o algarismo das unidades),
considere o número M constituído pelos algarismos de N em ordem inversa, isto
é, M = UDC. Gerar M a partir de N (p.ex.: N = 123 -> M = 321).


29. Admitindo que uma data é lida pelo algoritmo em uma variável inteira, e não em
uma variável do tipo data, crie um algoritmo que leia uma data no formato
DDMMAA e imprima essa data no formato AAMMDD, onde:
• A letra D corresponde a dois algarismos representando o dia;
• A letra M corresponde a dois algarismos representando o mês;
• A letra A corresponde aos dois últimos algarismos representando o ano.


30. Suponha que uma escola utilize, como código de matrícula, um número inteiro
no formato AASDDD, onde:
• Os dois primeiros dígitos, representados pela letra A, são os dois últimos
algarismos do ano da matrícula;
• O terceiro dígito, representado pela letra S, vale 1 ou 2, conforme o aluno
tenha se matriculado no 1º ou 2º semestre;
• Os quatro últimos dígitos, representados pela letra D, correspondem à ordem
da matrícula do aluno, no semestre e no ano em questão.
Crie um algoritmo que leia o número de matrícula de um aluno e imprima o ano
e o semestre em que ele foi matriculado.

     */
}