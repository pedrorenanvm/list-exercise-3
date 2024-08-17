package exercicio03;

import java.util.Scanner;

public class Questao53 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pede o numero ao usuario
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        // faz o calculo da tabuada com o numero fornecido
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
