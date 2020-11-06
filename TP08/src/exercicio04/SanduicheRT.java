package exercicio04;

public class SanduicheRT extends Sanduiche 
{

	public SanduicheRT() 
	{
		super("Bola", "Cheddar", "De Peru", "Sem Verdura");
		
	}

	@Override
	public String toString() 
	{
		return "SanduicheRT:" + super.toString() + "]";
	}
	
	
}
