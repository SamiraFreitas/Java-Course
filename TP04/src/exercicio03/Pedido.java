package exercicio03;

public class Pedido 
{
	private float valorTotal;
	private ItemPedido [] lista;
	private int cont;
	
	Pedido()
	{
		this.lista= new ItemPedido[10];
	}
	public void addItem(Object produto)
	{	
		System.out.println("Um pedido foi adicionado\n");
		this.lista[cont]= (ItemPedido) produto;
		cont++;
	}
	public void valorTotal()
	{
		float soma = 0;
		for(ItemPedido itemPedido : lista)
		{
			soma += (itemPedido.getQuantidade() * itemPedido.getProduto().getValor());
		
		}
		
	}
}
