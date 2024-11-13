import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        int x = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro, e direi quais sao os impares entre 0 e o valor");
        x = sc.nextInt();

        for(int i = 0; i <= x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
