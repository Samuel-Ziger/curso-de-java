package Aprendizado;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio2 {
public static void main(String[] args) {

//Exercício resolvido:
//https://www.youtube.com/watch?v=Ah1Y6d6deq0
//Nesse video a cima ensina como resolver os exercicios assista antes de tentar resolver
// No final tera as resposta de  cada exercicio

/*Exercício 01
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Exemplos:
Entrada: Saída:
10
30
SOMA = 40
Entrada: Saída:
-30
10
SOMA = -20
Entrada: Saída:
0
0
SOMA = 0


Exercício 02
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
Exemplos:
Entrada: Saída:
2.00 A=12.5664
Entrada: Saída:
100.64 A=31819.3103
Entrada: Saída:
150.00 A=70685.7750


Exercício 03
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Exemplos:
Entrada: Saída:
5
6
7
8
DIFERENCA = -26
Entrada: Saída:
5
6
-7
8
DIFERENCA = 86

Exercício 04
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
Exemplos:
Entrada: Saída:
25
100
5.50
NUMBER = 25
SALARY = U$ 550.00
Entrada: Saída:
1
200
20.50
NUMBER = 1
SALARY = U$ 4100.00
Entrada: Saída:
6
145
15.55
NUMBER = 6
SALARY = U$ 2254.75

Exercício 05
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
Exemplos:
Entrada: Saída:
12 1 5.30
16 2 5.10
VALOR A PAGAR: R$ 15.50
Entrada: Saída:
13 2 15.30
161 4 5.20
VALOR A PAGAR: R$ 51.40
Entrada: Saída:
1 1 15.10
2 1 15.10
VALOR A PAGAR: R$ 30.20

Exercício 06
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Exemplos:
Entrada: Saída:
3.0 4.0 5.2 TRIANGULO: 7.800
CIRCULO: 84.949
TRAPEZIO: 18.200
QUADRADO: 16.000
RETANGULO: 12.000
Entrada: Saída:
12.7 10.4 15.2 TRIANGULO: 96.520
CIRCULO: 725.833
TRAPEZIO: 175.560
QUADRADO: 108.160
RETANGULO: 132.080
*/
Scanner sc = new Scanner(System.in);
Locale.setDefault(Locale.US);

// Exercício 01
System.out.println("Exercício 01 - Soma de dois números inteiros:");
int x = sc.nextInt();
int y = sc.nextInt();
int soma = x + y;
System.out.println("SOMA = " + soma);

// Exercício 02
System.out.println("\nExercício 02 - Área do círculo:");
double raio = sc.nextDouble();
double area = 3.14159 * raio * raio;
System.out.printf("A=%.4f%n", area);

// Exercício 03
System.out.println("\nExercício 03 - Diferença entre produtos:");
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
int D = sc.nextInt();
int diferenca = (A * B) - (C * D);
System.out.println("DIFERENCA = " + diferenca);

// Exercício 04
System.out.println("\nExercício 04 - Cálculo de salário:");
int numeroFuncionario = sc.nextInt();
int horasTrabalhadas = sc.nextInt();
double valorHora = sc.nextDouble();
double salario = horasTrabalhadas * valorHora;
System.out.println("NUMBER = " + numeroFuncionario);
System.out.printf("SALARY = U$ %.2f%n", salario);

// Exercício 05
System.out.println("\nExercício 05 - Valor a pagar por peças:");
int qtd1 = sc.nextInt();
double preco1 = sc.nextDouble();
int qtd2 = sc.nextInt();
double preco2 = sc.nextDouble();
double total = (qtd1 * preco1) + (qtd2 * preco2);
System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

// Exercício 06
System.out.println("\nExercício 06 - Cálculo de várias áreas:");
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
double triangulo = (a * c) / 2;
double circulo = 3.14159 * c * c;
double trapezio = ((a + b) * c) / 2;
double quadrado = b * b;
double retangulo = a * b;
System.out.printf("TRIANGULO: %.3f%n", triangulo);
System.out.printf("CIRCULO: %.3f%n", circulo);
System.out.printf("TRAPEZIO: %.3f%n", trapezio);
System.out.printf("QUADRADO: %.3f%n", quadrado);
System.out.printf("RETANGULO: %.3f%n", retangulo);

sc.close();

}
}
