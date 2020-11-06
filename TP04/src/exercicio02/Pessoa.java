package exercicio02;

public class Pessoa 
{
	private  String nome; 
	private  Universidade universidade;
	private  String profissao;
	private  Departamento dep; 
	
	Pessoa(String nome, String profissao, Universidade universidade, Departamento dep)
	{
		System.out.println("UMA PESSOA FOI CRIADA");
		this.dep=dep;
		this.universidade=universidade;
		this.nome=nome;
		this.profissao=profissao; 
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
		universidade.adaluno(this);
	}
	
	
	public String getProfissao() {
		return profissao;
	}

	public  void setProfissao(String profissao) {
		this.profissao=profissao;
	}

	public Departamento getDepartamento()
	{
		return dep;
	}
	public  void setDepartamento(Departamento dep)
	{
		this.dep= dep;
	}   
}
