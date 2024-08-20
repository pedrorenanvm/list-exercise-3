import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");

        System.out.print("Informe o valor inicial da dívida: ");
        double valorDivida = input.nextDouble();

        System.out.print("Informe a taxa de correção mensal (em %): ");
        double taxaCorrecao = input.nextDouble() / 100;

        System.out.print("Informe a quantidade de anos: ");
        int anos = input.nextInt();

        LocalDate data = LocalDate.of(2007, 1, 1);

        System.out.printf("%n%-6s", "Ano");
        for (int mes = 1; mes <= 12; mes++) {
            System.out.printf("%10s", data.withMonth(mes).format(formatter));
        }
        System.out.println();

        for (int ano = 0; ano < anos; ano++) {
            System.out.printf("%-6d", data.getYear() + ano);
            for (int mes = 1; mes <= 12; mes++) {
                System.out.printf("%10.2f", valorDivida);
                valorDivida += valorDivida * taxaCorrecao;
            }
            System.out.println();
        }
    }
}

