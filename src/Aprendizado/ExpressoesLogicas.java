package Aprendizado;

public class ExpressoesLogicas {
public static void main(String[] args) {
/*Expressões Lógicas
* Expressão --> Resultado --> Valor Verdade
*
*Operadores Lógicos:
em Java, c, c++ e C#.
Operador  Significado


&&            E
||            OU
!             NÃO

Ideia por trás do Operador "E"
Você  pode obter uma habilitação de motorista se:
*For aprovado no exame psicotécnico,
E
*For aprovado no exame de legislação,
E
*For aprovado no exame de direção.

Exemplos de Expressões Lógicas
(Suponha X igual a 5)
X <= 20 && x == 10
Pra avaliar essa expressão eu tem que fazer separadamente  sendo que X <= 20 esta correto porque  X(5) e menor que 20
Mas X == 10 está errado porque X(5) não e igual á 10.
nesse caso a expressão lógica e falsa porque o operador "&&" exige que eles sejam iguais.

Exemplo2:
X > 0 && X != 3
Nesse caso separadamente está correto afrimar que  X(5) e maior que 0 porque é,
e e correto afirma que X(5) e difernte de 3.
Sendo assim o operador "&&" confrima que  são iguais porque os doos deu correto.

Exemplo3:
X <= 20 && X == 10 && x != 3
nesse caso Avaliando separadamente  X(5) e menor ou igual a 20 está correto.
X(5) não e igual a 10 então e falso.
e X(5) é sim diferente de 3.
sendo asssim o resultado final será falso, porque? por que um resultado dando falso todos darão.
por que o operador "&&" EXIGE que todas as exepressãos sejam verdadeiras.


"TABELA verdade do operador E
A B  A && B

F F     F
F V     F
V F     F
V V     V


Agora a ídeia por trás do operador "OU"

Você pode obter estacionar na vaga especial se:
*For idoso(a),
OU
*For uma pessoa com deficiência,
OU
*For uma gestante.
Nesse caso o oprador "OU" exige que pelo menos uma condição deve ser verdadeira!
vamos aos Exemplos:

Exemplo1:
(Suponha que X igual a 5)
X == 10 || X <= 20 Analisando separadamente X(5) não e igual a 10 então está errado.
e X(5) e menor ou igual a 20 sendo verdadeiro.
Nesse caso o Resultado e verdadeiro porque uma das opções tem que ser verdadeiras.

Exemplo2:
X > 0 || x != 3 Avaliando separademente X(5) e maior que 0 sendo então verdadeiro.
e X(5) e diferente de 3 também sendo verdadeiro.
sendo assim o resultado será verdadeiro  porque tem que ter pelo menos um resultado verdadeiro pro operador "||"

Exemplo3:
X <= 0 || X != 3 || X !=5
Analisando separademente X(5) está errado porque 5 não e menor e nem igual a 0.
Aqui já tempo que X(5) e diferente de 3 sendo verdadeiro.
e por último temos 5 sendo difentre de 5 que está errad.
O resultado final será verdadeiro porque o operador "||" exige que pelo menos 1 seja verdadeiro.


"TABELA verdade do operador OU"
A B   A || B
F F      F
F V      V
V F      V
V V      V

ídeia por trás do operador "NÃO"

Você tem direito a receber uma bolsa de estudos de você:
NÃO
*Possuir renda maior  que $3000,00
Exemplo1: No caso eu tenho o João que tem uma renda de $ 5000,00 sendo assim ele NÃO tem direito a bolsa.
        A gora tem o José que tem a renda de $ 2000,00 nesse caso ele pode ter direito a bolsa.
Sendo na verdade a ideia do operador "NÃO" e inverte a condição

Agora exemplos em progrmação:
(Suponha que X igual a 5)
!(X == 10) como e avaliado essa situação?
Ela e avaliadad da seguinte forma primeiro que X(5) não e igual a 10 então e Falso
mas no começo da expressão existe a presença do operador "!" então o resultado final será verdadeiro.

Exemplo2:
!(X >= 2) Analisnado separadamente X(5) é igual ou maior que 2 no caso e verdadeiro mas como tem o operador "!" = NÃO
o resultado final será  Falso graças ao operador !
!(X <= 20 && X == 10) analisando separadamente X(5) e menor ou igual a 20 estão correto.
E X == 10 estando falso porque 5 não e igual a 10.
Mas tem dois operadores nessa expressão sendo eles "!" e "&&"
Então será resolvido o que está dentro do () sendo o operador "&&" que a resposta  final dentro do() e falso  porque F com V e igual a F.
Mas com o  operador "!" no começo da expersão o resultado geral final será verdadeiro.

"TABELA  verdade do operador NÃO"

A !A
F  V
V  F
no caso se a condição e verdaeira com o operador NÃO ela será falso.
e  o caso se condição for falsa com o operador NÃO ela será verdadeira.
*/

}
}
