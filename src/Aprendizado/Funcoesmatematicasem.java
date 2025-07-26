package Aprendizado;

import java.util.Scanner;

public class Funcoesmatematicasem {

public static void main(String[] args) {
//Vamos começar com as Funções matemáticas dentro de Java.

//Exemplo:
/*A = Math.sqrt(x);   Variável  "A" Recebe  a raiz  quadrada de "X"
A = Math.pow(x, y);  Variável  "A R" Recebe  o resultaod  de "X" elevado a "Y"
A = Math.abs(x);  Variável  "A" Recebe  o valor absoluto de "X" */

double x = 3.0;
double y = 4.0;
double z = -5.0;
double A, B, C;
// Raiz quadrada
A = Math.sqrt(x);
B = Math.sqrt(y);
C = Math.sqrt(25.0);
System.out.println("Raiz quadrada de " + x + " = " + A);
System.out.println("Raiz quadrada de " + y + " = " + B);
System.out.println("Raiz quadrada de 25 = " + C);
// Potência
A = Math.pow(x, y);
B = Math.pow(x, 2.0);
C = Math.pow(5.0, 2.0);
System.out.println(x + " elevado a " + y + " = " + A);
System.out.println(x + " elevado ao quadrado = " + B);
System.out.println("5 elevado ao quadrado = " + C);
// Valor absoluto
A = Math.abs(y);
B = Math.abs(z);
System.out.println("Valor absoluto de " + y + " = " + A);
System.out.println("Valor absoluto de " + z + " = " + B);


// aqui a baixo e um exemplo de formulas maiores como bhaskara
Scanner sc = new Scanner(System.in);

double a, b, c, delta, x1, x2;

System.out.print("Digite o valor de a: ");
    a = sc.nextDouble();

System.out.print("Digite o valor de b: ");
    b = sc.nextDouble();

System.out.print("Digite o valor de c: ");
    c = sc.nextDouble();

delta = Math.pow(b, 2.0) - 4 * a * c;

if (delta < 0 || a == 0) {
    System.out.println("A equação não possui raízes reais.");
    } else {
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

sc.close();
}
}
