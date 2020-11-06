package exercicio05;

import java.util.Scanner;

public class IngressoVip extends Ingresso
{
	private float valoradd; 
	private float total;
	
	IngressoVip(float valorIngresso, float valoradd)
	{
		super(valorIngresso);
		this.valoradd=valoradd;
		this.total=valorIngresso+valoradd;
	}
	public float total()
	{
		return total;
	}

}
