import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        int numero1 = 0;
        int numero2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 numeros, e direi se sao multiplos ou nao");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        if(numero1 % numero2 == 0 || numero2 % numero1 ==0){
            System.out.println("Sao multiplos");
        }else{
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}
