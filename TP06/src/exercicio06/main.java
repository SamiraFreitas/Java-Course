package exercicio06;

public class main 
{
	public static void main (String [] args)
	{
		Automovel carro= new Automovel (45);
		carro.ligandoCarro();
		carro.acelerar(20);
		carro.trocarOleo(2);
		carro.parar();
		
		Bicicleta x= new Bicicleta (10);
		x.pedalando();
		x.acelerar(20);
		x.parar();
	}

}
