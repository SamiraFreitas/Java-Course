package exercicio04;

public class Gato extends Animal
{
	Gato(String nome, String ra�a)
	{
		super(nome);
		this.setRa�a(ra�a);
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
