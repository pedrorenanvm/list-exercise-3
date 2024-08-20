
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe a primeira data (dd/MM/yyyy): ");
        String dataInicioStr = input.nextLine();
        LocalDate dataInicio = LocalDate.parse(dataInicioStr, formatter);

        System.out.println("Informe a segunda data (dd/MM/yyyy): ");
        String dataFimStr = input.nextLine();
        LocalDate dataFim = LocalDate.parse(dataFimStr, formatter);

        System.out.println("Datas entre " + dataInicioStr + " e " + dataFimStr + ":");
        while (!dataInicio.isAfter(dataFim)) {
            System.out.println(dataInicio.format(formatter));
            dataInicio = dataInicio.plusDays(1);
        }
    }
}
