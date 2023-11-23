package interfaces;

import java.util.HashMap;

public interface Vendas {
	HashMap<String, Double> getVendas();
	void adicionarVendas(String date, double valor);
}
