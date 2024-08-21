package exercicio03;

import java.util.Scanner;

 //Transforme um número Racional (formado por numerador e denominador) para um número Real. Antes de dividir, verifique se o denominador é diferente de zero. Emita uma mensagem de alerta ao usuário se for zero.

public class Questao8 {
  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o numerador: ");
        int numerador = read.nextInt();
        
        System.out.print("Digite o denominador: ");
        int denominador = read.nextInt();
        
        if (denominador != 0) {
            double real = (double) numerador / denominador;
            System.out.printf("O número real e: %.2f%n", real);
        } else {
            System.out.println("Erro: denominador nao pode ser = a zero.");
        }
    }
}