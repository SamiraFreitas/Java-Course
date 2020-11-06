package exercicio04;

import java.util.Scanner;

public class Matriz {

	private static long matricula;
	private static long codigo;
	private static int sexo;
	private static int cr;

	public static void lendoMatriz(long matriz[][]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				if (j == 0) {
					System.out.println("Matricula(aasccccnnn)");
					/* (aa - ano, s - semestre, ccc - codigo curso, nnn - matricula */
					matricula = sc.nextLong();
					matriz[i][j] = matricula;

				}
				if (j == 1) {
					String registration = String.valueOf(matricula);
					registration = registration.substring(3, 7);
					codigo = Long.parseLong(registration);
					matriz[i][j] = codigo;
				}

				if (j == 2) {
					System.out.println("Sexo 0 Mulher - 1 Homem:");
					sexo = sc.nextInt();
					matriz[i][j] = sexo;
				}

				if (j == 3) {
					System.out.println("CR:");
					cr = sc.nextInt();
					matriz[i][j] = cr;
				}

			}

		}

	}
	public static void imprimeMatriz(long matriz[][])
	{
		for(int i=0; i<matriz.length; i++)
		{
			for(int j=0; j < matriz.length; i++)
			{
				if(j == 0)
				{
					System.out.println("Matricula:" + matriz[i][j]);
					
				}
				if(j==1)
				{
					if(matriz[i][j]== 0)
					{
						System.out.println("Sexo: Feminino");
					}
					else 
					{
						System.out.println("Sexo: Masculino");
						
					}
				}
				if(j == 2)
				{
					System.out.println("Codigo:" +matriz[i][j]);
				}
				if(j== 3)
				{
					System.out.println("Cr:" + matriz[i][j]);
				}
			}
		}
	}
	public static void maiorCr(long matriz[][])
	{
		long maior=0; 
		int aux=0; 
		for(int a =0; a < matriz.length; a++)
		{
			if(matriz[a][1]==0)
			{
				if(matriz[a][3]> maior)
				{
					maior=matriz[a][3];
					aux=a;
				}
			}
			System.out.println("O Aluno com codigo:"+ matriz[aux][2]+"ganhou o premio com o maior cr de" +maior);
		}
	}
}
