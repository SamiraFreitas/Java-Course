package exercicio01;

import java.util.Scanner ; 
public class Main 
{
	public static void main (String [] args )
	
	{	
		System.out.println("Insira o tamanho do vetor");
		Scanner ler = new Scanner(System.in);
		int n; 
		n = ler.nextInt();
		float vet[]= new float [n];
		for(int i= 0; i < vet.length; i++)
		{
			System.out.println("Insira o valor da posicao " + i + " do vetor:");
			vet[i]=ler.nextFloat();
		}	
		int a =negativos(vet);
		System.out.println(a);
	}

public static int negativos(float vet[ ])
{   
	int n=0;
	for(int i=0; i < vet.length ; i++)
	{
		if(vet[i]<0)
		{
			n++;
		} 
	}
	return n;
}
}