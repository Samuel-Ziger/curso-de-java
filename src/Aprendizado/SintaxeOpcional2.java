package Aprendizado;

import java.util.Scanner;

public class SintaxeOpcional2 {
    public static void main(String[] args) {
        //Sintaxe opcional - switch-case 
        /*
         Quando se tem várias opções de de fluxo s seraem tratadas com base no vlaor de uma variável, ao invés de cárias estruturas if-else encadeadas,
         alguns preferem utilizar a estrutura switch-case.
         Exemplo:
         
         Fazer um programa para ler uma valor interiro de 1 a 7 resprestando um
         dia da semana (Sendo 1 = domingo, 2 = segunda, e assim pro diante).
         
         Entrada        Sáida
            1           Dia da semana:Domingo

            4           Dia da smenana:quarta


            9          Dia da semana: valor inválido

            Na pratica:
(OBS: No material de apoio tem um exemplo usando o if-else várias vezes)

         */
    Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();

        /*
         Nesse caso ele roda como expressaõ sendo nesse caso x 
         lembrando que obrigatorio terminar com break;
         e caso todas as expressões sejam erradas deve terminar com default: --> não está errado o final e com 2 pontos
         */
    }
}
