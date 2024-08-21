package exercicio03;

import java.util.Scanner;

// A partir da idade informada de um cidadão diga se ele não pode votar (idade inferior a 16), ou se o voto é facultativo (idade menor ou igual a 16, ou maior ou igual a 65), ou ainda se o voto é obrigatório.

public class Questao11 {

    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            
            System.out.print("Digite a sua idade: ");
            int idade = read.nextInt();
            
            if (idade < 16) {
                System.out.println("Voce nao pode votar!");
            } else if (idade <= 18 || idade >= 65) {
                System.out.println("O voto e facultativo.");
            } else {
                System.out.println("O voto e obrigatorio.");
            }
        }
    }