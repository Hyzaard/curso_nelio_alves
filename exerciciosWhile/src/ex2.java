import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a coordenada de x");
        int x = sc.nextInt();

        System.out.println("Digite a coordenada de y");
        int y = sc.nextInt();

        while(x != 0 && y != 0){
            if(x  > 0 && y > 0){
                System.out.println("Primeiro quadrante");
            }
            else if(x < 0 && y > 0){
                System.out.println("Segundo quadrante");
            }
            else if(x  < 0 && y < 0){
                System.out.println("Teceiro quadrante");
            }
            else {
                System.out.println("Quarto quadrante");
            }

            System.out.println("Digite a coordenada de x");
            x = sc.nextInt();

            System.out.println("Digite a coordenada de y");
            y = sc.nextInt();
        }

        sc.close();
    }
}
