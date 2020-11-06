package exercicio03;

public class Produto
{	
	private Produto produto[];
	private int codigo;
	private float valor;
	private String descricao;
	Produto (int codigo, float valor, String descricao)
	{
		this.setCodigo(codigo);
		this.setValor(valor);
		this.setDescricao(descricao);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor2) {
		this.valor = valor2;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Produto[] getProduto() {
		return produto;
		
	}
	public void setProduto(Produto produto[]) {
		this.produto = produto;
	}
	
}
