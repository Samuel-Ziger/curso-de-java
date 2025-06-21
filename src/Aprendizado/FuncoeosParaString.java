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
        -> replace troca tudo que esta dentro '' pelo o que esta no segundo ''                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        */
        String original = "abcd FGHJ abc GFGD";
        String s01 = original.toLowerCase(); // fazendo a conversão de todos os caracteres para minusculo.
        String s02 = original.toUpperCase(); // fazendo a conversão de todos os caracteres para maiusculo.
        String s03 = original.trim(); // fazendo as String continuarem da mesma forma mas agora sem espaçoes inutéis.
        String s04 = original.substring(2); // Fazendo com que pegue do segundo caracter em diante e crie uma nova string. senod que no exemplo as letrsd abc vai ser assim : --> 0 = a, b = 1 e c =2 então o segunda caracter e o "c".
        String s05 = original.substring(2, 9); //Fazendo a string corta entre os caracte
        String s06 = original.replace('a', 'x'); // Aqui estou pedindo pra sempre que encontrar um "a" que ele seja trocado pelo "x".
        String s07 = original.replace("abc", "xy"); // o Replace tambem serve para subString
        int i = original.indexOf("bc"); // vai mostrar qual e a primeira posição do subString "bc" na String original no caso atual sendo na posiçaõ 1 por veja "abcd" mas o a  e = a 0 então coemaça o 1 a partir do "b"
        int j = original.lastIndexOf("bc"); // aqui já o oposto aqui queremos saber qual e a última ocorrencia. 



        
        System.out.println(s01);
        System.out.println("Original: - " + original + "-"); // aqui foi feita a concatenação usando o "+" pra juntar a String com o que vai está esciroto o "-" serve somente pra mostrar a onde a sring começa e onde termina.
        System.out.println("toLowerCase: - " + s01 + "-"  ); //  aqui foi feita a concatenação usando o "+" pra juntar a String com o que vai está escirotoo "-" serve somente pra mostrar a onde a sring começa e onde termina.
        System.out.println("toUpperCase: - " + s02 + "-"  ); //  aqui foi feita a concatenação usando o "+" pra juntar a String com o que vai está escirotoo "-" serve somente pra mostrar a onde a sring começa e onde termina.
        System.out.println("trim: - " + s03 + "-"  );        // vai remover os espaços após a String.
        System.out.println("Substring(2): - " + s04 + "-"  ); // A após o segundo caracter sendo ele a letra "C" ele ira mostra o restante da String.
        System.out.println("Substring(2): - " + s05 + "-"  ); // Aqui vai acontecer que ele sera feito o recorte
        System.out.println("replace ('a', 'x')" + s06 + "-"); // Aqui vai mostrar na tela a troca do "a" pelo "x" mas isso serve pra qualquer forma.
        System.out.println( "replace ( 'abc', 'xy')" + s07 + "-" ); // Aqui as subString sera trocada sempre de "abc" pra "xy" mas isso serve pra qualquer forma.
        System.out.println("index of 'bc': " + i); // Aqui ele vai acusar o número da inde se inicia a nossa ocorrencia
        System.out.println("Last index of 'bc':" + j ); // e Aqui o final dela sendo que as duas ocorrencia se chamam "bc" mas estão em strings diferentes

        /*
         * Operção Split --> ela serve pra separar a string nos espaços que você definir.
         * String s = "potato apple lemon";
         * String[] vect = s.split(""); --> o espaço em branco dentro das aspas
         * String word1 = vect[0];
         * String word2 = vect[1];
         * String word3 = vect[2];
         * dessa froma ele vai realizar o corte e vai guardar as partes separadas em vetores nesse caso chamada de vect.
         * 
         */
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        System.out.println( vect [0]);
        System.out.println( vect [1]);
        System.out.println( vect [2]);
        // aqui ele vai mandar eles separados pelos espaço em branco




    }
}
