import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        int n = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro, e direi seus divisores");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
