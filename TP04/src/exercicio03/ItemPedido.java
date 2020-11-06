package exercicio03;

public class ItemPedido 
{
	private int quantidade;
	private Produto produto;
	ItemPedido(Produto produto, int quantidade)
	{
		this.setQuantidade(quantidade);
		return;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		Pedido.this.addItem(produto);
		
		
	}
	public Produto getProduto() {
		// TODO Auto-generated method stub
		return produto;

	}
	

}
