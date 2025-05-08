 // Define a classe chamada Greeter.
// Em Java, tudo começa com uma classe.
class Greeter {

    // Este método é chamado getGreeting.
    // Ele retorna (return) uma String com a mensagem "Hello, World!".
    // Esse método pode ser usado por outras classes ou pelo método main.
    String getGreeting() {
        return "Hello, World!";
    }

    // Este é o método main — o ponto de entrada de qualquer programa Java.
    // É o que roda quando você executa a classe.
    public static void main(String[] args) {
        // Aqui, estamos criando um objeto da classe Greeter.
        Greeter greeter = new Greeter();

        // Em seguida, chamamos o método getGreeting() e imprimimos a resposta no terminal.
        System.out.println(greeter.getGreeting());
    }
}
