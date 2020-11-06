package exercicio06;

public class Miseravel extends Pessoa
{
	Miseravel(String nome, int idade)
	{
		super(nome, idade);
	}
	
	public void Mendigo()
	{
		System.out.println(this.getNome()+" é considerado uma pessoa miseravel e precisa de ajuda\n");
	}
}
