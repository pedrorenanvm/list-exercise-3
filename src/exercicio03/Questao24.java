package exercicio03;

import java.util.Scanner;

public class Questao24 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o dia: ");
		int dia = scanner.nextInt();
		System.out.print("Digite o mês: ");
		int mes = scanner.nextInt();
		System.out.print("Digite o ano: ");
		int ano = scanner.nextInt();

		if (dataValida(dia, mes, ano)) {
			System.out.println("A data é válida.");
		} else {
			System.out.println("A data é inválida.");
		}
		scanner.close();
	}

	public static boolean dataValida(int dia, int mes, int ano) {

		if (mes < 1 || mes > 12) {
			return false;
		}

		int diasNoMes;
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			diasNoMes = 30;
			break;
		case 2:
			if (anoBissexto(ano)) {
				diasNoMes = 29;
			} else {
				diasNoMes = 28;
			}
			break;
		default:
			diasNoMes = 31;
		}
		return dia >= 1 && dia <= diasNoMes;
	}

	public static boolean anoBissexto(int ano) {
		if (ano % 4 == 0) {
			if (ano % 100 == 0) {
				return ano % 400 == 0;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

}
