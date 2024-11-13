import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        int n = 0;
        int valores = 0;
        int in = 0;
        int out = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Irei te dizer quantos valores estao dentro e fora do escopo entre 10 a 20");
        System.out.println("Digite a quantidade de valores inteiros");
        n = sc.nextInt();

        System.out.println("Digite os valores inteiros");

        for(int i = 0; i < n; i++){
            valores = sc.nextInt();
            if(valores >= 10 && valores <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
