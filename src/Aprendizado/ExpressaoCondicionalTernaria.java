package Aprendizado;

public class ExpressaoCondicionalTernaria {
    public static void main(String[] args) {
        //Expressão Condicional ternária
        /*
         Estrutura opcional ao if-elese quando se deseja decidir um VALOR com base em uma condição.
         Sintaxe.
         (Condição) ? valor_se_verdadeiro : valaor_se_falso

         Exemplo:
         (2 > 4 ) ?  50:80 --> 80
         
         (10 != 3) ? "Maria" : "ALex" --> "Maria"
         */
/*
 Demostração:
double preco = 34.5;
double desconto;
if (preco < 20.0) {
    desconto = preco * 0.1;
} else {
    desconto = preco * 0.05;
}
*/
//agoara esse mesmo código de forma ternária:
double preco = 34.5;
double desconto = preco < 20.0 ? preco * 0.1 : preco * 0.05;
System.out.println(desconto);
}
}
