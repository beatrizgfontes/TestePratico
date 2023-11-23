package viwes;

import java.util.List;

import entidades.Funcionario;
import desafiopoo.SalarioMaisReajuste;

public class MaiorFuncionarioMes {
	public static Funcionario informar(List<Funcionario> funcionarios, String data) {
        Double maiorSalario = Double.MIN_VALUE;
        Funcionario funcionarioComMaiorSalario = null;

        for (Funcionario funcionario : funcionarios) {
            Double salario = SalarioMaisReajuste.calcularSalarioComReajuste(funcionario, data);

            if (salario > maiorSalario) {
                maiorSalario = salario;
                funcionarioComMaiorSalario = funcionario;
            }
        }

        return funcionarioComMaiorSalario;
    }	
}
