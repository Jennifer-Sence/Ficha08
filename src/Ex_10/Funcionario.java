package Ex_10;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento){
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double aumentarSalario(double percentagemAumento){
        double novoSalario = this.salario * percentagemAumento;
        this.salario += novoSalario;
        return this.salario;
    }
    public void exibirDados(){
        System.out.println("Nome do funcionário: " +this.nome);
        System.out.println("Salario do funcionário: " +this.salario);
        System.out.println("Departamento do funcionário: " +this.departamento);
    }
}
