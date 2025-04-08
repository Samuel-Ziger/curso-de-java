package Aprendizado;

public class ProcessamentoDeDados{
    public static void main(String[] args){
        //Comando de Atribuição de dados.
//Sintaxe:
//<Variável> = <Expressão>;
// "=" - Siginifica Recebe
// a Regra funcionad a seguinte maneira;
// 1)-A expressão que sempre fica do lado direito e cálculada
// 2)-O resultado da expressão é armazendado na variável que ficara sempre ao lado esquerdo 
//Exemplo:
// Exemplo 1: Variáveis inteiras
int x1, y1;
x1 = 5;
y1 = 2 * x1;

System.out.println("Exemplo com int:");
System.out.println(x1);
System.out.println(y1);

// Exemplo 2: Variáveis double
int x2 ;
double y2;
x2 = 5;
y2 = 2 * x2;

System.out.println("Exemplo com double:");
System.out.println(x2);
System.out.println(y2);

// No exemplo 2 podemos vê que ao adcionar o double ele ficara com o resultado de 10.0
// Agora no Exemplo 3 vamos solucionar o calculo da área de um trapseio com seguintes infomações:
// b = 6, h = 5, B = 8, o cálculo será da área de é: área = (b + B) sobre 2  Multiplicado por h
// que ficara assim : área = (6 + 8 ) sobre 2 Multiplicado por 5 que é igual 14 sobre 2  multiplicado por 5 = a 7 x 5 = 35
// em java ficara assim:

double b, B, h, area;
b = 6.0;
B = 8.0;
h = 5.0;
area = (b + B) / 2.0 * h;
System.out.println(area);
// O resultado sera de 35.0


    }
}