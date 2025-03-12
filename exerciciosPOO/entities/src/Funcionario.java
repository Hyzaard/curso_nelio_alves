public class Funcionario {

    public String name;
    public double salarioBruto = 0;
    public double imposto = 0;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void aumentaSalario(double porcentagem){
        salarioBruto += salarioBruto * (porcentagem/100);
    }

    @Override
    public String toString(){
        return name + ", $ " + String.format("%.2f", salarioLiquido());
    }
}
