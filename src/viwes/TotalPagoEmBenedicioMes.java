package viwes;

import java.util.List;

import desafiopoo.SalarioMaisReajuste;
import entidades.Funcionario;

public class TotalPagoEmBenedicioMes {
	
	public static Double calcular(List<Funcionario> funcionarios, String data) {
        double totalPago = 0;
        
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            
            double salarioTotal = SalarioMaisReajuste.calcularSalarioComReajuste(funcionario, data);
            totalPago += salarioTotal;
        }
        return totalPago;
    }
}
