package Aprendizado;

import java.util.Scanner;

public class EstruturaCondicionslCompodts {
    public static void main(String[] args) {
        /*
         Estrutura composta:
          Ela vai começar igual a simples, mas como a difierença de que ela segue com o bloco novo dentro da else.
          na simples a palavra e a if na composta mantem a if mas adiciona um bloco elese que a traduzido como "Se não"
          no caso se a condição for verdaderia excuta o bloco if.
          se não for verdadeira e excuta o bloco else.
         */

        //exemplo:

        /*
         E caso se eu tiver mais de duas possibilidades ?
          exemplo:
          Horas < 12 --> Bom dia 
          Horas < 18 --> Boa tarde
          Horas > 18 --> Boa noite
          pra Resolver isso eu posso fazer um Ecadeamento de estruturas condicionais
          Primeiro, usamos o 'if (condição 1)' para verificar se a primeira condição é verdadeira.
          Se for verdadeira, os comandos dentro desse bloco serão executados.
          Exemplo:
         i f (condição1) {
        // comando 1
          // comando 2
         }
 
         Caso a condição1 seja falsa, o programa entra no bloco 'else'.
         Dentro desse 'else', temos outra estrutura condicional:
         if (condição2) {
         // comando 3
         // comando 4
        } else {
        // comando 5
        // comando 6
      }
 
 Isso permite que o programa avalie uma segunda condição caso a primeira falhe.
  E se ambas forem falsas, ainda há um bloco final (o segundo 'else') como última alternativa.
 
  Essa técnica é muito útil para tratar múltiplas decisões em sequência.
  
  IMPORTANTE: Mantenha a indentação correta!
  Ela ajuda a visualizar facilmente quais comandos pertencem a cada bloco,
  o que é essencial em estruturas aninhadas como essa.
 */
// agora vamos resolver o problema:
Scanner sc1 = new Scanner(System.in);
int hora1;
System.out.println("Quantas horas ?");// Aqui o sistema vai perguntar ao usúraio qauntas horas são.
hora1 = sc1.nextInt();

if (hora1 < 12){ // Aqui está declarado o valor que sera nmenor (<) que 12
    System.out.println("Bom dia");//Se e o usúario falar que e menor que 12 horas ele vai apaerecer "Bom dia" 
}
else{
    if(hora1 < 18){
        System.out.println("Boa tarde");// no caso pra vi ao else a gente já sabe que ele e maior que 12 e menor que 18
    }
    else{
System.out.println("Boa noite");//Então sabendo que o outro e menor que 18 so restou ser maior que 18
    }
}
sc1.close();

/*
 Macede de identação:
 Scanner sc1 = new Scanner(System.in);
int hora1;
System.out.println("Quantas horas ?");
hora1 = sc1.nextInt();

if (hora1 < 12){ --> dessa forma da pra encadeade inumero if e else se a necessidade de abrir e fechar chaves porque será tudo um bloco só.
    System.out.println("Bom dia");
else f(hora1 < 18){
    system.out.println("Boa tarde");
}
else{
    System.out.println("Boa noite");
}

sc1.close();
 */
    }
}
