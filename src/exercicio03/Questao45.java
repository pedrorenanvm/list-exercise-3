package exercicio03;

import java.util.Scanner;

public class Questao45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite 100 números inteiros separados por espaços:"); // pede os numeros ao usuario
        String entrada = scanner.nextLine();
        String[] numerosString = entrada.split(" "); // poe na lista a partir dos espaços

        // verifica se tem  100 números
        if (numerosString.length != 100) {
            System.out.println("Erro: Você deve inserir exatamente 100 números.");
            return;
        }
        int maiorValor = Integer.MIN_VALUE;  //  iniciar a variavel com o menos valor possivel

        // faz a contagem
        for (String numeroStr : numerosString) {
            int numero = Integer.parseInt(numeroStr);
            // faz a verificação se o numero atual é maior do que o numero que estava armazenado
            if (numero > maiorValor) {
                maiorValor = numero; //troca
            }
        }
        System.out.println("O maior valor fornecido é: " + maiorValor); // vai exibir o valor guardado na varioavel com o maior valor
    }
}
