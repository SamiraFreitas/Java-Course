package exercicio05;

public class CamaroteSuperior extends IngressoVip
{

	private String localizašao;
	private float valoradd;
	private float total;
	CamaroteSuperior(float valorIngresso, float valoradd, String localizašao)
	{
		super(valorIngresso, valoradd);
		this.setLocalizašao(localizašao);

	}
	public String getLocalizašao() {
		return localizašao;
	}
	public void setLocalizašao(String localizašao) {
		this.localizašao = localizašao;
	}
	@Override
	public String toString() {
		return "Camaroteuperior [localizašao=" + localizašao + "]";
	}
	
	
	
}
