package exercicio03;

import java.util.Scanner;

public class Questao50 {

    //metodo. se o valor da posição for um ou dois devolve 1. se for maior executa o calculo
    public static long calcularFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        long primeiro = 1;
        long segundo = 1;
        long proximo = 0;
        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        return proximo;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor da posição que deseja encontrar"); // pede ao usuario o valor de entrada
        int n = scanner.nextInt();
        //confirma que o valor é positivo
        if (n <= 0) {
            System.out.println("O valor deve ser positivo");
        } else {
            long fibonacci = calcularFibonacci(n);
            System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + fibonacci);
        }
    }


}

