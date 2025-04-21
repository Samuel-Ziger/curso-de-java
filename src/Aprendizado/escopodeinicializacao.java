package Aprendizado;

public class escopodeinicializacao {
    public static void main(String[] args) {
        /*
         Escopo de inicializão
         Checklist:
         Escopo de uma variável: é a região do progema onde a variável é válida,ou seja, onde ela pode ser referenciada.
         uma variável não pode ser usada se não for iniciada.
exemplo:
         */
//double price = 400.00;
//System.out.println(price);
// dessa forma, caso a variável não tenha recebido valor nenhum exeplo o 400.00 ela não pode ser inicializada.
// Exemplo se tiver double price; sem ela receber nenhum atribudo ele não e compilado.
double price = 400.00;
double discount = 0.0;
if (price < 200.00){
     discount = price *0.1;
}
System.out.println(discount);
//Dessa forma ele vai dar erro porque está em escopo diferente da variável.



}
}
