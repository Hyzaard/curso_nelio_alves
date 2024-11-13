import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        int n = 0;
        int linha = 1;
        int x = 0;
        int y = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo");
        n = sc.nextInt();

        if(n > 0){
            for(int i = 0; i < n; i++){
                x = linha * linha;
                y = linha * linha * linha;
                System.out.printf("%d%s%d%s%d%n", linha," ", x, " ", y);
                linha++;
            }
        }

        sc.close();
    }
}
