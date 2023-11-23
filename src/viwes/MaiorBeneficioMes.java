package viwes;

import java.util.List;

import desafiopoo.SalarioMaisReajuste;
import desafiopoo.TotalVendas;
import entidades.Funcionario;
import entidades.Vendedor;

public class MaiorBeneficioMes {
	
	public static String calcular(List<Funcionario> funcionarios, String data) {
        Double maiorBeneficio = Double.MIN_VALUE;
        String funcionarioComBeneficio = null;

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            
            if (funcionario.getCargo().getBeneficioDecimal() > 0) {
            	double salarioTotal = SalarioMaisReajuste.calcularSalarioComReajuste(funcionario, data);
                funcionario.getCargo().setSalario(salarioTotal);
                
                double beneficio;
                
                if (funcionario instanceof Vendedor) {
                    double totalVendas = TotalVendas.calcular(funcionario, data);
                    beneficio = totalVendas * funcionario.getCargo().getBeneficioDecimal();
                } 
                
                else {
                	funcionario.getCargo().setBeneficio(funcionario.getCargo().getBeneficioDecimal());
                    beneficio = funcionario.getCargo().getBeneficio();
                }
                
                if (beneficio > maiorBeneficio) {
                    maiorBeneficio = beneficio;
                    funcionarioComBeneficio = funcionario.getNome();
                }
            }
        }

        return funcionarioComBeneficio;
    }
}
