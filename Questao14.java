import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho", 
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        
        System.out.print("Digite o nome de um mês: ");
        String mes = scanner.nextLine().toLowerCase();

        int numeroMes = -1;

        for (int i = 0; i < meses.length; i++) {
            if (mes.equals(meses[i])) {
                numeroMes = i + 1;
                break;
            }
        }

        if (numeroMes != -1) {
            System.out.println("O número equivalente ao mês " + mes + " é: " + numeroMes);
        } else {
            System.out.println("Mês inválido.");
        }

        scanner.close();
    }
}

