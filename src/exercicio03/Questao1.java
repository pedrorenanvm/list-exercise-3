package exercicio03;

 //Determine qual é a idade que o usuário faz no ano atual. Para isso solicite o seu ano de nascimento e o ano atual. 

//bibliotecas...
import java.util.Scanner;


public class Questao1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o ano que vc nasceu: ");
        int anoNascimento = read.nextInt();
        
        System.out.print("Digite em que ano esta: ");
        int anoAtual = read.nextInt();
        
        int idade = anoAtual - anoNascimento;
        
        System.out.println("Voce faz " + idade + " anos esse ano.");
        
    }
}