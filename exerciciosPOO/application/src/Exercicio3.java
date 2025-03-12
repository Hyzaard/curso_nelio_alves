import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Qual seu nome ?");
        estudante.nome = sc.nextLine();

        System.out.println("Digite a nota do 1º trimestre, que vale ate 30 pontos");
        estudante.nota1 = sc.nextDouble();
        System.out.println("Digite a nota do 2º trimestre, que vale ate 35 pontos");
        estudante.nota2 = sc.nextDouble();
        System.out.println("Digite a nota do 3º trimestre, que vale ate 35 pontos");
        estudante.nota3 = sc.nextDouble();

        estudante.resultado();

        sc.close();
    }
}
