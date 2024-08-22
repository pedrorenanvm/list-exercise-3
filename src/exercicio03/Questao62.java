import java.util.Scanner;

public class Questao62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas desejadas: ");
        int lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (i >= 1 && i <= 9) {
                    System.out.print("0" + i + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
