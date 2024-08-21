package exercicio03;

import java.util.Scanner;

//Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu salário liquido. Receba o valor do salário bruto, o valor dos descontos e o valor do possível empréstimo de um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.

public class Questao10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o valor do salário bruto: ");
        double salarioBruto = read.nextDouble();

        System.out.print("Digite o valor dos descontos: ");
        double descontos = read.nextDouble();

        System.out.print("Digite o valor do empréstimo pretendido: ");
        double valorEmprestimo = read.nextDouble();

        double salarioLiquido = salarioBruto - descontos;
        double valorMaximoEmprestimo = salarioLiquido * 0.30;

        if (valorEmprestimo <= valorMaximoEmprestimo) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Empréstimo não aprovado.");
        }
    }
}
