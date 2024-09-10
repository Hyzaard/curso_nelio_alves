import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        int codigo = 0;
        int quantidade = 0;
        double valor = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o codigo do item ?");
        codigo = sc.nextInt();

        System.out.println("Quantos desse item voce quer ?");
        quantidade = sc.nextInt();

        if(codigo == 1){
            valor = 4.00 * quantidade;
        }else if(codigo == 2){
            valor = 4.50 * quantidade;
        }else if(codigo == 3){
            valor = 5.00 * quantidade;
        }else if(codigo == 4){
            valor = 2.00 * quantidade;
        }else if(codigo == 5){
            valor = 1.50 * quantidade;
        }else{
            System.out.println("Erro: nao existe este codigo");
        }

        System.out.printf("%s%.2f%n", "Total: ", valor);

        sc.close();
    }
}
