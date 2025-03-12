public class Estudante {

    public String nome;
    public double nota1 = 0;
    public double nota2 = 0;
    public double nota3 = 0;

    public void resultado(){
        double notaFinal = nota1 + nota2 + nota3;
        System.out.printf("%s%.2f%n", "NOTA FINAL = ", notaFinal);
        if(notaFinal < 60){
            System.out.println("FALHOU");
            System.out.printf("%s%.2f%s%n", "Faltaram ", (60 - notaFinal) , " pontos");
        }else{
            System.out.println("PASSOU");
        }
    }

}
