package exercicio03;

import java.util.Scanner;

import static java.lang.Math.round;

public class Questao48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // quantidade de notas
        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();
        double somaNotas = 0;
        // inserir cada nota
        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }
        // Calcula a média
        double media = somaNotas / quantidadeNotas;

        // quantidade de aulas e faltas
        System.out.print("Digite o número total de aulas: ");
        int totalAulas = scanner.nextInt();
        System.out.print("Digite o número de faltas: ");
        int faltas = scanner.nextInt();
        double presenca = ((double)(totalAulas - faltas) / totalAulas) * 100;

        // resultado final
        if (presenca < 75) {
            System.out.println("Reprovado por faltas com " + round(presenca) + " % de presença");
        } else if (media >= 7.0) {
            System.out.println("Aprovado com média " + media);
        } else {
            System.out.println("Reprovado por nota com média " + media);
        }
    }
}
