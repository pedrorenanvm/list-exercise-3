package exercicio03;

import java.util.Scanner;

public class Questao30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os quatro vértices do primeiro retângulo (x y):");
		int[] ret1 = processarVertices(scanner);

		System.out.println("Digite os quatro vértices do segundo retângulo (x y):");
		int[] ret2 = processarVertices(scanner);

		if (intercepta(ret1, ret2)) {
			System.out.println("Os retângulos se interceptam.");
		} else {
			System.out.println("Os retângulos não se interceptam.");
		}

		scanner.close();
	}

	private static int[] processarVertices(Scanner scanner) {
		int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;

		for (int i = 0; i < 4; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if (x < minX)
				minX = x;
			if (x > maxX)
				maxX = x;
			if (y < minY)
				minY = y;
			if (y > maxY)
				maxY = y;
		}

		return new int[] { minX, maxX, minY, maxY };
	}

	private static boolean intercepta(int[] ret1, int[] ret2) {
		return !(ret1[1] < ret2[0] || ret2[1] < ret1[0] || ret1[3] < ret2[2] || ret2[3] < ret1[2]);
	}
}
