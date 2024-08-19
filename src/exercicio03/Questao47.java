package exercicio03;

import java.util.Scanner;

public class Questao47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variaveis/contadores
        int contadorPacientes = 0;
        int somaIdadesHomens = 0;
        int contadorHomens = 0;
        int contadorMulheresAlturaPeso = 0;
        int contadorIdade1825 = 0;
        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;
        String nomeMulherMaisBaixa = "";
        double alturaMulherMaisBaixa = Double.MAX_VALUE;

        //enquanto não for fim vai perguntando essa lista
        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            contadorPacientes++;
            //adiciona em homens e na soma das idades
            if (sexo == 'M') {
                somaIdadesHomens += idade;
                contadorHomens++;
            }
            //adiciona feminino e fez o calculo de altura
            if (sexo == 'F') {
                if (altura >= 1.60 && altura <= 1.70 && peso > 70) {
                    contadorMulheresAlturaPeso++;
                }
                //procura mulher mais baixa
                if (altura < alturaMulherMaisBaixa) {
                    alturaMulherMaisBaixa = altura;
                    nomeMulherMaisBaixa = nome;
                }
            }
            //adicionar se for enrte 18 e 25 anos
            if (idade >= 18 && idade <= 25) {
                contadorIdade1825++;
            }
            //procura mais velho
            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }
        }
        double mediaIdadeHomens = contadorHomens > 0 ? (double) somaIdadesHomens / contadorHomens : 0;
        //prints na tela do relatorio
        System.out.println("Relatório:");
        System.out.println("Quantidade de pacientes: " + contadorPacientes);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + contadorMulheresAlturaPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25 anos: " + contadorIdade1825);
        System.out.println("Nome do paciente mais velho: " + nomeMaisVelho);
        System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa);

        scanner.close();
    }
}
