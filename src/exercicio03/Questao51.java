package exercicio03;

import java.util.Scanner;

public class Questao51 {

    public static void exibirTribonacci(int n) {
        long primeiro = 1, segundo = 1, terceiro = 2;

        if (n >= 1) System.out.print(primeiro);
        if (n >= 2) System.out.print(", " + segundo);
        if (n >= 3) System.out.print(", " + terceiro);

        for (int i = 4; i <= n; i++) {
            long proximo = primeiro + segundo + terceiro;
            System.out.print(", " + proximo);

            // atualiza valores
            primeiro = segundo;
            segundo = terceiro;
            terceiro = proximo;
        }

        System.out.println();  //linha adicional
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor da posição que deseja encontrar: "); // pede ao usuario o valor de entrada
        int n = scanner.nextInt();

        //confirma que o valor é valido
        if (n <= 0) {
            System.out.println("O valor deve ser positivo");
        } else {
            System.out.println("Os " + n + " primeiros termos da sequência de Tribonacci são:");
            exibirTribonacci(n);
        }
    }


}
