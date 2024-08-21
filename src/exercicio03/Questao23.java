package exercicio03;

import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nome da primeira pessoa: ");
		String nome1 = scanner.nextLine();
		System.out.print("Dia de nascimento da primeira pessoa: ");
		int dia1 = scanner.nextInt();
		System.out.print("Mês de nascimento da primeira pessoa: ");
		int mes1 = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Nome da segunda pessoa: ");
		String nome2 = scanner.nextLine();
		System.out.print("Dia de nascimento da segunda pessoa: ");
		int dia2 = scanner.nextInt();
		System.out.print("Mês de nascimento da segunda pessoa: ");
		int mes2 = scanner.nextInt();

		if (mes1 < mes2 || (mes1 == mes2 && dia1 < dia2)) {
			System.out.println(nome1 + " faz aniversário primeiro.");
		} else if (mes1 > mes2 || (mes1 == mes2 && dia2 < dia1)) {
			System.out.println(nome2 + " faz aniversário primeiro.");
		} else {
			System.out.println("Ambas as pessoas fazem aniversário no mesmo dia.");
		}
		scanner.close();
	}
}
