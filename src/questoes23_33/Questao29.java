package questoes23_33;
import java.util.Scanner;

public class Questao29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite as coordenadas do vértice superior esquerdo:");
		System.out.print("X1: ");
		int x1 = scanner.nextInt();
		System.out.print("Y1: ");
		int y1 = scanner.nextInt();

		System.out.println("Digite as coordenadas do vértice inferior direito:");
		System.out.print("X2: ");
		int x2 = scanner.nextInt();
		System.out.print("Y2: ");
		int y2 = scanner.nextInt();

		if (x1 == x2 && y1 == y2) {
			System.out.println("Os pontos formam um ponto.");
		} else if (x1 == x2) {
			System.out.println("Os pontos formam uma reta vertical.");
		} else if (y1 == y2) {
			System.out.println("Os pontos formam uma reta horizontal.");
		} else {
			System.out.println("Os pontos formam um retângulo.");

			int largura = Math.abs(x2 - x1);
			int altura = Math.abs(y2 - y1);
			int area = largura * altura;
			System.out.println("A área do retângulo é: " + area);
		}

		System.out.println("Digite as coordenadas do ponto a ser verificado:");
		System.out.print("X: ");
		int x = scanner.nextInt();
		System.out.print("Y: ");
		int y = scanner.nextInt();

		if (x < x1 && y > y1) {
			System.out.println("O ponto está acima e à esquerda do retângulo.");
		} else if (x > x2 && y > y1) {
			System.out.println("O ponto está acima e à direita do retângulo.");
		} else if (x < x1 && y < y2) {
			System.out.println("O ponto está embaixo e à esquerda do retângulo.");
		} else if (x > x2 && y < y2) {
			System.out.println("O ponto está embaixo e à direita do retângulo.");
		} else if (y > y1) {
			System.out.println("O ponto está acima do retângulo.");
		} else if (y < y2) {
			System.out.println("O ponto está embaixo do retângulo.");
		} else if (x < x1) {
			System.out.println("O ponto está à esquerda do retângulo.");
		} else if (x > x2) {
			System.out.println("O ponto está à direita do retângulo.");
		} else if (x >= x1 && x <= x2 && y <= y1 && y >= y2) {
			System.out.println("O ponto está dentro do retângulo.");
		} else if (x == x1 || x == x2 || y == y1 || y == y2) {
			System.out.println("O ponto está na linha do retângulo.");
		}

		scanner.close();
	}
}
