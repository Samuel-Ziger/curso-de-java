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
        System.out.println(s01);
    }
}
