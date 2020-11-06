package exercicio05;

public class ClienteMain
{
	public static void main (String [] args)
	{
		FabricadeCarros fabrica = new FabricaFiat();
		CarroSedan carro = fabrica.criarCarroSdedan();
		CarroPopular carro2 = fabrica.criarCarroPopular();
		carro.exibirCarroSedan();
		System.out.println();
		carro2.exibirCarroPopular();
		System.out.println();
		
		fabrica = new FabricaFord();
		carro = fabrica.criarCarroSdedan();
		carro.exibirCarroSedan();
		System.out.println();
		carro2 = fabrica.criarCarroPopular();
		carro2.exibirCarroPopular();
		System.out.println();
		
	}
}
