import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia1 = scanner.nextInt();
        int mes1 = scanner.nextInt();
        int dia2 = scanner.nextInt();
        int mes2 = scanner.nextInt();

        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As datas são iguais.");
        } else {
            System.out.println("As datas são diferentes.");
        }

        scanner.close();
    }
}

