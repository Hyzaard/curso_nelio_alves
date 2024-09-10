import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        int horaInicial = 0;
        int horaFinal = 0;
        int duracao = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial do jogo");
        horaInicial = sc.nextInt();

        System.out.println("Digite a hora final do jogo");
        horaFinal = sc.nextInt();


        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }else{
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " Horas");

        sc.close();
    }
}



























