package exercicio03;

import java.math.BigInteger;

public class Questao52 {

    public static void main(String[] args) {
        BigInteger totalGraos = BigInteger.ZERO; //usei big integer pq o numero é muito grande
        BigInteger graosNaCasa = BigInteger.ONE;

        for (int casa = 1; casa <= 64; casa++) {
            totalGraos = totalGraos.add(graosNaCasa);
            graosNaCasa = graosNaCasa.multiply(BigInteger.TWO);
        }

        System.out.println("Total de grãos de arroz: " + totalGraos);

        // assumi que são 50 mil por saco
        BigInteger graosPorSaco = BigInteger.valueOf(50000);
        BigInteger sacosNecessarios = totalGraos.divide(graosPorSaco);

        System.out.println("Quantidade de sacos de arroz necessários: " + sacosNecessarios);
    }
}
