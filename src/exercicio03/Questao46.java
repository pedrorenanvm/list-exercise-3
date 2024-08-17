package exercicio03;

import java.util.Scanner;

public class Questao46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //contadores
        int homensMaiores = 0;
        int mulheresMaiores = 0;
        //verifica se a entrada esta certa
        System.out.println("Digite a lista de 200 pessoas no formato 'Homem, 46' ou 'Mulher, 15':");
        String entrada = scanner.nextLine();
        String[] pessoas = entrada.split(";");
        if (pessoas.length != 200) {
            System.out.println("Erro: Você deve inserir exatamente 200 entradas.");
            return;
        }

        // processas as entradas
        for (String pessoa : pessoas) {
            String[] partes = pessoa.split(",");
            String genero = partes[0].trim().toLowerCase(); //arruma formato
            int idade = Integer.parseInt(partes[1].trim());

            // verifica idades
            if (idade >= 18) {
                if (genero.equals("homem")) {
                    homensMaiores++;
                } else if (genero.equals("mulher")) {
                    mulheresMaiores++;
                }
            }
        }
        // retorna resulltado
        System.out.println("Quantidade de homens maiores de idade: " + homensMaiores);
        System.out.println("Quantidade de mulheres maiores de idade: " + mulheresMaiores);
    }
}
