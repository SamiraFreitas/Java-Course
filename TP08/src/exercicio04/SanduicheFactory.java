package exercicio04;

public class SanduicheFactory
{
	public static Sanduiche criarForma(String pao, String queijo, String presunto, String salada)
	{
		if (pao == null)
			return null ;
		if(pao.equalsIgnoreCase("Integral")&& queijo.equalsIgnoreCase("Prato") && presunto.equalsIgnoreCase("De Frango") && salada.equalsIgnoreCase("Com Verdura"))
		{
			return new SanduicheCG();
		}
		else if (pao.equalsIgnoreCase("Francês")&& queijo.equalsIgnoreCase("Mussarela") && presunto.equalsIgnoreCase("De Frango") && salada.equalsIgnoreCase("Sem Verdura"))
		{
			return new SanduicheJP();
		}
		else if (pao.equalsIgnoreCase("Bola")&& queijo.equalsIgnoreCase("Cheddar") && presunto.equalsIgnoreCase("De Peru") && salada.equalsIgnoreCase("Sem Verdura"))
		{
			return new SanduicheRT();
		}
		return null;
	}
}
