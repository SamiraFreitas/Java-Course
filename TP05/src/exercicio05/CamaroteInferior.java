package exercicio05;

public class CamaroteInferior extends IngressoVip
{
	private String localiza�ao;
	private float valoradd;
	private float total;
	CamaroteInferior(float valorIngresso, float valoradd, String localiza�ao)
	{
		super(valorIngresso, valoradd);
		this.setLocaliza�ao(localiza�ao);

	}
	public String getLocaliza�ao() {
		return localiza�ao;
	}
	public void setLocaliza�ao(String localiza�ao) {
		this.localiza�ao = localiza�ao;
	}
	@Override
	public String toString() {
		return "CamaroteInferior [localiza�ao=" + localiza�ao + "]";
	}
	
}
