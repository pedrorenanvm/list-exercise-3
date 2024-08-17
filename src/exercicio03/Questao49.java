package exercicio03;

public class Questao49 {

    public static void main(String[] args) {

        int n = 50;// quantidade de números
        // o primeiro e o segundo são 1
        long primeiro = 1;
        long segundo = 1;

        System.out.println("Os primeiros 50 números são:");
        System.out.print(primeiro + ", " + segundo); // exibe os dois primeiros

        // faz o calculo
        for (int i = 3; i <= n; i++) {
            long proximo = primeiro + segundo;
            System.out.print(", " + proximo); //exibe os proximos numeros
            primeiro = segundo; //atualiza variavel
            segundo = proximo; //atualiza variavel
        }

        System.out.println();
    }
}
