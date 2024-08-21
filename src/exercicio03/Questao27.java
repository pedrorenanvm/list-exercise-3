package exercicio03;
import java.util.Scanner;


public class Questao27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = scanner.nextInt();
		System.out.print("Digite o segundo número: ");
		int num2 = scanner.nextInt();
		System.out.print("Digite o terceiro número: ");
		int num3 = scanner.nextInt();

		if (num1 == num2 && num2 == num3) {
			System.out.println("Todos os números são iguais.");
		} else {

			int maior = num1;
			if (num2 > maior) {
				maior = num2;
			}
			if (num3 > maior) {
				maior = num3;
			}
			System.out.println("O maior número é: " + maior);
		}
		scanner.close();
	}

}
