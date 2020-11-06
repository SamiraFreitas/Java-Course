package exercicio05;

public class FabricaFiat implements FabricadeCarros {

	@Override
	public CarroSedan criarCarroSdedan() {
		return new Siena();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		
		return new Palio();
	}

}
