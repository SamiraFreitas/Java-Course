package exercicio03;

import java.util.Scanner;

public class fun��orecursiva
{
	public static void main (String [] args)
	{
		Scanner x= new Scanner (System.in);
		int n; 
		System.out.println("Digite o numero N");
		n= x.nextInt();
		
		for(int i =0; i <= n; i++)
		{
			System.out.println(Recurs�o.Rec(i)); 
		}
		
	}
}