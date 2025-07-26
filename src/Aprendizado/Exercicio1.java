package Aprendizado;

import java.util.Locale;

public class Exercicio1 {
    
    public static void main(String[] args){
        /*
EXERCÍCIO DE FIXAÇÃO - Impressão formatada com printf

Objetivo:
Praticar a declaração de variáveis em Java, o uso de diferentes tipos de dados 
(String, int, double, char) e aplicar a função printf para exibir os dados no console 
com formatação personalizada.

Instruções:
1. Crie um novo programa em Java e declare as seguintes variáveis com os valores abaixo:
   - Dois produtos (String): "Computer" e "Office desk"
   - Duas variáveis inteiras: idade (30) e código (5290)
   - Uma variável char representando o gênero: 'F'
   - Três variáveis double: 
        • price1 = 2100.0
        • price2 = 650.50
        • measure = 53.234567

2. Utilize comandos printf para exibir no console exatamente a seguinte saída (observe bem os formatos):
   - Lista de produtos e seus preços, com duas casas decimais
   - Registro da idade, código e gênero
   - A medida com 8 casas decimais
   - A mesma medida arredondada com 3 casas decimais
   - A medida novamente com ponto decimal (formato padrão dos EUA)

Dica:
Use os seguintes marcadores de formatação:
   • %s para texto
   • %d para inteiros
   • %c para caractere
   • %.nf para ponto flutuante com n casas decimais
   • %n para quebra de linha

Ao final, seu programa deverá imprimir exatamente o modelo de saída fornecido.
Boa prática!
*/



//Resposta a baixo :

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);

        System.out.printf("%nRecord: %d years old, code %d and gender: %c%n", age, code, gender);

        System.out.printf("%nMeasure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);


        //Explicação da resposta 

        // Declaração de duas variáveis do tipo String (texto)
        //String product1 = "Computer";     // Nome do primeiro produto
        //String product2 = "Office desk";  // Nome do segundo produto

        // Declaração de variáveis com tipos diferentes
        //int age = 30;            // idade de uma pessoa (número inteiro)
        //int code = 5290;         // um código qualquer (número inteiro)
        //char gender = 'F';       // gênero da pessoa (um caractere, no caso 'F' de feminino)

        // Declaração de variáveis do tipo double (números decimais)
        //double price1 = 2100.0;       // preço do primeiro produto
        //double price2 = 650.50;       // preço do segundo produto
        //double measure = 53.234567;   // uma medida qualquer com várias casas decimais

        // Impressão de textos no console usando System.out.println (escreve e pula linha)
        //System.out.println("Products:");

        // Impressão com formatação usando printf
        // %s = string, %.2f = número com 2 casas decimais, %n = quebra de linha
        //System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        //System.out.printf("%s, which price is $ %.2f%n", product2, price2);

        // Pula uma linha (usando %n)
        //System.out.printf("%n");

        // Exibe informações de uma pessoa formatadas: %d = número inteiro, %c = caractere
        //System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);

        // Pula mais uma linha
        //System.out.printf("%n");

        // Mostra a variável 'measure' com 8 casas decimais
        //System.out.printf("Measure with eight decimal places: %.8f%n", measure);

        // Mostra a mesma medida, mas agora com 3 casas decimais (arredondado)
        //System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        // Imprime no formato americano (o ponto já é padrão no Java, então é igual ao de cima)
        //System.out.printf("US decimal point: %.3f%n", measure);

    }

}
