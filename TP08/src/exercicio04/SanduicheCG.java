package exercicio04;

public class SanduicheCG extends Sanduiche
{

	public SanduicheCG() 
	{
		super("Integral", "Prato", "De Frango", "Sem Verdura");
	}

	@Override
	public String toString() {
		return "SanduicheCG:" + super.toString() + "]";
	}


}
