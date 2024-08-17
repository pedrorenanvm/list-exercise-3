package exercicio03;

import java.util.Scanner;

public class Questao43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double somaValores = 0;

        System.out.println("Informe 500 valores:");

        for (int i = 1; i <= 500; i++) {
            System.out.print("Valor " + i + ": ");
            double valor = scan.nextDouble();
            somaValores += valor;
        }

        double media = somaValores / 500;

        System.out.println("A média aritmética dos 500 valores é: " + media);

        scan.close();
    }
}

