package exercicio03;

import java.util.Scanner;

public class Questao55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variaveis de cda tipo de ligaçõa
        int minutosRestantesOutrasOperadoras = 100;
        int minutosRestantesVaiVai = 150;
        double totalValorAPagar = 0.0;
        //texto para escolher o tipo de ligação
        while (true) {
            System.out.print("Tipo de ligação ('o' = outras operadoras, 'v' = Vai-Vai, 'f' = telefone fixo, 'n' = não há mais ligações): ");
            char tipoLigacao = scanner.nextLine().toLowerCase().charAt(0);

            if (tipoLigacao == 'n') {
                break;
            }

            System.out.print("Quantidade de minutos: ");
            int minutos = scanner.nextInt();
            scanner.nextLine();
            double valorAPagar = 0.0;
            //casos do switch - varias condicionais para caa tipo de ligação
            switch (tipoLigacao) {
                case 'o':
                    if (minutos <= minutosRestantesOutrasOperadoras) {
                        minutosRestantesOutrasOperadoras -= minutos;
                    } else {
                        valorAPagar = (minutos - minutosRestantesOutrasOperadoras) * 0.65;
                        minutosRestantesOutrasOperadoras = 0;
                    }
                    break;
                case 'v':
                    if (minutos <= minutosRestantesVaiVai) {
                        minutosRestantesVaiVai -= minutos;
                    } else {
                        valorAPagar = (minutos - minutosRestantesVaiVai) * 0.20;
                        minutosRestantesVaiVai = 0;
                    }
                    break;
                case 'f':
                    int minutosConvertidos = minutos / 2;
                    if (minutosConvertidos <= minutosRestantesOutrasOperadoras) {
                        minutosRestantesOutrasOperadoras -= minutosConvertidos;
                    } else {
                        valorAPagar = (minutosConvertidos - minutosRestantesOutrasOperadoras) * 0.325;
                        minutosRestantesOutrasOperadoras = 0;
                    }
                    break;
                default:
                    System.out.println("Tipo de ligação inválido!");
                    continue;
            }
            totalValorAPagar += valorAPagar;

            System.out.println("Saldo Outras Operadoras: " + minutosRestantesOutrasOperadoras);
            System.out.println("Saldo  Vai-Vai: " + minutosRestantesVaiVai);
            System.out.println("Valor a pagar por esta ligação: R$ " + String.format("%.2f", valorAPagar));
        }

        System.out.println("Valor total a pagar no mês: R$ " + String.format("%.2f", totalValorAPagar));

        scanner.close();
    }
}
