package desafiopoo;

import entidades.Cargo;
import entidades.Funcionario;
import entidades.Gerente;
import entidades.Vendedor;
import entidades.Secretario;
import viwes.ValorTotalPago;
import viwes.TotalPagoEmBenedicioMes;
import viwes.TotalPagoBeneficioFucionarioBeneficio;
import viwes.MaiorBeneficioMes;
import viwes.MaiorFuncionarioMes;
import viwes.MaiorVendedorMes;

import interfaces.Vendas;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Instanciando os cargos
		Cargo Secretario = new Cargo("Secretario", 7000, 1000, 0.2);
		Cargo Vendedor = new Cargo("Vendedor", 12000, 1800, 0.3);
		Cargo Gerente = new Cargo("Gerente", 20000, 3000, 0);
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		//Lista com os Funcionários
		funcionarios.add(new Secretario("Jorge Carvalho", Secretario, "01/2018"));
		funcionarios.add(new Secretario("Maria Souza", Secretario, "12/2015"));
		funcionarios.add(new Vendedor("Ana Silva", Vendedor, "12/2021"));
		funcionarios.add(new Vendedor("João Mendes ", Vendedor, "12/2021"));
		funcionarios.add(new Gerente("Juliana Alves", Gerente, "07/2017"));
		funcionarios.add(new Gerente("Bento Albino", Gerente, "03/2014"));

        //Tabela de vendas
		Vendedor vendedor1 = (Vendedor) funcionarios.get(2);
		Vendedor vendedor2 = (Vendedor) funcionarios.get(3);

        //Adicionando o registro de vendas
        vendedor1.adicionarVendas("12/2021", 5200.00);
        vendedor2.adicionarVendas("12/2021", 3400.00);
        vendedor1.adicionarVendas("01/2022", 4000.00);
        vendedor2.adicionarVendas("01/2022", 7700.00);
        vendedor1.adicionarVendas("02/2022", 4200.00);
        vendedor2.adicionarVendas("02/2022", 5000.00);
        vendedor1.adicionarVendas("03/2022", 5850.00);
        vendedor2.adicionarVendas("03/2022", 5900.00);
        vendedor1.adicionarVendas("04/2022", 7000.00);
        vendedor2.adicionarVendas("04/2022", 6500.00);
        
        //System.out.print(ValorTotalPago.calcular(funcionarios, "11/2023"));
        //System.out.print(TotalPagoEmBenedicioMes.calcular(funcionarios, "11/2023"));
        //System.out.print(TotalPagoBeneficioFucionarioBeneficio.calcular(funcionarios, "11/2023"));
		//System.out.print(MaiorBeneficioMes.calcular(funcionarios, "11/2023"));
		//System.out.print(MaiorFuncionarioMes.informar(funcionarios, "11/2023").getNome());
		//System.out.print(MaiorVendedorMes.informar(funcionarios, "03/2022").getNome());
	}

}
