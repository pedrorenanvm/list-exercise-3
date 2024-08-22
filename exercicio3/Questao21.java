import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cargo = scanner.nextLine().toLowerCase();
        double salario = scanner.nextDouble();

        double percentual;

        if (cargo.equals("diretoria")) {
            percentual = 0.30;
        } else if (cargo.equals("gerência")) {
            percentual = 0.25;
        } else if (cargo.equals("operacional")) {
            percentual = 0.20;
        } else {
            System.out.println("Cargo inválido.");
            scanner.close();
            return;
        }

        double emprestimo = salario * percentual;
        System.out.println(emprestimo);

        scanner.close();
    }
}
