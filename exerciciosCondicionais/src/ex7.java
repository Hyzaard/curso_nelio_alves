import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        double x = 0;
        double y = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a coordenada de x");
        x = sc.nextDouble();

        System.out.println("Digite a coordenada de y");
        y = sc.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        }else if(x == 0){
            System.out.println("Eixo Y");
        }else if(y == 0){
            System.out.println("Eixo X");
        }else if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else{
            System.out.println("Q4");
        }

        sc.close();
    }
}
