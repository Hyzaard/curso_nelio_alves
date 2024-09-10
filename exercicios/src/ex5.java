import java.util.Locale;
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int codX, codY, quantidadePecaX, quantidadePecaY  = 0;
        double valorUnidadeX, valorUnidadeY, valorTotal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o codigo da peca x ?");
        codX = sc.nextInt();

        System.out.println("Qual a quantidade de pecas x ?");
        quantidadePecaX = sc.nextInt();

        System.out.println("Qual o valor da unidade da peca x ?");
        valorUnidadeX = sc.nextDouble();

        System.out.println("Qual o codigo da peca y ?");
        codY = sc.nextInt();

        System.out.println("Qual a quantidade de pecas y ?");
        quantidadePecaY = sc.nextInt();

        System.out.println("Qual o valor da unidade da peca y ?");
        valorUnidadeY = sc.nextDouble();

        valorTotal = valorUnidadeX * quantidadePecaX + valorUnidadeY * quantidadePecaY;

        System.out.printf("%s%.2f%n" , "Valor a pagar: " , valorTotal);

        sc.close();
    }
}
