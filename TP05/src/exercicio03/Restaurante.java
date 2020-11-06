package exercicio03;

public class Restaurante extends Empresa 
{
	private String tipoComida;
	private float valorPrato;
	public String getTipoComida() {
		return tipoComida;
	}
	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}
	public float getValorPrato() {
		return valorPrato;
	}
	public void setValorPrato(float valorPrato)
	{
		this.valorPrato = valorPrato;
	}
	Restaurante(String nome, String cidade, String cep, String telefone, String tipoComida, float valorPrato)
	{
		super(nome,cidade, cep, telefone);
		this.valorPrato=valorPrato;
		this.tipoComida=tipoComida;
	}
	@Override
	public String toString() {
		return "Restaurante [tipoComida=" + tipoComida + ", valorPrato=" + valorPrato + ", toString()="
				+ super.toString() + "]";
	}
	
}
