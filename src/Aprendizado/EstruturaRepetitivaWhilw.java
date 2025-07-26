package Aprendizado;

import java.util.Scanner;

public class EstruturaRepetitivaWhilw {
    public static void main(String[] args) {
        //Estrutura  repetitiva "enquanto" (while).
        /*
         É uma estrura de controle  que repete um bloco de comandos em enquanto uma condição for verdadeira.
         Quando usar : quando  não se sabe previamente a quantidade de repetições que será realizada.
         Exemplo:
         fazer um progama que lê números inteiros até que um zera seja lido. Ao final mostra a dos números lidos.
         Entrada     saída
            5          11
            2
            4
            0
         */
        //sinatxa/Regra
        //Regra:  V -->Executa e volta F --> Pula fora
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0; //e aqui ele vai fazer a soma antes de finalizar
        while (x != 0) {
            soma = soma+ x;
            x = sc.nextInt();
        }
        System.out.println(soma); // e aqui ele vai dar o valor da soma na variavel e vai aparceer na tela
        sc.close();
        /*
         nesse caso você vai colocar o númerios interios até colocoar o 0 ai ele para
         */
        }
    }

