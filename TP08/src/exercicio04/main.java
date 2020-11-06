package exercicio04;

public class main
{	
	public static void main (String[] args)
	{
	SanduicheFactory sanduba = new SanduicheFactory();
	System.out.println(sanduba.criarForma("Integral", "Prato", "De Frango", "Com Verdura").toString());
	System.out.println(sanduba.criarForma("Francês", "Mussarela", "De Frango", "Sem Verdura"));
	System.out.println(sanduba.criarForma("Bola", "Cheddar", "De Peru", "Sem Verdura"));

}
}