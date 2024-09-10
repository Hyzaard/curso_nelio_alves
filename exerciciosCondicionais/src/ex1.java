import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        int numero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        numero = sc.nextInt();

        if(numero < 0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }
}
