package entidades;

import java.util.HashMap;

import interfaces.Vendas;

public class Vendedor extends Funcionario implements Vendas{
	HashMap<String, Double> vendas;
	
	public Vendedor (String nome, Cargo cargo, String dataContratacao) {
		super(nome, cargo, dataContratacao);
		this.vendas = new HashMap<String, Double>();
	}

	@Override
	public HashMap<String, Double> getVendas() {
		return this.vendas;
	}

	@Override
	public void adicionarVendas(String date, double valor) {
		this.vendas.put(date, valor);		
	}
}
