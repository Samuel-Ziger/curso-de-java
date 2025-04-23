package Aprendizado;

import java.util.Scanner;

public class EstruturaRepetitivaFor {
    public static void main(String[] args) {
        /*
         Estrutura repetitiva "Para"
         É uma estrutura de controle que repete um bloco de comandos par um certo intervalo de valores.
         Quando usar: quando se sabe previamente a quantidade de repetições , ou o intervalo de valores.
         Por Exemplo:
         fazer um programa que lê um valor inteiro N e depois N números lidos.


         Entrada     Saida
            3          11
            5
            2
            4


            Sintaxe/Regra
            
            For(início;condição;incremento ){ 
            Com1
            Com2
        }
           inicio --> executa somente na primeira vez.
           Condição --> V: Executa e volta
                        F: Pula fora
            incremento --> Executa toda vez depois de volta
            com1/com2 --> bloco de comando que quer ser reptido.
            Teste Real:

         */
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int soma = 0;
for ( int i=0; i<N; i++){
    int x = sc.nextInt();
    soma = soma + x;
}
System.out.println(soma);
sc.close();
/*
 Perceba que essa estrutura "para" e otima pra fazer uam repetição baseada em uma contag
 */
    }
}
