void main() {

    Funcionario funcionario = new Funcionario("Ana",3000);
    funcionario.aumentarSalario(10);

    IO.println("\n-----  FICHA DO FUNCIONÁRIO  -----");
    funcionario.exibirDados();
}
