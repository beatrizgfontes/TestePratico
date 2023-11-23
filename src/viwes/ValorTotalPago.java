package viwes;

import java.util.List;

import entidades.Funcionario;
import entidades.Vendedor;
import desafiopoo.TotalVendas;
import desafiopoo.SalarioMaisReajuste;

public class ValorTotalPago {
	
	public static Double calcular(List<Funcionario> funcionarios, String data) {
        double totalPago = 0;
        
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            
            double salarioTotal = SalarioMaisReajuste.calcularSalarioComReajuste(funcionario, data);
            funcionario.getCargo().setSalario(salarioTotal);
            
            funcionario.getCargo().setBeneficio(funcionario.getCargo().getBeneficioDecimal());
            
            if (funcionario instanceof Vendedor) {
                double totalVendas = TotalVendas.calcular(funcionario, data);
                funcionario.getCargo().setSalario(totalVendas);
                
                totalPago += (salarioTotal + funcionario.getCargo().getBeneficio());
            } 
            
            else {
            	totalPago += (salarioTotal + funcionario.getCargo().getBeneficio());
            }
            
        }
        return totalPago;
    }
	
}
