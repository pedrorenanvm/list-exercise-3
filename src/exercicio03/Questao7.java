package exercicio03;

//bibliotecas...
import java.util.Scanner;

//Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da despesa de um cliente.


public class Questao7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o valor da conta: ");
        double despesa = read.nextDouble();
        
        double comissao = despesa * 0.10;
        
        System.out.printf("A comissão do garçom e de: R$ %.2f%n", comissao);
    }
}