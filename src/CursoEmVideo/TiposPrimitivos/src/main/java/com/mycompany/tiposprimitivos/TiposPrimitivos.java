// Declaração do pacote onde a classe está localizada.
// O diretório do arquivo .java deve refletir esse caminho.
package com.mycompany.tiposprimitivos;

// Importa a classe Scanner do pacote java.util para permitir a leitura de dados do teclado.
import java.util.Scanner;

// Comentário de documentação Javadoc.
/**
 * Classe de exemplo que demonstra o uso de tipos primitivos, entrada e saída de dados em Java.
 * @author ziger
 * @version 1.0
 * @since 2025-11-07
 */
public class TiposPrimitivos {

    // Método principal: ponto de entrada da aplicação Java.
    public static void main(String[] args) {

        // Imprime mensagem simples no console como teste de execução.
        System.out.println("Hello World!");

        // Cria um objeto Scanner para ler dados do teclado.
        Scanner teclado = new Scanner(System.in);

        // Declara uma variável do tipo String com valor fixo.
        String nome = "ziger";

        // Declara uma variável do tipo float com um valor decimal.
        // É necessário colocar o 'f' no final para indicar que é float (e não double).
        float nota = 8.5f;

        // Exibe a nota com concatenação simples.
        System.out.println("A nota é " + nota);

        // Exibe a nota formatada com duas casas decimais.
        // %.2f -> formata com duas casas decimais.
        // \n -> quebra de linha.
        System.out.printf("A nota é %.2f\n", nota);

        // Exibe a nota com o nome usando formatação:
        // %s -> String (nome), %.4f -> float com 4 casas decimais.
        System.out.printf("A nota de %s é %.4f\n", nome, nota);

        // Outro formato de saída com 'format' (equivalente ao printf).
        System.out.format("Sua nota %s é %.2f\n", nome, nota);

        // ======= Entrada de dados =======

        // Solicita que o usuário digite o nome.
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = teclado.nextLine();  // Lê a linha inteira digitada.

        // Solicita que o usuário digite a nota.
        System.out.print("Digite a nota do aluno: ");
        float notaAluno = teclado.nextFloat();  // Lê o número decimal (ponto flutuante).

        // Exibe os dados digitados com formatação.
        // Aqui corrigimos o erro anterior: não se pode imprimir o objeto Scanner (teclado).
        System.out.format("A nota de %s é %.1f\n", nomeAluno, notaAluno);

        // Fecha o Scanner (boa prática para evitar vazamentos de recurso).
        teclado.close();
    }
}
