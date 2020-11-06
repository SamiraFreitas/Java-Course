package exercicio05;

public class Ingresso 
{
	private float valorIngresso;
	
	Ingresso(float valorIngresso)
	{
		this.valorIngresso=valorIngresso;	
	}
	public float getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(float valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	@Override
	public String toString() {
		return "valorIngresso=" + valorIngresso;
	}
	
	
}
