package class1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá Mundo");
	}
int idade = 25; // Declaração de variável de idade: int = variável de número inteiro.   
//idade e o  nome da variável e após ela o = e o valor e sempre terminar em '';''

double altura = 1.60; // Declaração de variável altura: double = variável de número com casa decimal. 
// altura e o nome da variável e ós ela o = e o valor e sempre terminar em '';''

char sexo = 'F'; // Declaração de variável do tipo caractere. 
// 'char' é um tipo de dado que armazena um único caractere, 
// podendo ser símbolo, letra ou número. 
// 'sexo' é o nome da variável, e 'F' é o valor atribuído a ela.E sempre terminar em '';''


// então o esquema de uma variável e <tipo> <nome> = <Valor inicial >; 
//A variável fica Hospedada da mémoriam Ram a onde e executada e conforme isso a variável também tem um endereço quye será visto mais a frente 


/*
 Tipos primitivos em Java:

 Tipos numéricos inteiros:
 - byte   (8 bits)   : valores de -128 a 127               | valor padrão: 0
 - short  (16 bits)  : valores de -32.768 a 32.767         | valor padrão: 0
 - int    (32 bits)  : valores de -2.147.483.648 a 2.147.483.647 | valor padrão: 0
 - long   (64 bits)  : valores de -9.223.372.036.854.770.000 a 9.223.372.036.854.770.000 | valor padrão: 0L

 Tipos numéricos com ponto flutuante:
 - float  (32 bits)  : valores de -1,4024E-37 a 3,4028E+38  | valor padrão: 0.0f
 - double (64 bits)  : valores de -4,94E-307 a 1,79E+308    | valor padrão: 0.0

 Tipo caractere Unicode:
 - char   (16 bits)  : valores de '\u0000' a '\uFFFF'       | valor padrão: '\u0000'

 Tipo valor verdade:
 - boolean (1 bit)   : valores {true, false}                | valor padrão: false

 Dica: para ver os códigos Unicode, acesse: https://unicode-table.com
 Exemplo de caractere: 'a' = '\u0061'

 String não é um tipo primitivo, mas sim uma classe (cadeia de caracteres).
*/



/*
 Em Java, existem 8 tipos primitivos de dados, que são utilizados para armazenar informações simples e essenciais.
 Esses tipos não são objetos e são armazenados diretamente na memória com alta performance.

 1. Tipos numéricos inteiros:
    - byte: ocupa 8 bits e armazena valores entre -128 e 127.
      Usado quando precisamos economizar memória e os valores são pequenos (ex: leitura de arquivos binários).
      
    - short: ocupa 16 bits, armazena valores entre -32.768 e 32.767.
      Pouco usado, mas útil quando há necessidade de mais espaço que o byte, ainda com economia de memória.

    - int: ocupa 32 bits, com valores entre -2.147.483.648 e 2.147.483.647.
      É o tipo mais comum para valores inteiros. Quando usamos `int x = 10;`, estamos usando esse tipo.

    - long: ocupa 64 bits, capaz de armazenar números bem maiores.
      Usado quando os valores inteiros ultrapassam o limite do `int`.
      Atenção: números literais do tipo `long` devem terminar com `L` (ex: `long numero = 10000000000L;`).

 2. Tipos numéricos com ponto flutuante (números decimais):
    - float: ocupa 32 bits, com precisão menor que o `double`.
      É usado para economizar memória quando a precisão não é tão importante.
      Deve-se usar `f` no final do número (ex: `float x = 3.14f;`).

    - double: ocupa 64 bits, com maior precisão.
      É o tipo padrão para números decimais em Java (ex: `double pi = 3.14159;`).

 3. Tipo caractere:
    - char: ocupa 16 bits e representa um caractere Unicode.
      Pode armazenar letras, símbolos e até emojis, usando o padrão Unicode (ex: `char letra = 'A';` ou `char letra = '\u0041';`).

 4. Tipo lógico:
    - boolean: ocupa apenas 1 bit e armazena `true` (verdadeiro) ou `false` (falso).
      Muito usado em estruturas de controle, como `if`, `while`, etc.

 Sobre valores padrão:
 - Quando declaramos uma variável de tipo primitivo como atributo de uma classe (sem inicializar), o Java atribui um valor padrão:
   Ex: int → 0, float → 0.0f, boolean → false, char → '\u0000', etc.

 Observação:
 - A classe `String`, embora muito usada para representar textos, **não é um tipo primitivo**. Ela é um **objeto**, ou seja, instância da classe `String`.

 Dica útil:
 - Para descobrir o código Unicode de um caractere, acesse o site: https://unicode-table.com
   Exemplo: o caractere 'a' tem o código Unicode '\u0061'.

 Saber esses tipos é essencial para entender como o Java trabalha com dados, e escolher o tipo certo ajuda a otimizar memória e performance do sistema.
*/

}
 