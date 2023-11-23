package viwes;

import java.util.List;

import entidades.Funcionario;
import entidades.Vendedor;

public class MaiorVendedorMes {
	public static Funcionario informar(List<Funcionario> vendedores, String data) {
        Funcionario maiorVendedor = null;
        Double maior = Double.MIN_VALUE;

        double vendas;
        for (Funcionario funcionario : vendedores) {
            if (funcionario instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) funcionario;
                
                try {
                    vendas = vendedor.getVendas().get(data);
                } 
                
                catch (Exception e) {
                    throw new RuntimeException(e);
                }
                
                if (vendas > maior) {
                    maior = vendas;
                    maiorVendedor = vendedor;
                }
            }
        }

        return maiorVendedor;
    }
}
