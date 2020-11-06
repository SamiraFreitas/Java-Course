package exercicio05;

import java.util.Scanner;

public class teste
{
	public static void main (String [] args)
	{
		System.out.println("Insira para escolher:\n1=NORMAL\n2=VIP\n");
		Scanner entrada = new Scanner(System.in);
		int aux = entrada.nextInt(); 
		if(aux==1)
		{
			System.out.println("SEU INGRESSO E NORMAL, OBRIGADA PELA COMPRA\n");
			IngressoNormal x=  new IngressoNormal(150);
			System.out.println("O valor do ingresso e: "+x.getValorIngresso());
		}
		else if(aux==2)
		{
			System.out.println("SEU INGRESSO E VIP\n");
			System.out.println("AGORA SELECIONE:\n1=CAMAROTE SUPERIOR\n2=CAMAROTE INFERIOR\n");
			aux = entrada.nextInt(); 
			if(aux==1)
			{
				System.out.println("SEU INGRESSO E CAMAROTE SUPERIOR\n");
				CamaroteSuperior a=  new CamaroteSuperior(150, 150, "Laje");
				System.out.println("O valor do ingresso e: " +a.total());
			}
			else 
			{
				System.out.println("SEU INGRESSO E CAMAROTE INFERIOR\n");
				CamaroteInferior b=  new CamaroteInferior(150, 75, "Laje");
				System.out.println("O valor do ingresso e: " +b.total());
			}
			
		}
	}
}
