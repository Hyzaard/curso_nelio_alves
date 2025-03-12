import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Qual o nome do funcionario ?");
        funcionario.name = sc.nextLine();
        System.out.println("Qual o salario bruto do funcionario ?");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Qual o imposto as ser pago sobre o salario bruto ?");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + funcionario);
        System.out.println();
        System.out.println("Quantos porcentos vai aumentar o salario ?");
        funcionario.aumentaSalario(sc.nextDouble());

        System.out.println();
        System.out.println("Informacoes atualizadas: " + funcionario);
        sc.close();
    }
}
