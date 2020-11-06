package exercicio05;

public class IngressoNormal extends Ingresso
{

	IngressoNormal(float valorIngresso)
	{
		super(valorIngresso);
		// TODO Auto-generated constructor stub
	}
	public void total()
	{
		System.out.println("O valor do ingresso e: "+this.getValorIngresso());
	}
	
}
