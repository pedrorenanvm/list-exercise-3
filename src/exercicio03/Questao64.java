import java.util.Scanner;

public class Questao64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas desejadas: ");
        int lines = input.nextInt();

        for (int x = 1; x <= lines; x++) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
