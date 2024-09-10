import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double raio = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio de um circulo");
        raio = sc.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("%s%.4f%n", "Area do circulo = " , area);

        sc.close();

    }
}
