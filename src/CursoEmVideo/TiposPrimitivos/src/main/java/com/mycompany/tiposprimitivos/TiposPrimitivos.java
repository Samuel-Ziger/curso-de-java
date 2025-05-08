/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author ziger
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner teclado = new Scanner(System.in);
        String nome = "ziger";
        float nota = 8.5f; // com o F no final ele não vai entender que é um ponto flutuante.
        System.out.println("A nota é " + nota);
        System.out.printf("a nota é %.2f \n ", nota); // o \n serve pra quebrar linha e no %.2F eu posso trocar o 2 por qualquer numero que ele vai alterar a casa decimal.
        System.out.printf("a nota de %s %.4f \n ",nome, nota); // %s e a String e como eu quero que a String venha primeiro então eu coloquei ela  primeiro usando o ,nome ,nota.
        // Mas em vez disso eu posso usar o :
        System.out.format("Sua nota %s é %.2f \n",nome, nota);
        // a cima foi a saida de dados agora abaixo sera a entrada de dados.
        
        System.out.print("Digite o nome do aluno: ");
        String entada = teclado.nextLine();
        System.out.print("digite a nota do aluno: ");
        Float nota2 = teclado.nextFloat();
        System.out.format("a nota de %s e %.1f", teclado ,nota2);
    }
}
