package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao54 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entradas de valores
        System.out.print("Digite o valor inicial: ");
        double valorInicial = scanner.nextDouble();
        System.out.print("Digite o valor final: ");
        double valorFinal = scanner.nextDouble();
        System.out.print("Digite o valor de incremento: ");
        double incremento = scanner.nextDouble();
        System.out.print("Digite o valor de 1 dólar em Reais: ");
        double valorDolar = scanner.nextDouble();


        DecimalFormat formatoMoeda = new DecimalFormat("###,##0.00"); ///formato monetario
        System.out.println("\nTabela de Conversão de Reais para Dólares:");
        System.out.println("==========================================");

        // cria a tabela
        for (double reais = valorInicial; reais <= valorFinal; reais += incremento) {
            double dolares = reais / valorDolar;
            System.out.println("R$ " + formatoMoeda.format(reais) + " = $ " + formatoMoeda.format(dolares));
        }
    }
}
