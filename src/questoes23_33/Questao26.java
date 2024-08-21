package questoes23_33;
import java.util.Scanner;


public class Questao26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro horário:");
		System.out.print("Horas: ");
		int horas1 = scanner.nextInt();
		System.out.print("Minutos: ");
		int minutos1 = scanner.nextInt();
		System.out.print("Segundos: ");
		int segundos1 = scanner.nextInt();

		System.out.println("Digite o segundo horário:");
		System.out.print("Horas: ");
		int horas2 = scanner.nextInt();
		System.out.print("Minutos: ");
		int minutos2 = scanner.nextInt();
		System.out.print("Segundos: ");
		int segundos2 = scanner.nextInt();

		int totalSegundos1 = transformarParaSegundos(horas1, minutos1, segundos1);
		int totalSegundos2 = transformarParaSegundos(horas2, minutos2, segundos2);

		int diferencaSegundos = Math.abs(totalSegundos1 - totalSegundos2);
		System.out.println("A diferença entre os dois horários é de " + diferencaSegundos + " segundos.");
		scanner.close();
	}

	public static int transformarParaSegundos(int horas, int minutos, int segundos) {
		return horas * 3600 + minutos * 60 + segundos;
	}

}
