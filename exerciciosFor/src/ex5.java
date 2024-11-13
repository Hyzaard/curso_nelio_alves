import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        int n = 0;
        int fatorial = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero, e direi seu fatorial");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
