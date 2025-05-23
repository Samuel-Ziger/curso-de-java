package Aprendizado;
import java.util.Scanner;

public class Entradadedadosem {
    
        public static void main (String[] args){
            //Entrada de Dados através de De dispositvos ou perifericos de entrada
            //SCANNER
            //Pra fazer a entrada de dados, nós vamos criar  um objeto do tipo "scanner" Da seguinte forma:
            Scanner sc = new Scanner(System.in); // sc e o nome da variável 
            // para que funcione tem que ser feita a importação igual está no topo da página    
            // Faça sc.close() quando  não precisar  mais do objeto  sc

            //Exemplos praticos


            //Para ler  uma palavra (Texto sem espaços) Suponha uma variável  do tipo String delcarada:
            String x;
            x = sc.next();
            System.out.println("Você digitou: " + x); //bizu pra digitar mais rápido e escreve sysout e depois ctrl + espaço no eclipse no vs code ele já aparece a opção 

            sc.close(); // estou fechado o objeto

            // Dessa forma pra saber se deu certo de o comando run da sua ide e escreva algo no campo
            // e de ENTER e devera aparecer a "Você digitou mais o que vc escrever "
            // lembrando que esse "Você digitou pode ser subsituido pelo o que você quiser"


            // Pra ler um número inteiro 
            //Suponha que uma variável do tipo  "int" e declarada:
            int x1;
            x1 = sc.nextInt();
            System.out.println("Qual e o seu número? " + x1);
            
            sc.close();
            // Recomendação pra fazer esse segundo teste deixe todos os outros metodos comentados, isso funcionar pra qualquer métdo que aparecer aqui teste um por vez.


            //Pra ler um número com ponto flutante 
            //Suponha que uam variável do tipo double seja declarada:
            double x2;
            x2 = sc.nextDouble();
            System.out.println( "Qual e o seu numero?" + x2);
            sc.close();

            //ATENÇÃo: para Considerar o separador  de decimais como ponto, ANTES  da declaração so Scanner, faça:
            //Locale.SetDefault(Locale.US);
            // Da forma que foi declarado o Println mesmo que coloque 4,5 ele ira nostrar 4.5.
            // pra mas existe a opção de trocar o ln por F que ficaria  assim:
            // System.out.printf("Qual e o seu número ? %.2f%n," + x2) que o resultado será de 4,50
            // E pra ele trocar o ","  por "." antres do scanner no começo da página deve ser adcionado o Locale.
            // E lembrar de importa o Locale no começo da página.

            // Para ler um caractere
            // Suponha que uma variável do tipo char e delcarada:

            char x3;
            x3 = sc.next().charAt(0);
            System.out.println("você digitou: "+ x3);
            sc.close();
            // o sc.next vai ler o que você digitar na forma de string e chartAt(0); que uma função chamada pra pega o primeiro caracter do seu string


            // Agora pra ele ler vários dados na mesma linha:
            String a;
            int b;
            double c;

            a = sc.next();
            b = sc.nextInt();
            c = sc.nextDouble();
            System.out.println("Dados digitados");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            
            /*texto 30 3,3
            Dados digitados
            texto
            30
            3.3
             auqi eu digitei o a, b & c tudo na mesma linah dando espaço e esse foi o resultado  */

             //Pra ler umn texto até a quebra de linha 
             Scanner sc1 = new Scanner(System.in);
             String s1,s2, s3;
             s1 = sc1.nextLine();
             s2 = sc1.nextLine();
             s3 = sc1.nextLine();

             System.out.println("Dados digitados:");
             System.out.println(s1);
             System.out.println(s2);
             System.out.println(s3);
             sc1.close();
            // o nextLine serve pra você chama um texto até a quebra de linha.
            //Observação; se usar apenas o next ele vai ler apenas a primeira palavra.


            // Quebra de linha pendente
            int x5 ;
            String a1, a2, a3;
            x5 = sc1.nextInt();
            a1 = sc1.nextLine();
            a2 = sc1.nextLine();
            a3 = sc1.nextLine();
            System.out.println("Dados digitados:");
            System.out.println(x5);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            sc1.close();
            /*Quando você usa um  comando de leitura diferente  do nextline()e dá  alguma quebra de linha, essa quebra de linha 
            fica "pendente" na entrada padrão.
            Se você então fizer um  nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().
            em outras palavras quando você colocar o número no int ele deixarar uma string vazia que será cosumida pelo proxímo 
            nextline() fazendo que quando chegar no a3 por exemplo ele acabe antes porque ficou uma string vazia.


            Solução:
            Faça o nextLine() Extra antes de fazer o Nextline de seu interesse.
            exemplo:
            int x5 ;
            String a1, a2, a3;
            x5 = sc1.nextInt();
            sc1.nextLine();------------> nextLine sozinho pra consumir a string vazia
            a1 = sc1.nextLine();
            a2 = sc1.nextLine();
            a3 = sc1.nextLine();
            System.out.println("Dados digitados:");
            System.out.println(x5);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            sc1.close();
             */

        }
    }
