package exercicio03;

import java.util.Random;
import java.util.Scanner;

public class Questao35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite a quantidade de números a serem sorteados: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o valor mínimo da faixa de sorteio: ");
        int minFaixa = scanner.nextInt();

        System.out.print("Digite o valor máximo da faixa de sorteio: ");
        int maxFaixa = scanner.nextInt();

        if (maxFaixa <= minFaixa) {
            System.out.println("O valor máximo deve ser maior que o valor mínimo.");
            return;
        }

        System.out.println("Números sorteados:");

        for (int i = 0; i < quantidade; i++) {
            int numeroSorteado = random.nextInt((maxFaixa - minFaixa) + 1) + minFaixa;
            System.out.println(numeroSorteado);
        }

        scanner.close();
    }
}

