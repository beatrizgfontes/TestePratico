package desafiopoo;

import java.util.HashMap;

import entidades.Funcionario;
import entidades.Vendedor;

public class TotalVendas {
	
	 public static Double calcular(Funcionario funcionario, String data) {
		 double totalVendas = 0.0;
		 
	     Vendedor vendedor = (Vendedor) funcionario;
	     HashMap<String, Double> vendas = vendedor.getVendas();
	        
	     for (Double valorVenda : vendas.values()) {
	         totalVendas += valorVenda;
	     }
	     return totalVendas;
	 }
}
