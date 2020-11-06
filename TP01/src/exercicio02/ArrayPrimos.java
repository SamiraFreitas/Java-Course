package exercicio02;

import java.util.Scanner;

public class ArrayPrimos
{
	public static void main(String[] args)

	{
		int n;
		System.out.println("Insira o tamanho do vetor");
		Scanner ler = new Scanner(System.in);
		n = ler.nextInt();
		int vet[] = new int[n];

		ArrayPrimos.lendoVetor(vet);
		ArrayPrimos.imprimeVetor(vet);
		ArrayPrimos.vetorPrimo(vet);

	}
	public static void lendoVetor(int vet[])
	{
		for (int i = 0; i < vet.length; i++) 
		{
			System.out.println("Insira o valor da posicao " + i + " do vetor:");
			Scanner ler = new Scanner(System.in);
			vet[i] = ler.nextInt();
		}
		
	}
	public static void imprimeVetor(int vet[])
	{
		for(int k=0; k< vet.length; k++)
		{
			System.out.println("O valor do vetor na posicao " + k + " e o numero " + vet[k]);
		}
	}

	public static void vetorPrimo(int vet[])
	{	
		boolean aux;
		for(int i=0; i<vet.length; i++)
		{	
			aux=true; 
			if(vet[i]== 1)
			{   
				aux=false; 
			}
			if(aux)
			{
				if((vet[i]%2==0) && (vet[i]!= 2))
				{
					aux=false;
				}
			}
			if(aux)
			{
				for(int j=3; j <= (vet[i]/2); j++)
				{
					if(vet[i] % j==0)
					{
						aux=false;
						break;
					}
				}
			} 
			if(aux)
			{
				System.out.println("O numero " +vet[i]+  " é um  numero primo");
			}}
}}