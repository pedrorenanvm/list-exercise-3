import java.util.Scanner;

public class Questao15 {
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
            for (int i = 1; i <= 12; i++) {
                if (i == mes && dia >= 1 && dia <= diasMes[i - 1]) {
                    dataValida = true;
                    break;
                }
            }
        }

        if (dataValida) {
            System.out.println("A data está OK.");
            System.out.println("O mês é: " + meses[mes - 1]);
        } else {
            System.out.println("Data inválida.");
        }

        scanner.close();
    }
}
