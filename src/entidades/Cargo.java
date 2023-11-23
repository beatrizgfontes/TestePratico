package entidades;

public class Cargo{
    
    private String nome;
    public Double salario;
    public Double reajuste;
    public Double beneficio;
    public Double beneficioPorcentagem;
    
    public Cargo(String nome, double salario, double reajuste, double beneficio){
        this.setNome(nome);
        this.setSalario(salario);
        this.setReajuste(reajuste);
        this.setBeneficio(beneficio);
        this.beneficioPorcentagem = beneficio * 100;
    }

	public Double getBeneficioDecimal() {
		return beneficioPorcentagem / 100;
	}

	public void setBeneficioPorcentagem(Double beneficioPorcentagem) {
		this.beneficioPorcentagem = beneficioPorcentagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario + beneficio;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getReajuste() {
		return reajuste;
	}

	public void setReajuste(Double reajuste) {
		this.reajuste = reajuste;
	}

	public Double getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(Double beneficio) {
		this.beneficio = beneficio * salario;
	}
    
}
