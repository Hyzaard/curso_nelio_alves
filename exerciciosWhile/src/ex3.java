import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        int combustivel = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de combustivel");
        System.out.println("1.Alcool");
        System.out.println("2.Gasolina");
        System.out.println("3.Diesel");
        System.out.println("4.Fim");
        combustivel = sc.nextInt();

        while(combustivel != 4) {
            switch (combustivel) {
                case 1:
                    alcool++;
                    combustivel = sc.nextInt();
                    break;

                case 2:
                    gasolina++;
                    combustivel = sc.nextInt();
                    break;

                case 3:
                    diesel++;
                    combustivel = sc.nextInt();
                    break;

                default:
                        System.out.println("Codigo invalido, por favor digite um novo codigo");
                        combustivel = sc.nextInt();
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Dieseil: " + diesel);

        sc.close();
    }
}
