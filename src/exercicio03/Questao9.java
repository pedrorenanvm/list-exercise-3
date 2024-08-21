package exercicio03;

import java.util.Scanner;

//Verifique se o usuário é maior de idade ou não.

public class Questao9 {

    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            
            System.out.print("Digite a sua idade: ");
            int idade = read.nextInt();
            
            if (idade >= 18) {
                System.out.println("Vc e maior de idade.");
            } else {
                System.out.println("Vc e menor de idade.");
            }

        }
    }
