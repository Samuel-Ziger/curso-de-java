package Aprendizado;

import java.util.Scanner;

public class FuncoesSintaxe {
    public static void main(String[] args) { // aqui e a função padrão feita pelo java
        /*
         * Funções:
         * -> Representam um processamento que possui um significado 
         *  Math.sqrt(double)
         *  System.out.println(string)
         * -> Principais vantagens: modularização, delegação e reaproveitamento
         * -> Dados de entrada e saída:
         *      Funções podem receber dados de entrada (parâmetros ou argumentos)
         *      Funções podem ou não retornr uma saída
         * -> Em orientação a objetos, funções em classe recebem o nome de "métodos"
         */
        //Vamos testar:
        double x = Math.sqrt(25.0);//sqrt chama  função da raiz quadrada.
        System.out.println(x);
        /*
         * ou tambem podemos fazer assim rodando como parâmetro.
         *  double y =25.0;
         *  double x = Math.sqrt(y);
         *  System.out.println(x);
         * 
         * 
         * Vamos para um problema exemplo:
         * 
         * Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
         * Exemplo:
         * Enter three numbers:
         * 5
         * 8
         * 3
         * Higher = 8
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbres: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a > b && a > c){
            System.out.println("Higer = " + a);

        }
        else if (b > c ){
            System.out.println("higer = " + b);
        }
        else{
            System.out.println("higer = " + c);
        }
        // Dessa forma ele vai buscar atráves de quem for o maior caso não seja ele vai pro proxímo e se ele achar ele vai mostrar na tela
        // Mas agora vamos mostrar uma função que faz a mesma coisa deixando meu código mais limpo e menor.

        System.out.println("Enter three numbres: ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        int higer = max(a, b, c); // esse max vai ser a onde vai ser criada a função que vai buscar o maior dos três números inteiro. sendo uma função personalizada.
        sowResult(higer); //vai aparecer o resultado.





        sc.close();





        
    }
    //Aqui agora vai ser criado uma função da max
    // O public e pra que a função fique disponivel em outras classes.
    // O static e pra que essa função possa ser chamda independe do objeto.
    // Após o static dentro o int quer dizer que eu stou chamando um número inteiro dentro da max a onde foi atribuida o local de entrada x,y e z (OBSERVAÇÃO ELE NÃO PRECISAR O MESMO NOME DA VARIÁVEL)
    public static  int max (int x, int y, int z ){ // Agora foi declarado uma função, agora dentro das "{}" vou colocar a lógica da minha função.
        int aux; // Pra facilicatr estou declarando uma varivale local aqui da função ela vai funcionar na escopo da função.
        if(x > y && x >z){
        aux =x;
    }
    else if (y > z){
        aux = y;
    }
    else {
        aux = z;
    }
    return aux;
    }
// Dentro da nova função a baixo a palavra "void" quer dizer vazio sendo usado pra uma função de ação.
    public static void  sowResult(int value) {
        System.out.println("higer =" + value);
    }

}
