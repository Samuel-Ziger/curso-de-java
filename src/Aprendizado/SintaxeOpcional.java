package Aprendizado;

import java.util.Locale;
import java.util.Scanner;

public class SintaxeOpcional {
    public static void main(String[] args) {
        //Sintaxe opcional - operadores de atribuição cumulativa
        /*
         Exemplo:
         Uma operdadora de telefonia cobra R$50.00 por um plano básicp que 
         dá direito a 100 minutos de telefone. Cada minuto que exceder a franquia
         de 100 minutos custa R$2.00 fazer um programa pra ler a quantidade de minutos
         que um pessoa consumuiu, daí mostrar o valor a ser pago.
         


         Entrada:           Saída
         22                 Valor a ser pago: R$ 50.00 -- > A entrada está dentro dos minutos então o valor e = 50

         Entrada            Saída 
         103                Valor a ser pago: R$ 56.00 -->  A entrada e execede a quantidade de minutos sendo então = 50 + 2 (de cada minuto que passar)

        Certo e na pratica seria assim:
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            int minutos = sc.nextInt();

            double conta = 50.00;
            if ( minutos > 100){
                conta = conta + (minutos - 100) * 2.0;
                }
           System.out.printf("Valor da conta = R$ %.2f%n", conta);
        sc.close();

        /*
         Operadores de atribuiçlão cumulativa
         a += b;         a = a + b;
         a -= b;         a = a - b;
         a *= b;         a = a * b;
         a /= b;         a = a / b;
         a %= b;         a = a % b;
         A gente pode vê isso nessa parte do código:
         conta = conta + (minutos - 100) * 2.0;
         a onde ele recebe o conta 2 vezes a gente pode abreviar nesse caso usando esta taebela que ficaria assim:
         conta += (minutos - 100) * 2.0;
         dara o mesmo resultado 
         */
    }
}
