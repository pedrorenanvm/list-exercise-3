package exercicio03;

import java.util.Random;

public class Questao34 {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("\n50 números sorteados de 1 a 100:\n");

        for (int i = 0; i < 50; i++) {
            int numberSorted = random.nextInt(100) + 1;
            System.out.println(numberSorted);
        }
    }
}

