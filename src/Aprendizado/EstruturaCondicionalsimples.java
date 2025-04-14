package Aprendizado;

public class EstruturaCondicionalsimples {
    public static void main(String[] args){
    /*
      Conceito:
      Estrutura condicional
      É uma estrutura de controle que permite definir que um certo bloco de comandos somente será
      executado dependendo de uma condição.
       
        Condição ---> Verdadeira ----> bloco 1
                 ---> Falsa      ----> bloco 2


                 Sintaxe da estrutura condicional

                 simples:
                 if(<condição>){
                    <comando1> --> bloco de comando 
                    <comando2>
                    }
*/
//Exemplo pratico:
int x = 5;

System.out.println("bom dia");

if (x > 0){
    System.out.println("boa noite"); // aqui ele analisou se o 0 realmente e amior que X no caso sendo verdadeiro ele vai aparecer na tela.
}
if (  x < 0) {
    System.out.println("boa tarde");// aqui a condição e falsa ele vai analisa e não vai mostrar na tela. porque tudo que você colocar no bloco de comando dentro dessa condição simples e ela analsiar sendo errada ela não executa o bloco.
}

        
}
}
