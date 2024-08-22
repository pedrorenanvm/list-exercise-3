import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + ", " + num2);
        } else if (num1 > num2) {
            System.out.println(num2 + ", " + num1);
        } else {
            System.out.println(num1);
        }

        scanner.close();
    }
}

