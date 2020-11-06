package exercicio06;
public class teste 
{
	public static void main (String [] args) 
	{
		Rica people= new Rica("Rafael Alexandre", 40, 1.0000000000);
		people.fazCompras();
		Pobre people2= new Pobre("Samira", 22);
		people2.Trabalha();
		Miseravel people3= new Miseravel("Pulguinha", 65);
		people3.Mendigo();

	}
}
