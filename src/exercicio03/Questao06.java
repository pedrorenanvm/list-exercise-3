package exercicio03;


//Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros. A área de um círculo é ¶ multiplicado pelo raio elevado ao quadrado. Em Java o valor de ¶ está disponível em Math.PI

public class Questao06 {


    public static void main(String[] args) {
        double raio = 5.0;
        double area = Math.PI * Math.pow(raio, 2);
        
        System.out.printf("A area do círculo é: %.2f metros quadrados.%n", area);
    }
}