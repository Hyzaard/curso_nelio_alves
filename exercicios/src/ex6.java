import java.util.Locale;
import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double A, B ,C = 0;
        double triangulo, circulo, trapezio, quadrado, retangulo = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A*C/2.0;
        circulo = 3.14159*C*C;
        trapezio = (A+B) / 2.0*C;
        quadrado = B*B;
        retangulo = A*B;

        System.out.printf("%s%.3f%n" , "TRIANGULO: " , triangulo);
        System.out.printf("%s%.3f%n" , "CIRCULO: " , circulo);
        System.out.printf("%s%.3f%n" , "TRAPEZIO: " , trapezio);
        System.out.printf("%s%.3f%n" , "QUADRADO: " , quadrado);
        System.out.printf("%s%.3f%n" , "RETANGULO: " , retangulo);

        sc.close();
    }
}
