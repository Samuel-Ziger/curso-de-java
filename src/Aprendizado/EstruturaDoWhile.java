package Aprendizado;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        /*
         Estrutura do faça-enquanto
         Sintaxe/Regra:
         do{
         com1
         com2
         }while(condição);
         Regra:
         V : volta
         F : pula fora



         Problema de exemplo:
         Fazer um programa pra ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
         Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "S", repetir o programa.
         Formula:
         F = 9c + 32
             5

        Exemplo:
        Digite a temperatura em Celsisus: 30.0
        Equivalente em Fahrenheit: 86.0
        Deseja reptir (s/n) ? S

        Digite a temperatura em celsius: 21.0
        Equivalente em Fahrenheit: 69.8
        Deseja reptir (s/n) ? S

        digite a temperatura em Celsius: -10.5
        Equivalente me Fahreneit: 13.1
        Deseja reptir (s/n) ? N

        Resolução:
         */
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = 9.0 * C / 5.0 +32.0;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
        System.out.print("Deseja reptir (s/n) ?");
        char  resp = sc.next().charAt(0);
        
        while (resp != 'n') {
            System.out.print("Digite a temperatura em Celsius: ");
            C = sc.nextDouble();
            F = 9.0 * C / 5.0 +32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja reptir (s/n) ?");
            resp = sc.next().charAt(0);
            sc.close();
            forma funcional mas pior de se fazer
            agora  a forma melhor de se fazer:
            */

            /* 
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
    
            char  resp = 's'; 
            while (resp != 'n') {
                System.out.print("Digite a temperatura em Celsius: ");
                double C = sc.nextDouble();
                double F = 9.0 * C / 5.0 +32.0;
                System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
                System.out.print("Deseja reptir (s/n) ?");
                resp = sc.next().charAt(0);
            }

            
        sc.close();
        agora esta funcionado de forma mais agradavel mas ainda sim tem a forma melhor que seria a forma DO
        da estrutura faça-enquanto que seria a seguinte:
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
        
        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 +32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja reptir (s/n) ?");
            resp = sc.next().charAt(0);
        }while (resp != 'n');
            
        

        
    sc.close();
    // dessa forma esta funcionando perfeitamente.
    }
}

