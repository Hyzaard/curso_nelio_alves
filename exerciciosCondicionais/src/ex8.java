import java.util.Locale;
import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double salario = 0;
        double imposto = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu salario ?");
        sc.nextDouble();

        if(salario <= 2000.00){
            System.out.println("Isento");
        }else if(salario <= 3000.00){
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("%s%.2f%n", "R$: ", imposto);
        }else if(salario <= 4500.00){
            imposto = (salario - 3000)  * 0.18 + 1000.0 * 0.08;
            System.out.printf("%s%.2f%n", "R$: ", imposto);
        }else{
            imposto = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("%s%.2f%n", "R$: ", imposto);
        }
    }
}
