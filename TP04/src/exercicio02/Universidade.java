package exercicio02;

public class Universidade
{
	private String NomeUni;
	private String cidade;
	private String pais;
	private Pessoa [] listadeAlunos= new Pessoa[1];
	private int contador=0;
	private int cont=0;
	private Departamento dep;
	Universidade(String nomeUni,String cidade, String pais, Departamento dep, String nomeDepartamento, String chefeDepartamento, String secretariaDepartamento)
	{
		System.out.println("UMA UNIVERSIDADE FOI CRIADA");
		this.NomeUni=nomeUni;
		this.cidade=cidade;
		this.pais=pais;
		this.dep=dep;
		if (cont<50) {
		this.dep = new Departamento(nomeDepartamento, chefeDepartamento, secretariaDepartamento);
		cont++;
	     }else
	     {
	        System.out.println("Impossível ter mais de 50 departamentos.");
	     }
		/*Objeto criado dentro da classe,
		quando o objeto da classe Universidade deixar de existir
		o objeto do Departamento também deixara de existir*/
		
		
	}
	/*CRIANDO A ADAPTACAO EM AGREGACAO 
	 * public UniversidadeAdaptacao(String nomeUni,String cidade, String pais)
	{
		System.out.println("UMA UNIVERSIDADE FOI CRIADA");
		this.nomeUni=nomeUni;
		this.cidade=cidade;
		this.pais=pais;
		this.departamento = departamento; 
		/*Aqui um exemplo de agreçăo, 
		pois a classe 
		pessoa năo vai construir um departamento
		no seu construtor, 
		o departamento é um objeto recebido já instânciado
	}*/
	public  String getNome() {
		return NomeUni;
	}
	public void setNome(String nome) {
		this.NomeUni=nome;
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
	public void imprime(Pessoa[] lista) 
	{
		System.out.println("Mostrando a lista de alunos da Universidade:"+this.NomeUni);
		for(int i =0; i < lista.length; i++)
		{
			if(listadeAlunos[i]!= null) 
			{
				listadeAlunos[i].getUniversidade();
				System.out.println(""+listadeAlunos[i].getNome()+" atua como "+listadeAlunos[i].getProfissao()+" na universidade: "+listadeAlunos[i].getUniversidade().getNome()+"("+listadeAlunos[i].getUniversidade().cidade+"-"+listadeAlunos[i].getUniversidade().getPais()+")");
				System.out.println(""+listadeAlunos[i].getNome()+" pertence ao Departamento: "+listadeAlunos[i].getDepartamento().getNome()+"\nChefe Departamento: "+listadeAlunos[i].getDepartamento().getChefe()+"\nSecretario/a: "+listadeAlunos[i].getDepartamento().getSecretaria());
				
			}
			
		}
	}
}
