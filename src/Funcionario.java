public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        percentual = (getSalario()/100)* percentual;
        salario = salario + percentual;
    }

    public void exibirDados() {
        IO.println("Nome: " + nome);
        IO.println("Salário: R$ " + salario);
    }
}