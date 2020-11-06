package exercicio05;

public class CamaroteInferior extends IngressoVip
{
	private String localizaçao;
	private float valoradd;
	private float total;
	CamaroteInferior(float valorIngresso, float valoradd, String localizaçao)
	{
		super(valorIngresso, valoradd);
		this.setLocalizaçao(localizaçao);

	}
	public String getLocalizaçao() {
		return localizaçao;
	}
	public void setLocalizaçao(String localizaçao) {
		this.localizaçao = localizaçao;
	}
	@Override
	public String toString() {
		return "CamaroteInferior [localizaçao=" + localizaçao + "]";
	}
	
}
