import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7.0) {
            // Aluno aprovado
        } else if (media >= 5.0) {
            // Aluno em recuperação
            double notaFinal = scanner.nextDouble();
            
            double novaMedia = (media + notaFinal) / 2;
            
            if (novaMedia >= 5.0) {
                // Aluno aprovado após prova final
            } else {
                // Aluno reprovado após prova final
            }
        } else {
            // Aluno reprovado
        }
        
        scanner.close();
    }
}

