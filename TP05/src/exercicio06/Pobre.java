package exercicio06;

public class Pobre extends Pessoa
{
	Pobre(String nome, int idade)
	{
		super(nome, idade);
	}
	public void Trabalha()
	{
		System.out.println(this.getNome()+" é considerado uma pessoa pobre e foi trabalhar\n");
	}
}
