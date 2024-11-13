import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        double n = 0;
        double x = 0;
        double y = 0;
        double resultado = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pares");
        n = sc.nextDouble();

        System.out.println("Digite os pares de numeros, que dividirei o primeiro pelo segundo");

        for(int i = 0; i < n; i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            if(y == 0){
                System.out.println("divisao impossivel");
            } else {
                resultado = x / y;
                System.out.println(resultado);
            }
        }

        sc.close();
    }
}
