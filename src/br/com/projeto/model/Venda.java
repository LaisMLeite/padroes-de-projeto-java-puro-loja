package br.com.projeto.model;

public class Venda {
    private final Funcionario funcionario;
    private final double valorDaVenda;

    public Venda(Funcionario funcionario, double valorDaVenda) {
        this.funcionario = funcionario;
        this.valorDaVenda = valorDaVenda;
     }


    public double calcularComissao() {

        double comissao = 0d;

        Cargo cargo = this.funcionario.getCargo();
        comissao = cargo.calcularComissao(valorDaVenda);
        return comissao;

    }

    public Funcionario getFuncionario() {
        return funcionario;
    }



    public double getValorDaVenda() {
        return valorDaVenda;
    }


}
