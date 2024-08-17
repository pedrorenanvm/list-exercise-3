package exercicio03;

import java.util.Scanner;

public class Questao36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = scanner.nextInt();

        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        System.out.println("Os números ímpares entre " + menor + " e " + maior + " são:");

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

