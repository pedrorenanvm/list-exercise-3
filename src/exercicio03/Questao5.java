package exercicio03;
//Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do débito, a quantidade de meses e os juros mensais. Use o calculo de juros simples.

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o valor inicial do debito: ");
        double valorInicial = read.nextDouble();
        
        System.out.print("Digite a quantidade de meses: ");
        int meses = read.nextInt();
        
        System.out.print("Digite a taxa de juros mensal (em %): ");
        double jurosMensais = read.nextDouble();
        
        double valorFinal = valorInicial * (1 + (jurosMensais / 100) * meses);
        
        System.out.printf("O valor final da dívida é: R$ %.2f%n", valorFinal);
        
    }
}