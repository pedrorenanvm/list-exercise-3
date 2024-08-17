package exercicio03;

import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas no grupo: ");
        int quantidadePessoas = scan.nextInt();

        int somaIdades = 0;
        int maiorIdade = -150;
        int menorIdade = 150;
        int qtdMaiorIdade = 0;

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Informe a idade da pessoa " + (i + 1) + ": ");
            int idade = scan.nextInt();

            somaIdades += idade;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (idade >= 18) {
                qtdMaiorIdade++;
            }
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maior de idade: " + qtdMaiorIdade);

        scan.close();
    }
}

