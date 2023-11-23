package viwes;

import java.util.List;

import entidades.Funcionario;
import entidades.Vendedor;
import desafiopoo.TotalVendas;
import desafiopoo.SalarioMaisReajuste;

public class TotalPagoBeneficioFucionarioBeneficio {
	
	public static Double calcular(List<Funcionario> funcionarios, String data) {
        Double totalBeneficios = 0.0;

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            
            if (funcionario.getCargo().getBeneficioDecimal() > 0) {
            	double salarioTotal = SalarioMaisReajuste.calcularSalarioComReajuste(funcionario, data);
                funcionario.getCargo().setSalario(salarioTotal);
                
                funcionario.getCargo().setBeneficio(funcionario.getCargo().getBeneficioDecimal());
                
                if (funcionario instanceof Vendedor) {
                    double totalVendas = TotalVendas.calcular(funcionario, data);
                    funcionario.getCargo().setSalario(totalVendas);
                    
                    totalBeneficios += (salarioTotal + funcionario.getCargo().getBeneficio());
                }
                
                totalBeneficios += (salarioTotal + funcionario.getCargo().getBeneficio());
            }
        }

        return totalBeneficios;
    }
}
