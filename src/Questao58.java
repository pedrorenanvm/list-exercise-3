
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe a data (dd/MM/yyyy): ");
        String dataInicioStr = input.nextLine();
        LocalDate dataInicio = LocalDate.parse(dataInicioStr, formatter);

        System.out.println("Informe a quantidades de dias a se passarem ");
        int dias = input.nextInt();

        dataInicio = dataInicio.plusDays(dias);
        System.out.println(dataInicio.format(formatter));

    }
}
