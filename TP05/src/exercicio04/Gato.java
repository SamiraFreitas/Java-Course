package exercicio04;

public class Gato extends Animal
{
	Gato(String nome, String raça)
	{
		super(nome);
		this.setRaça(raça);
	}
	public void Mia()
	{
		System.out.println("RAFAEL, O GATO ESTA MIANDO .......MIAU MIAU\n");
	}
	@Override
	public String toString() {
		return "Gato " + super.toString() + "]";
	}
	
}
