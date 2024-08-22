import java.util.Scanner;

public class Questao56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Eleições ===");
        System.out.println("Quais os nomes dos candidatos.");
        System.out.println("Candidato 1: ");
        String c1 = input.nextLine().toLowerCase().trim();
        System.out.println("Candidato 2: ");
        String c2 = input.nextLine().toLowerCase().trim();
        System.out.println("Candidato 3: ");
        String c3 = input.nextLine().toLowerCase().trim();

        int votosBranco = 0;
        int votosC1 = 0;
        int votosC2 = 0;
        int votosC3 = 0;
        int totalVotos = 0;
        double percC1 = 0;
        double percC2 = 0;
        double percC3 = 0;
        double percBranco;
        String ganhadorEleicao = null;
        while (true) {
            System.out.println("Escolha o seu voto!:");
            System.out.printf("Digite: [c1] = %s - [c2] = %s - [c3] = %s [b] - Voto em Branco - [s] - Para sair%n", c1, c2, c3);
            String voto = input.nextLine().toLowerCase().trim();

            switch (voto) {
                case "c1":
                    votosC1++;
                    break;
                case "c2":
                    votosC2++;
                    break;
                case "c3":
                    votosC3++;
                    break;
                case "b":
                    votosBranco++;
                    break;
                case "s":
                    System.out.println("Encerrando programa de votações...");
                    break;
                default:
                    System.out.println("valor inválido!");
                    continue;
            }
            if (voto.equals("s")) {
                break;
            }

            totalVotos = votosC1 + votosC2 + votosC3 + votosBranco;

            if (totalVotos > 0) {
                percC1 = (double) votosC1 / totalVotos * 100;
                percC2 = (double) votosC2 / totalVotos * 100;
                percC3 = (double) votosC3 / totalVotos * 100;
                percBranco = (double) votosBranco / totalVotos * 100;

                System.out.printf(" 1º Candidato %s: %d votos (%.2f%%)%n", c1, votosC1, percC1);
                System.out.printf(" 2º Candidato %s: %d votos (%.2f%%)%n", c2, votosC2, percC2);
                System.out.printf(" 3º Candidato %s: %d votos (%.2f%%)%n", c3, votosC3, percC3);
                System.out.printf(" Votos em branco: %d (%.2f%%)%n", votosBranco, percBranco);
            }
        }
        if (votosC1 > votosC2 && votosC1 > votosC3) {
            ganhadorEleicao = c1;
        } else if (votosC2 > votosC1 && votosC2 > votosC3) {
            ganhadorEleicao = c2;
        } else if (votosC3 > votosC1 && votosC3 > votosC2) {
            ganhadorEleicao = c3;
        } else if (votosC1 == votosC2 && votosC1 > votosC3) {
            ganhadorEleicao = "Empate entre " + c1 + " e " + c2 + " - Não tivemos um ganhador claro";
        } else if (votosC1 == votosC3 && votosC1 > votosC2) {
            ganhadorEleicao = "Empate entre " + c1 + " e " + c3 + " - Não tivemos um ganhador claro";
        } else if (votosC2 == votosC3 && votosC2 > votosC1) {
            ganhadorEleicao = "Empate entre " + c2 + " e " + c3 + " - Não tivemos um ganhador claro";
        } else {
            ganhadorEleicao = "Nenhum ganhador claro";
        }
        System.out.println("Resultado da eleição: " + ganhadorEleicao);

        if (ganhadorEleicao.equals(c1) || ganhadorEleicao.equals(c2) || ganhadorEleicao.equals(c3)) {
            // Atualiza o total de votos e as porcentagens após adicionar votos em branco
            if (ganhadorEleicao.equals(c1)) {
                votosC1 += votosBranco;
            } else if (ganhadorEleicao.equals(c2)) {
                votosC2 += votosBranco;
            } else if (ganhadorEleicao.equals(c3)) {
                votosC3 += votosBranco;
            }
            totalVotos = votosC1 + votosC2 + votosC3;

            percC1 = (double) votosC1 / totalVotos * 100;
            percC2 = (double) votosC2 / totalVotos * 100;
            percC3 = (double) votosC3 / totalVotos * 100;

            System.out.printf("%nCandidato %s ganhou as eleições com %d votos (%.2f%%)%n", ganhadorEleicao, totalVotos, (ganhadorEleicao.equals(c1) ? percC1 : ganhadorEleicao.equals(c2) ? percC2 : percC3));
        }

    }
}
