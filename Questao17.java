import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho", 
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String signo = "";

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

            // Identifica o signo
            if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                signo = "Aquário";
            } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                signo = "Peixes";
            } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                signo = "Áries";
            } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                signo = "Touro";
            } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                signo = "Gêmeos";
            } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                signo = "Câncer";
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                signo = "Leão";
            } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                signo = "Virgem";
            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                signo = "Libra";
            } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                signo = "Escorpião";
            } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                signo = "Sagitário";
            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                signo = "Capricórnio";
            }

            System.out.println("A data está OK.");
            System.out.println("O mês é: " + meses[mes - 1]);
            System.out.println("A pessoa nasceu no " + trimestre + "º trimestre.");
            System.out.println("O signo é: " + signo);
        } else {
            System.out.println("Data inválida.");
        }

        scanner.close();
    }
}
