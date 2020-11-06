package exercicio02;

public class CalculadoraImaginaria 
{
	public static int resultado, resultado2, resu;
	
	public static void calculandonaMoral(int operador, int x, int y, int x2, int y2)
	{
		if(operador==0)
		{
			resultado=x+x2;
			resultado2= y +y2;
			System.out.println("O resultado da soma e:" + resultado+ "+" + resultado2 + "i");
			
		}
		else if(operador==1)
		{
			resultado=x-x2;
			resultado2= y-y2;
			System.out.println("O resultado da subtração e:" + resultado+ "-" + resultado2);
		}
		else if(operador==2)
		{
			resultado=((x*x2)+(y*y2));
			resultado2= ((x*x2)+(y*y2));
			System.out.println("O resultado da multiplicação e:" + resultado+ "*" + resultado2);
		}
		else if(operador==3)
		{	
			resu=((x*x2)+(y*-y2));
			resultado=((x*-y)+(y*x2));
			resultado2=((x2*x2)-(y2*y2));
			if(resultado < 0) 
			{
			System.out.println("O resultado da divisao e:" + resu+ "/" + resultado+ " - " +resultado2+ "i");
			}
			else 
			{
				System.out.println("O resultado da divisao e:" + resu+ "/" + resultado+ " + " +resultado2+ "i");

			}
		}
		
	}
	
}

