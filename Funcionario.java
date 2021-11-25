public class Funcionario{
    private String cargo;
    private double salario;

    public void setCargo(String cargo){
        this.cargo = cargo;
    }public String getCargo(){
        return this.cargo;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }public double getSalario(){
        return this.salario;
    }

    Funcionario(){}
    Funcionario(String cargo, double salario){
        this.cargo = cargo;
        this.salario = salario;
    }
}