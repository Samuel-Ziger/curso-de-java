package Aprendizado;

public class FuncoeosParaString {
    public static void main(String[] args) {
        //funnções interressantes para String:
        
        /*
        Checlist:
        -> Formtar: toLoweCase() -> TRansfomar pra Minusculor,toUpperCase() -> Trasfmormar pra Maisculo,trim() -> Remover Espaços. 
        -> Recortar: substring(inicio),substring(inicio,fim)
        -> Substituir: Replace(char,char),Replace(string,string)
        -> Buscar: indexOf,LastlindexOf -> buscar posição de alguma parte da string.
        -> str.Split("") -> serve pra recortar uma string com base no separdor colocado dentro ""
        */
        String original = "abcd FGHJ abc GFGD";
        String s01 = original.toLowerCase(); // fazendo a conversão de todos os caracteres para minusculo.
        String s02 = original.toUpperCase(); // fazendo a conversão de todos os caracteres para maiusculo.
        String s03 = original.trim(); // fazendo as String continuarem da mesma forma mas agora sem espaçoes inutéis.
        String s04 = original.substring(2); // Fazendo com que pegue do segundo caracter em diante e crie uma nova string. senod que no exemplo as letrsd abc vai ser assim : --> 0 = a, b = 1 e c =2 então o segunda caracter e o "c".
        System.out.println(s01);
        System.out.println("Original: - " + original + "-"); // aqui foi feita a concatenação usando o "+" pra juntar a String com o que vai está esciroto o "-" serve somente pra mostrar a onde a sring começa e onde termina.
        System.out.println("toLowerCase: - " + s01 + "-"  ); //  aqui foi feita a concatenação usando o "+" pra juntar a String com o que vai está escirotoo "-" serve somente pra mostrar a onde a sring começa e onde termina.
        System.out.println("toUpperCase: - " + s02 + "-"  ); //  aqui foi feita a concatenação usando o "+" pra juntar a String com o que vai está escirotoo "-" serve somente pra mostrar a onde a sring começa e onde termina.
        System.out.println("trim: - " + s03 + "-"  );// va i remover os espaços após a String.
        System.out.println("Substring(2): - " + s04 + "-"  ); // A após o segundo caracter sendo ele a letra "C" ele ira mostra o restante da String.
       
    }
}
