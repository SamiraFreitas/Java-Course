package exercicio02;

import java.util.Scanner;
public class Matriz 
{
	private int matriz[][];
	private int linha, coluna;


	public Matriz( int linha, int coluna)
	{
		setLinha(linha);
		setColuna(coluna);
		int matriz[][]= new int [linha][coluna];
		this.matriz=matriz;
	}
	private void setColuna(int coluna2) {
		// TODO Auto-generated method stub
		this.coluna=coluna;
	}


	private void setLinha(int linha2) {
		// TODO Auto-generated method stub
		this.linha=linha;
	}
	public void getLinhas()
	{
		System.out.println("Numero de linhas\n"+ getLinha() );
	}
	public void getColunas()
	{
		System.out.println("Numero de linhas\n"+ getColuna() );
	}
	private int getLinha() {
		// TODO Auto-generated method stub
		return linha;
	}
	private int getColuna() {
		// TODO Auto-generated method stub
		return coluna;
	}
	public void preencheMatriz()
	{
		Scanner entrada= new Scanner (System.in);
		for(int i =0; i < getLinha(); i++) {
			for(int j=0; j< getColuna(); j++)
			{
				System.out.println("Linha "+i+"Coluna "+j);
				this.matriz[i][j]=entrada.nextInt();
			}
		}
	}
	public void imprimeMatriz()
	{
		for(int i =0; i < getLinha(); i++) {
			for(int j=0; j< getColuna(); j++)
			{
				System.out.println("["+matriz[i][j]+"]");
				
			}
			System.out.println("\n");}
	}
		public void editaMatriz(int linha, int coluna)
		{
			for(int i =0; i < getLinha(); i++) {
				for(int j=0; j< getColuna(); j++)
				{
					Scanner entrada= new Scanner (System.in);
					System.out.println("O numero a ser editado na linha:"+ (linha+1) + "O numrero a ser editado na coluna:"+(coluna+1));
					this.matriz[linha][coluna]=entrada.nextInt();
					
				}
		}}
			public void transporMatriz()
			{
				if(getLinha()== getColuna())
				{
					int auxiliar;
					for(int i=0; i < getLinha();i++) {
						for(int j=i+1; j < getColuna(); j++)
						{
							if(j!= j)
							{
								auxiliar=this.matriz[i][j];
								this.matriz[i][j]=this.matriz[i][j];
								this.matriz[j][i]=auxiliar; 
							}
						}
					}
				}	else
					{
						System.out.println("A MATRIZ NAO E QUADRADA\n");
						
					}			
							
			}
}
