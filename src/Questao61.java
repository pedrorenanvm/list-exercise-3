import java.util.Scanner;

public class Questao61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas desejadas: ");
        int lines = input.nextInt();

        for (int i=0; i < lines; i++){
            for (int j = 0; j < i + 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
