package exercicio03;

public class Recursão
{
	public static int Rec(int n)
	  {
		if(n<2)
		{
			return n; 
		}
		else 
		{
			return 2 * Rec(n-1) + 3 * Rec (n-2);
		}
		
	  } 
}
