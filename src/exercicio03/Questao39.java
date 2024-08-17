package exercicio03;

import java.util.Scanner;

public class Questao39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número para verificar se é ele perfeito: ");
        int numero = scan.nextInt();
        int somaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == numero) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        scan.close();
    }
}


