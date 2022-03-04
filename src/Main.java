import br.com.projeto.model.Funcionario;
import br.com.projeto.model.Venda;
import java.time.LocalDate;

import static br.com.projeto.model.Cargo.Caixa;
import static br.com.projeto.model.Cargo.Vendedor;

public class Main {
    public static void main(String[] args) {
        Funcionario f1lais = new Funcionario("Laís Leite",
                123456789, LocalDate.of(1991, 12, 03), Vendedor);

        Funcionario f2tom = new Funcionario ("Tom Santoro",
                987654321, LocalDate.of(1985, 06, 18), Caixa);


        Venda venda1 = new Venda(f1lais, 500d);
        System.out.println(venda1.calcularComissao());

        Venda venda2 = new Venda (f2tom,500d);
        System.out.println(venda2.calcularComissao());


    }







}
