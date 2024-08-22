import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome1 = scanner.nextLine();
        int idade1 = scanner.nextInt();
        scanner.nextLine();
        String nome2 = scanner.nextLine();
        int idade2 = scanner.nextInt();

        if (idade1 > idade2) {
            System.out.println(nome1);
            System.out.println(nome2);
        } else if (idade1 < idade2) {
            System.out.println(nome2);
            System.out.println(nome1);
        } else {
            System.out.println(nome1);
            System.out.println(nome2);
        }

        scanner.close();
    }
}

