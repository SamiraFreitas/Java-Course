package exercicio05;

public class FabricaFord implements FabricadeCarros 
{

	@Override
	public CarroSedan criarCarroSdedan() {
		return new FiestaSedan ();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		// TODO Auto-generated method stub
		return new Fiesta();
	}
	
}
