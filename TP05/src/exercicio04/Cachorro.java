package exercicio04;

public class Cachorro extends Animal
{
	Cachorro( String nome, String ra�a)
	{
		super(nome);
		this.setRa�a(ra�a);
	}
	public void Late()
	{
		System.out.println("RAFAEL, O CACHORRO ESTA LATINDO ... AUAU\n");
	}
	@Override
	public String toString() {
		return "Cachorro " + super.toString() + "]";
	}
	
	
}
