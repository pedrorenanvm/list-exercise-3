package exercicio03;

//bibliotecas...
import java.util.Scanner;

    //Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha. Para isto, peça o valor do seu salário e o valor do salário mínimo atual.

public class Questao2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o valor do seu salario: ");
        double salario = read.nextDouble();
        
        System.out.print("Digite o valor do salario minimo atual: ");
        double salarioMinimo = read.nextDouble();
        
        double quantidadeSalarios = salario / salarioMinimo;
        
        System.out.printf("Vc ganha %.2f salarios minimos.%n", quantidadeSalarios);
        
    }
}