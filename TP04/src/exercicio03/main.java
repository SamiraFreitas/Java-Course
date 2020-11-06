package exercicio03;

public class main 
{
	public static void main ( String[] args )
	{
		Produto cocaCola= new Produto (01, (float) 10.0, "Refrigerante");
		ItemPedido Coca = new ItemPedido(cocaCola, 2);
		Pedido numero1= new Pedido();
		float lista= cocaCola.getValor();
	}
}
