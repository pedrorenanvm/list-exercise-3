package exercicio03;

//bibliotecas...
import java.util.Scanner;
//Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
public class Questao4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        double soma = 0;
        int quantidadeNotas = 4;
        
        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite sua nota da " + i + "° unidade: ");
            soma += read.nextDouble();
        }
        
        double media = soma / quantidadeNotas;
        
        System.out.printf("A media aritmetica é: %.2f%n", media);
        
    }
}
