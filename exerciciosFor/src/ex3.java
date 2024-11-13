import java.util.Locale;
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        int n = 0;
        double teste1 = 0;
        double teste2 = 0;
        double teste3 = 0;
        double media = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de casos de testes");
        n = sc.nextInt();

        System.out.println("Digite os casos de testes");

        for(int i = 0; i < n; i++){
            teste1 = sc.nextDouble();
            teste2 = sc.nextDouble();
            teste3 = sc.nextDouble();
            media = (teste1 * 2.0 + teste2 * 3.0 + teste3 * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
