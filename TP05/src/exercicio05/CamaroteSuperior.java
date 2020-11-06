package exercicio05;

public class CamaroteSuperior extends IngressoVip
{

	private String localizaçao;
	private float valoradd;
	private float total;
	CamaroteSuperior(float valorIngresso, float valoradd, String localizaçao)
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
		return "Camaroteuperior [localizaçao=" + localizaçao + "]";
	}
	
	
	
}
