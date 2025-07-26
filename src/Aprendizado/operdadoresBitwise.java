package Aprendizado;

import java.util.Scanner;

public class operdadoresBitwise {
    public static void main(String[] args) {
        /*
         São operadores bit a bit que vão rodar bit pot bit
         Tabela:
         poerador          siginificado
            &              Operação "E" bit a bit
            |              Operação "OU" bit a bit
            ^             Operação "OU-exclusivo" bia a bit
            
            
            c1 c2 c1 e c2
             F  F    F
             F  V    F
             V  F    F
             V  V    V

            c1 c2 c1 ou c2
            F   F    F
            F   V    V
            V   F    V
            V   V    V

            c1 c2 c1 XOR c2
             F  F     F
             F  V     V
             V  F     V
             V  V     F

             DEMO                --> &: 0001 1000 (24)
             (89) 0101 1001 -->  --> |: 0111 1101 (125)
             (60) 0011 1100 -->  --> ^: 0110 0101 (101)
             no primeiro vai dar falso porque um e final 1 o outro e final 0 por isso o primeiro bit ) no &
             agora em seguita e 0 e 0 dando falso tambem, apos isso da 0 e 1 dadno novamente falso isso no numero (89)
             apois isso da 1 e1 dando verdadeiro.
            
             Agora em código fica mais fácil de entender.             
         */
                int n1 = 89;
                int n2 = 60;
                System.out.println(n1 & n2);
                System.out.println(n1 | n2);
                System.out.println(n1 ^ n2);
                
// aqui isso e usado em programação de baixo bit como usado em arduino ou em placa de rede por exemplo pra vericar o bit um exeplo a seguir eu quero que na minha placa eu teste direntamente o 6 bit ficara assim::
Scanner sc = new Scanner(System.in);
 int mask = 0b00100000;
 int  n =  sc.nextInt();
 if ( (n & mask) != 0){
    System.out.println("6th bit is true");
 }
 else{
    System.out.println("6th bit is false");
 }

// pra teste tenta com 89 que vai dar falso e o 113 vai dar verdadeiro porque o 6 bit e 0


sc.close();











    }
}
