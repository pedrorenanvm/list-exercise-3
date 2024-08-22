package exercicio03;

//bibliotecas...
import java.util.Scanner;

//Solicite a quantidade de homens e de mulheres de uma turma da faculdade. Em seguida calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.

public class Questao03 {

    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            
            System.out.print("Digite a quantidade de homens da sua turma: ");
            int homens = read.nextInt();
            
            System.out.print("Digite a quantidade de mulheres da sua turma: ");
            int mulheres = read.nextInt();
            
            int total = homens + mulheres;
            double percentualHomens = (double) homens / total * 100;
            double percentualMulheres = (double) mulheres / total * 100;
            
            System.out.printf("Percentual de homens: %.2f%%%n", percentualHomens);
            System.out.printf("Percentual de mulheres: %.2f%%%n", percentualMulheres);
            
        }
    }
