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
// Observação (como modo de boa pratica se está sendo usado uma variáel do tipo double colocar o . + 0 caso não seja outro numero como no exemplo que 6.0)


// exemplo 4 
int a1, b1;
double resultado;
a1 = 5;
b1 = 2;
resultado = a1 / b1;
System.out.println(resultado);
// nesse caso o resultado seria 2,5 mas vai dar 2.0 porque ?
// Porque o compilador de java vai lê que a variável e = a int que siginifica que ela e de número interio mesmo que o resultado 
// seja uma variável estilo double quando atribuida ela esta sendo atribuida a uma variável int então ele corta as casas decimais.
// então pra avisar ao computador que não pra ser feito isso será da seguite forma:
int a2, b2;
double resultado2;
a2 = 5;
b2 = 2;
resultado2 = (double) a2 / b2;
System.out.println(resultado2);
// dessa forma colcoando o double dentro de () antes de declarar as variáveis a & b ele iria dar a respsotar de 2,5 isso e chamado de casting 


//agora no exemplo 5 iremos vê mais sobre o casting 
// ele faz isso porque o complidador vai lê como se você fosse perde informção,por isso deve ser declarado sua forma.
// exemplo 5:
double a3;
int b3;
a3 = 5.0;
b3 = (int) a3;/* esse e o casting  o (int) caso faça isso sem ele o resultado dara errado*/
System.out.println(b3);

    }
}