package Aprendizado;

import java.util.Scanner;

public class ExercicoCondicionais {
    public static void main(String[] args) {
        /*
         Exercício 01
Enunciado:
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

Exemplos:
Entrada: -10 → Saída: NEGATIVO
Entrada: 8 → Saída: NAO NEGATIVO
Entrada: 0 → Saída: NAO NEGATIVO

Exercício 02
Enunciado:
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

Exemplos:
Entrada: 12 → Saída: PAR
Entrada: -27 → Saída: IMPAR
Entrada: 0 → Saída: PAR

Exercício 03
Enunciado:
Leia dois valores inteiros (A e B). O programa deve mostrar a mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Os números podem ser digitados em qualquer ordem.

Exemplos:
Entrada: 6 24 → Saída: Sao Multiplos
Entrada: 6 25 → Saída: Nao sao Multiplos
Entrada: 24 6 → Saída: Sao Multiplos

Exercício 04
Enunciado:
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que ele pode começar em um dia e terminar no outro, com duração mínima de 1 hora e máxima de 24 horas.

Exemplos:
Entrada: 16 2 → Saída: O JOGO DUROU 10 HORA(S)
Entrada: 0 0 → Saída: O JOGO DUROU 24 HORA(S)
Entrada: 2 16 → Saída: O JOGO DUROU 14 HORA(S)

Exercício 05
Enunciado:
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade. A seguir, calcule e mostre o valor total da conta.


Código	Especificação	Preço
1	Cachorro Quente	4.00
2	X-Salada	4.50
3	X-Bacon	5.00
4	Torrada simples	2.00
5	Refrigerante	1.50
Exemplos:
Entrada: 3 2 → Saída: Total: R$ 10.00
Entrada: 2 3 → Saída: Total: R$ 13.50

Exercício 06
Enunciado:
Você deve fazer um programa que leia um valor e apresente uma mensagem dizendo em qual dos seguintes intervalos ele se encontra:

[0,25]

(25,50]

(50,75]

(75,100]

Se o valor não estiver em nenhum desses intervalos, deve imprimir: "Fora de intervalo".

Exemplos:
Entrada: 25.01 → Saída: Intervalo (25,50]
Entrada: 25.00 → Saída: Intervalo [0,25]
Entrada: 100.00 → Saída: Intervalo (75,100]
Entrada: -25.02 → Saída: Fora de intervalo

Exercício 07
Enunciado:
Leia dois valores com uma casa decimal (x e y), que representam as coordenadas de um ponto no plano. Determine em qual quadrante o ponto está ou se ele está sobre um dos eixos ou na origem.

Se o ponto estiver na origem (x = y = 0): "Origem"

Se estiver sobre um dos eixos:

"Eixo X" se y = 0

"Eixo Y" se x = 0

Quadrantes:

Q1: x > 0 e y > 0

Q2: x < 0 e y > 0

Q3: x < 0 e y < 0

Q4: x > 0 e y < 0

Exemplos:
Entrada: 4.5 -2.2 → Saída: Q4
Entrada: 0.1 0.1 → Saída: Q1
Entrada: 0.0 0.0 → Saída: Origem

Exercício 08
Enunciado:
Leia um valor com duas casas decimais (salário) e calcule o valor do Imposto de Renda a pagar de acordo com a seguinte tabela:


Faixa de Salário (R$)	Alíquota
0.00 a 2000.00	Isento
2000.01 a 3000.00	8%
3000.01 a 4500.00	18%
Acima de 4500.00	28%
O imposto é calculado apenas sobre a parte que excede cada faixa.

Exemplos:
Entrada: 3002.00 → Saída: R$ 80.36
Entrada: 1701.12 → Saída: Isento
Entrada: 4520.00 → Saída: R$ 355.60


RESOLUÇÃO
         */
        //ex1
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
        //ex2
        Scanner sc2 = new Scanner(System.in);
        int numero2 = sc.nextInt();

        if (numero2 % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        
        sc2.close();

        //EX3
        Scanner sc3 = new Scanner(System.in);
        int a = sc3.nextInt();
        int b = sc3.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc3.close();
        //EX4
        Scanner sc4 = new Scanner(System.in);
        int inicio = sc4.nextInt();
        int fim = sc4.nextInt();

        int duracao = (fim - inicio + 24) % 24;
        if (duracao == 0) duracao = 24;

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc4.close();
        //EX5
        Scanner sc5 = new Scanner(System.in);
        int codigo = sc5.nextInt();
        int qtd = sc5.nextInt();

        double total = 0.0;

        switch (codigo) {
            case 1: total = qtd * 4.0; break;
            case 2: total = qtd * 4.5; break;
            case 3: total = qtd * 5.0; break;
            case 4: total = qtd * 2.0; break;
            case 5: total = qtd * 1.5; break;
        }

        System.out.printf("Total: R$ %.2f%n", total);
        sc5.close();
        //EX6
        Scanner sc6 = new Scanner(System.in);
        double valor = sc6.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc6.close();
        //EX7
        Scanner sc7 = new Scanner(System.in);
        double x = sc7.nextDouble();
        double y = sc7.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc7.close();
        //EX8
        Scanner sc8 = new Scanner(System.in);
        double salario = sc8.nextDouble();
        double imposto = 0.0;

        if (salario <= 2000.0) {
            System.out.println("Isento");
        } else {
            if (salario <= 3000.0) {
                imposto = (salario - 2000.0) * 0.08;
            } else if (salario <= 4500.0) {
                imposto = (1000.0 * 0.08) + (salario - 3000.0) * 0.18;
            } else {
                imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + (salario - 4500.0) * 0.28;
            }
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc8.close();
    }
}
