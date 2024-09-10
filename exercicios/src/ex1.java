import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro");
        n1 = sc.nextInt();

        System.out.println("Digite outro valor inteiro");
        n2 = sc.nextInt();

        sc.close();

        soma = n1 + n2;

        System.out.println("SOMA = " + soma);

    }
}
