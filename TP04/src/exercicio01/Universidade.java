package exercicio01;
public class Universidade 
{
	private String nomeUni;
	private String cidade;
	private String pais;
	private Pessoa [] listadeAlunos= new Pessoa[2];
	int contador;
	Universidade(String nomeUni,String cidade, String pais)
	{
		System.out.println("UMA UNIVERSIDADE FOI CRIADA");
		this.nomeUni=nomeUni;
		this.cidade=cidade;
		this.pais=pais;
	}
	public  String getNome() {
		return nomeUni;
	}
	public void setNome(String nome) {
		this.nomeUni = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void adaluno(Pessoa p)
	{
		listadeAlunos[contador]=p;
		contador++;
	}
	public Pessoa[] getListadAlunos()
	{
		return this.listadeAlunos;
		
	}
	public void imprime(Pessoa[] lista) {
		System.out.println("Mostrando a lista de alunos da Universidade:"+this.getNome());
		for(int i =0; i < lista.length; i++)
		{
			if(listadeAlunos[i]!= null) {
				listadeAlunos[i].getUniversidade();
				System.out.println(""+listadeAlunos[i].getNome()+" nascido em: "+listadeAlunos[i].getDia()+"/"+listadeAlunos[i].getMes()+"/"+listadeAlunos[i].getAno()+ " trabalhou como professor de "+listadeAlunos[i].getProfissao()+" na universidade: "+listadeAlunos[i].getUniversidade().nomeUni+"("+listadeAlunos[i].getUniversidade().cidade+"-"+listadeAlunos[i].getUniversidade().getPais()+")");
			}
			
		}
		
	}
	
}
