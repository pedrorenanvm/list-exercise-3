package exercicio03;
import java.util.Scanner;


public class Questao25 {
	public class ValidacaoHorario {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Digite as horas: ");
			int horas = scanner.nextInt();
			System.out.print("Digite os minutos: ");
			int minutos = scanner.nextInt();
			System.out.print("Digite os segundos: ");
			int segundos = scanner.nextInt();

			if (horarioValido(horas, minutos, segundos)) {
				System.out.println("O horário é válido.");
			} else {
				System.out.println("O horário é inválido.");
			}
			scanner.close();
		}

		public static boolean horarioValido(int horas, int minutos, int segundos) {

			if (horas < 0 || horas > 23) {
				return false;
			}

			if (minutos < 0 || minutos > 59) {
				return false;
			}

			if (segundos < 0 || segundos > 59) {
				return false;
			}

			return true;
		}
	}

}
