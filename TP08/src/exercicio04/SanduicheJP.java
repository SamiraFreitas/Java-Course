package exercicio04;

public class SanduicheJP extends Sanduiche
{

	public SanduicheJP() 
	{
		super("Franc�s", "Mussarela", "De Frango", "Com Verdura");
	}

	@Override
	public String toString() {
		return "SanduicheJP: " + super.toString() + "]";
	}
	
}
