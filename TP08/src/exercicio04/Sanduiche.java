package exercicio04;

public class Sanduiche 
{
	private String pao;
	private String queijo;
	private String presunto;
	private String salada;
	public Sanduiche (String pao, String queijo, String presunto, String salada)
	{
		this.pao = pao;
		this.queijo = queijo;
		this.presunto = presunto;
		this.salada = salada;
	}
	@Override
	public String toString() {
		return "Sanduiche [pao=" + pao + ", queijo=" + queijo + ", presunto=" + presunto + ", salada=" + salada + "]";
	}
	
}
