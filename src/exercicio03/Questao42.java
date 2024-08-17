package exercicio03;

import java.util.Arrays;
import java.util.Random;

public class Questao42 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 40; i++) {
            int[] grupo = new int[3];

            for (int j = 0; j < 3; j++) {
                grupo[j] = random.nextInt(60);
            }

            Arrays.sort(grupo);

            System.out.println("Grupo " + (i + 1) + ": " + grupo[0] + ", " + grupo[1] + ", " + grupo[2]);
        }
    }
}

