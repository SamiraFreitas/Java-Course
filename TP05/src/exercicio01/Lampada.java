package exercicio01;
import java.util.Scanner;
import java.util.ArrayList;
public class Lampada 
{
	private int valorAjuste;
	private int cont=0;
	private int watss; 
	Scanner entrada = new Scanner(System.in);
	public static ArrayList<Lampada> lampadas = new ArrayList();
	
	public Lampada (int valorAjuste, int watss)
	{
		this.valorAjuste=valorAjuste;
		this.watss=watss;
		lampadas.add(this);
	}
	public Lampada (int valorAjuste)
	{
		this.valorAjuste=valorAjuste;
		this.watss=60;
		lampadas.add(this);
	}
	public void qtdLampadas()
	{
		System.out.println("Existem: " +lampadas.size()+ " lampadas");
		
	}
	public void Luminosidade ()
	{	

		if(valorAjuste <= 0 )
		{
			System.out.println("A lampada esta APAGADA\n");
			
		}
		else if (valorAjuste >= 100)
		{
			System.out.println("A lampada esta ACESA\n");
			estaLigada();
		}
		else 
		{
			System.out.println("A lampada esta MEIA ACESA\n");
			estaLigada();
		}	
	}
	public boolean estaLigada()
	{
		if(this.valorAjuste > 0)
		{	
			cont ++;
			return true;
			
		}
		return false;
	}
	public void ImprimeCont()
	{
		System.out.println("A lampada foi acesa: " +cont+ " vezes");
	}
	public boolean eEconomica()
	{	
		if(this.watss < 40)
	{
		return true;
	}
		return false;
		
	}
}
