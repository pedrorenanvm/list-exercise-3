package exercicio03;

import java.util.Random;
import java.util.Scanner;

public class Questao41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(101);
        int tentativas = 0;
        int chute = 0;

        System.out.println("Tente adivinhar o número sorteado entre 1 e 100.");

        while (chute != numeroSorteado) {
            System.out.print("Informe seu palpite: ");
            chute = scan.nextInt();
            tentativas++;

            if (chute > numeroSorteado) {
                System.out.println("O número é menor.");
            } else if (chute < numeroSorteado) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("Parabéns! Você acertou. ;D");
                System.out.println("Você conseguiu em " + tentativas + " tentativas.");
            }
        }

        scan.close();
    }
}

