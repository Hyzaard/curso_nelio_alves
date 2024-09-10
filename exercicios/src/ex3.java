import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        int A, B, C, D, diferenca = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 4 valores inteiros");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = A * B - C * D;
        System.out.println("A difenca do produto de A e B pelo produto de C e D eh: " + diferenca);

        sc.close();
    }
}
