package entidades;

public class Funcionario {
	private String nome;
    private Cargo cargo;
    private String dataContratacao;
    
    public Funcionario(String nome, Cargo cargo, String dataContratacao){
        this.setNome(nome);
        this.setCargo(cargo);
        this.setDataContratacao(dataContratacao);
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    
}
