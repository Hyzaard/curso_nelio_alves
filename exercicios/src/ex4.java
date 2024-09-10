import java.util.Locale;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int funcionarioId = 0;
        double horasTrabalhadas, valorHora, salario = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o ID desse funcionario ?");
        funcionarioId = sc.nextInt();

        System.out.println("Quantas horas esse funcionario trabalhou ?");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Quanto esse funcionario recebe por hora ?");
        valorHora = sc.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.printf("%s%d%n" , "ID = " , funcionarioId);
        System.out.printf("%s%.2f%n" , "Salario = " , salario);

        sc.close();
    }
}
