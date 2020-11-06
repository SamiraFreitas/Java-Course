package exercicio01;
public class teste 
{
	public static void main (String[] args)
	{
		Lampada x = new Lampada(100);
		Lampada y= new Lampada(0, 30);
		
		x.qtdLampadas();
		x.Luminosidade();
		System.out.println("Esta ligada:" +x.estaLigada());
		x.ImprimeCont();
		System.out.println("A lampada e economica: "+x.eEconomica());
		
		y.qtdLampadas();
		y.Luminosidade();
		System.out.println("Esta ligada:" +y.estaLigada());
		y.ImprimeCont();
		System.out.println("A lampada e economica: "+y.eEconomica());
	}
}
