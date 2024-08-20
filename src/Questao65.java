import java.util.Scanner;

public class Questao65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas desejadas: ");
        int lines = input.nextInt();

        for (int i = 0; i < lines;i++){
            for(int j = 0; j < lines - i -1; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i +1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
