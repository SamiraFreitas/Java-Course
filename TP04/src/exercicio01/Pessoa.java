package exercicio01;

public class Pessoa
{
	private  String nome; 
	private  Universidade universidade;
	private  String profissao;
	private int dia;
	private int mes;
	private int ano;
	
	Pessoa(String nome, String profissao, int dia, int mes, int ano)
	{
		System.out.println("UMA PESSOA FOI CRIADA");
		this.nome=nome;
		this.profissao=profissao;
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
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

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


	public String getProfissao() {
		return profissao;
	}


	public  void setProfissao(String profissao) {
		this.profissao=profissao;
	}
}
