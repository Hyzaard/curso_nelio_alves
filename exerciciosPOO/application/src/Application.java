import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Insira a largura e altura do retangulo");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf("%s%.2f%n", "AREA = ", retangulo.area());
        System.out.printf("%s%.2f%n", "PERIMETRO = ", retangulo.perimetro());
        System.out.printf("%s%.2f%n", "DIAGONAL = ", retangulo.diagonal());

        sc.close();
    }
}
