package application; // Pacote onde a classe está organizada

import java.util.Locale;  // Import para configurar localização (ponto decimal, etc.)
import java.util.Scanner; // Import para ler dados de entrada do usuário

public class Program {
	public static void main (String[] args) {
		// Configura para usar ponto (.) em vez de vírgula (,) como separador decimal
		Locale.setDefault(Locale.US);

		// Cria objeto Scanner para leitura de dados do teclado
		Scanner sc = new Scanner(System.in);

		// Declaração das variáveis dos lados dos triângulos X e Y
		double xA, xB, xC, yA, yB, yC;

		// Leitura dos lados do triângulo X
		System.out.println("Enter the measures of triangle x:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		// Leitura dos lados do triângulo Y
		System.out.println("Enter the measures of triangle Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		// Cálculo do semiperímetro de X
		double p = (xA + xB + xC) / 2.0;
		// Cálculo da área de X usando a fórmula de Heron
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		// Reutilização da variável p para calcular o semiperímetro de Y
		p = (yA + yB + yC) / 2.0;
		// Cálculo da área de Y usando a fórmula de Heron
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		// Impressão das áreas calculadas com 4 casas decimais
		System.out.printf(" Triangle X area: %.4f%n", areaX);
		System.out.printf(" Triangle Y area: %.4f%n", areaY);

		// Estrutura condicional para comparar as áreas
		if (areaX > areaY) {
			System.out.println("Larger area: X"); // Caso X seja maior
		}
		else {
			System.out.println("Larger area: Y"); // Caso Y seja maior
		}

		// Fecha o Scanner (boa prática)
		sc.close();
		
		
		
		//Esse código e uam mostra da resolução de um problema pra calcular a aréa do triângulo entra X e Y mostrando o maior
		//Sem usar Orientação a Objeto
	}
}
