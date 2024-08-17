package exercicio03;

import java.util.Scanner;

public class Questao44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores que você deseja fornecer: ");
        int quantidadeValores = scan.nextInt();

        double somaValores = 0;

        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Informe o valor " + i + ": ");
            double valor = scan.nextDouble();
            somaValores += valor;
        }

        double media = somaValores / quantidadeValores;

        System.out.println("A média aritmética dos " + quantidadeValores + " valores é: " + media);

        scan.close();
    }
}

