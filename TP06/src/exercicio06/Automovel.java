package exercicio06;

public class Automovel extends Veiculo
{
	
	private float velocidadeInicial=0;
	private boolean estaligado=false;
	
	public Automovel(float velocidadeInicial) {
		System.out.println("Um automovel foi criado\n");
		this.velocidadeInicial = velocidadeInicial;

	}

	@Override
	public float acelerar(float velocidade) {
		if(velocidadeInicial != velocidade)
		{
			velocidadeInicial+= velocidade; 
			System.out.println("A velocidade atual e:"+this.velocidadeInicial);
		}
		return velocidadeInicial;
	}

	public boolean ligandoCarro()
	{
		estaligado=true;
		return estaligado;
	}

	@Override
	public void parar() {
		if(estaligado!= false)
		{
			System.out.println("O carro parou!");
		}

	}
	public void trocarOleo(float litros)
	{
		System.out.println("O oleo foi trocado");
	}


}
