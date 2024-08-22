import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho", 
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Digite o número do dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o número do mês: ");
        int mes = scanner.nextInt();

        boolean dataValida = false;

        // Verifica se o mês está dentro do intervalo válido
        if (mes >= 1 && mes <= 12) {
            // Verifica se o dia está dentro do intervalo válido para o mês
            if (dia >= 1 && dia <= diasMes[mes - 1]) {
                dataValida = true;
            }
        }

        if (dataValida) {
            // Identifica o trimestre
            int trimestre = (mes - 1) / 3 + 1;

            System.out.println("A data está OK.");
            System.out.println("O mês é: " + meses[mes - 1]);
            System.out.println("A pessoa nasceu no " + trimestre + "º trimestre.");
        } else {
            System.out.println("Data inválida.");
        }

        scanner.close();
    }
}
