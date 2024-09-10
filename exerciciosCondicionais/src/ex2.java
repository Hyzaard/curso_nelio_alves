import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        int numero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero e falarei se eh par ou impar");
        numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }

        sc.close();
    }

}
