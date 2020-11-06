package exercicio06;

public class Rica extends Pessoa
{
	private double dinheiro; 
	Rica(String nome, int idade, double dinheiro)
	{
		super(nome, idade);
		this.dinheiro=dinheiro;
	}
	public void fazCompras()
	{
		System.out.println(this.getNome()+" é considerado uma pessoa rica e foi fazer compras\n");
	}
	
}
