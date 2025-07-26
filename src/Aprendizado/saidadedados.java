package Aprendizado;
import java.util.Locale;
public class saidadedados {
    //saida de dados ou escrita o que quer dizer que o sistema está escrevendo 
    public static void main(String[] args){
        System.out.println("ola mundo!");
        System.out.println("Bom dia");
        //Aqui ele está nós mostrando a saida de dado de forma escrita 
        // sendo que a forma dos dados sairem e através do println
        // o println faz com que tenha a quebra de linha
        //caso seja pra escreve basta colocar o comando mas sem o "ln" dessa forma = print ficando da forma a baixo
        System.out.print("Conteudo 1 a ser mostrado");
        System.out.print("Conteudo 2 a ser mostrado");


        // agora pra escereve na tela alguam variável do tipo básico

        // suponhamos que você tenha uma variável "int" declarada e iniciada:
        int y = 32;
        //agora pra escreve na tela o conteudo da variável int será da seguinte forma 
        System.out.print(y);



        //Agora como fazer com ponto flutante:
        /*
 Para escrever o conteúdo de uma variável com ponto flutuante em Java (como float ou double),
 usamos as funções de saída como `System.out.println()` ou `System.out.printf()`.

 Exemplo:
    double x = 10.35784;

 - `System.out.println(x);`
   Exibe o valor completo da variável conforme está armazenado, com todas as casas decimais possíveis.

 - `System.out.printf("%.2f%n", x);`
   Exibe o valor com **2 casas decimais**. O `%.2f` indica que queremos duas casas após o ponto.
   O `%n` é uma quebra de linha que funciona de forma **independente da plataforma** (melhor que usar `\n`).

 - `System.out.printf("%.4f%n", x);`
   Exibe o valor com **4 casas decimais**, útil quando se quer mais precisão visual no número.

 **IMPORTANTE:**
 Por padrão, alguns sistemas (como computadores configurados com idioma português do Brasil) podem usar **vírgula (,)**
 como separador decimal. Isso pode causar erro ou comportamento inesperado ao usar `Scanner` para ler números com ponto (.)

 Para garantir que o separador de decimais seja o **ponto (.)**, como é o padrão em inglês (EUA),
 configure a localização da aplicação com:

     Locale.setDefault(Locale.US);

 Faça isso **antes** de criar o objeto `Scanner`, por exemplo:

     import java.util.Locale;
     import java.util.Scanner;

     public class Exemplo {
         public static void main(String[] args) {
             Locale.setDefault(Locale.US); // Força o uso do ponto como separador decimal
             Scanner sc = new Scanner(System.in);

             double x = sc.nextDouble();
             System.out.printf("%.2f%n", x);
             sc.close();
         }
     }

 Essa prática evita erros comuns ao lidar com números de ponto flutuante, especialmente ao fazer entrada e saída de dados com o usuário.
*/
/*
==============================================
 EXPLICAÇÃO DETALHADA – VARIÁVEIS COM PONTO FLUTUANTE EM JAVA
==============================================

1) O que são variáveis com ponto flutuante?
   - São variáveis que armazenam **números reais**, ou seja, números com casas decimais.
   - Em Java, usamos dois tipos para isso:
     • float  → precisão menor (32 bits)
     • double → precisão maior (64 bits) → mais usado no dia a dia.

   Exemplo de declaração:
     double x = 10.35784;

2) Como imprimir valores com ponto flutuante?
   - Podemos usar três formas principais:
     • System.out.println(x);
       → Imprime o número completo com todas as casas possíveis (ex: 10.35784).

     • System.out.printf("%.2f%n", x);
       → Imprime o número com **exatamente 2 casas decimais** (ex: 10.36).
       → O `%.2f` indica o **formato do número** (2 casas após o ponto).
       → O `%n` é uma **quebra de linha compatível com qualquer sistema operacional**
         (evita problemas em Windows, Linux ou Mac).

     • System.out.printf("%.4f%n", x);
       → Mesmo princípio, mas com 4 casas decimais (ex: 10.3578).

   Resumo dos símbolos:
     - `%f` → indica que vamos imprimir um número de ponto flutuante.
     - `.2` → significa duas casas decimais (pode trocar para `.1`, `.3`, etc).
     - `%n` → quebra de linha universal (melhor do que usar `\n`).

3) Problema comum: separador decimal
   - Em alguns países, como o Brasil, o separador decimal é a **vírgula (,)**.
   - Em Java, o padrão é usar o **ponto (.)** como separador decimal.
   - Se o seu sistema estiver configurado em português/brasileiro, e você tentar ler um número com ponto usando `Scanner`, pode dar erro.

4) Solução: configurar a localização para os EUA
   - Antes de criar o objeto `Scanner`, diga ao Java que você quer usar o padrão dos Estados Unidos (que usa ponto como separador).
   - Isso é feito com o comando:
     Locale.setDefault(Locale.US);

   Exemplo de código completo:

     import java.util.Locale;
     import java.util.Scanner;

     public class Main {
         public static void main(String[] args) {
             Locale.setDefault(Locale.US); // Força o uso do ponto como separador decimal
             
             Scanner sc = new Scanner(System.in);
             
             double x = sc.nextDouble(); // Usuário digita um número com ponto
             
             System.out.println("Número completo: " + x);
             System.out.printf("Com 2 casas decimais: %.2f%n", x);
             System.out.printf("Com 4 casas decimais: %.4f%n", x);

             sc.close();
         }
     }

5) Conclusão:
   - Sempre que lidar com valores decimais, lembre-se de usar `double` (ou `float`) e controlar a formatação com `printf`.
   - Para evitar problemas de leitura com `Scanner`, use `Locale.setDefault(Locale.US)` no início do seu `main`.
   - Isso te garante um código mais limpo, preciso e compatível com outros sistemas.

DICA EXTRA:
   - `%n` é melhor que `\n` porque funciona corretamente em qualquer sistema (Linux, Windows, Mac). Por isso, prefira sempre `%n` em `printf`.

*/
//agora vamos testar:
double x = 10.35784;
System.out.println(x);
System.out.printf("%.2f%n", x);
//nesse caso como ficou com 357 o sistema arredonda pra 36 e colocu uma "," como separador 
// agora vamos teste Substituindo 0 2f% por 4f%
System.out.printf("%.4f%n", x);
//agora porque da ","ela e porque o meu desktop está no idioma POrtuguês 
//pra Alterar da "," pro "." existe um comando que o seguinte:
Locale.setDefault(Locale.US);
// Mas pra fazer o Comando a cima te que ser importato o seguinte comando:
//import java.util.Locale;
//Observação esse coamando deve ser colcocado no começo da página pra que funcione corretamente como está la em cima 
//agora a baixo do comando ele ira fazer a troca de "," por "."
System.out.printf("%.4f%n", x); 
// dessa forma o separado virou um "."


/*
===================================================
 CONCATENAÇÃO DE ELEMENTOS NO COMANDO DE ESCRITA
===================================================

1) O que é concatenar?
   - Concatenar significa **juntar vários pedaços de informação** (como textos, números, variáveis) em uma única frase ou linha de saída.

2) Como concatenar no Java?
   - Usamos o símbolo **+** para concatenar elementos nas funções `print` e `println`.

   Exemplo de sintaxe geral:
     elemento1 + elemento2 + elemento3 + ... + elementoN;

   Isso pode envolver:
     • Strings (textos)
     • Variáveis numéricas
     • Valores literais
     • Expressões

3) Exemplo prático:
   double x = 5.75;

   System.out.println("RESULTADO = " + x + " METROS");

   O que acontece aqui:
   - "RESULTADO = " → é uma **String literal** (texto fixo).
   - `x` → é uma **variável do tipo double**.
   - " METROS" → é outro texto fixo.
   - O Java vai **juntar tudo** e imprimir:
     RESULTADO = 5.75 METROS

4) Dica:
   - O símbolo `+` é interpretado como **soma** quando usado entre números,
     mas quando está entre **Strings ou misturado com texto**, ele é interpretado como **concatenação**.
   - Então, se `x` for um número e estiver entre textos, o Java vai transformar automaticamente esse número em texto.

5) Por que usar println?
   - A função `System.out.println(...)` imprime a informação e pula uma linha no final.
   - Se quiser continuar na mesma linha, pode usar `System.out.print(...)`.

6) Alternativa moderna:
   - Também podemos usar `System.out.printf(...)` para formatar melhor a saída, mas a concatenação com `+` é mais simples e intuitiva para iniciantes.

7) Conclusão:
   - A concatenação com `+` é uma ferramenta poderosa e muito usada para mostrar mensagens combinadas com variáveis na tela.
   - Saber usar isso bem vai te ajudar a criar saídas mais claras e informativas no terminal.

*/
System.out.println("RESULTADO = " + x + " METROS");
//aqui manterei as infomações do 10.35784 mas pode ser usado qualquer um 


/*
===================================================
 COMO FORMATAR E CONCATENAR SAÍDAS COM printf
===================================================

1) O que é o printf?
   - `System.out.printf(...)` é uma forma de exibir informações formatadas no Java.
   - Ele permite controlar exatamente como os valores vão aparecer na tela (quantas casas decimais, alinhamento, etc).

2) Sintaxe básica:
   "Texto1 %f Texto2 %f Texto3", variavel1, variavel2

   - Os **%f** são marcadores de posição (placeholders) que serão substituídos pelas variáveis passadas depois da vírgula.
   - Cada marcador %f corresponde a um número de ponto flutuante (como float ou double).

3) Exemplos de marcadores:
   - **%f**  → número de ponto flutuante (ex: 10.5)
   - **%.2f** → número com 2 casas decimais (ex: 10.50)
   - **%n** → quebra de linha (funciona em qualquer sistema operacional)

4) Exemplo prático:
   ```java
   double x = 10.35784;
   System.out.printf("RESULTADO = %.2f metros%n", x);
*/
System.out.printf("RESULTADO = %.2f metros%n", x);
// Seguinto a explicação e usando o código a cima ainda usando o número 10.35784 ele dara o resultado 10.36 porque teve o arredondamento



/*
========================================================================
 CONCATENANDO E FORMATANDO VÁRIOS TIPOS DE DADOS COM printf EM JAVA
========================================================================

 Objetivo:
Aprender como mostrar na tela uma frase contendo diferentes tipos de dados
(um texto, um número inteiro e um número com casas decimais), tudo usando
apenas um único comando de saída.

O comando utilizado é: System.out.printf(...);

Exemplo completo:
-------------------------------------------
String nome = "Maria";
int idade = 31;
double renda = 4000.0;
System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
-------------------------------------------

Entendendo linha por linha:

→ `String nome = "Maria";`
  - Aqui estamos declarando uma variável do tipo texto (String) e guardando o nome "Maria".

→ `int idade = 31;`
  - Criamos uma variável do tipo inteiro (int), representando a idade.

→ `double renda = 4000.0;`
  - Declaramos uma variável com ponto flutuante (double), que armazena o valor da renda.

→ `System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);`
  - Esse é o comando que imprime tudo de forma formatada.

Vamos decodificar essa frase:

  - **%s** → marcador de texto (substituído por `nome`)
  - **%d** → marcador de número inteiro (substituído por `idade`)
  - **%.2f** → marcador de número decimal com duas casas decimais (substituído por `renda`)
  - **%n** → quebra de linha (funciona tanto no Windows quanto no Linux)

Saída esperada no terminal:
-------------------------------------------
Maria tem 31 anos e ganha R$ 4000.00 reais
-------------------------------------------

Resumo dos principais marcadores para o printf:
  - `%s` → texto (String)
  - `%d` → número inteiro (int)
  - `%.2f` → número decimal com 2 casas decimais (float/double)
  - `%n` → quebra de linha (melhor que \n por ser compatível com qualquer sistema)

Dica:
A ordem das variáveis depois da vírgula deve seguir exatamente a ordem dos marcadores no texto.

Isso é muito útil para mostrar resultados de sistemas como:
  - Cadastro de pessoas
  - Tabelas de valores
  - Relatórios financeiros
  - Mensagens personalizadas ao usuário

*/
// e o comando em teste ficara da seguinte forma
String nome = "Maria";
int idade = 31;
double renda = 4000.0;
System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}
