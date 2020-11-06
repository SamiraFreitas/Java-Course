package exercicio04;

public class Cachorro extends Animal
{
	Cachorro( String nome, String raça)
	{
		super(nome);
		this.setRaça(raça);
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
