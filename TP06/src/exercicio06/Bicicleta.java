package exercicio06;

public class Bicicleta extends Veiculo {
	
	private float velocidadeInicial=0;
	private boolean estaligado=false;
	
	
	public Bicicleta(float velocidadeInicial) {
		this.velocidadeInicial = velocidadeInicial;

	}
	@Override
	public float acelerar(float velocidade) {
		if(velocidadeInicial != velocidade)
		{
			velocidadeInicial= velocidadeInicial+ velocidade; 
			System.out.println("A velocidade atual e:"+this.velocidadeInicial);
		}
		return velocidadeInicial;
	}
	public boolean pedalando()
	{
		estaligado=true;
		return estaligado;
	}

	@Override
	public void parar() {
		if(estaligado!= false)
		{
			System.out.println("Voce parou de pedalar a bicicleta parou!");
		}

	}

}
