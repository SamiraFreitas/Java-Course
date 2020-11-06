package exercicio02;

import java.util.Scanner;

public class Teste
{
	public static void main (String[] args)
	{	
		Scanner entrada = new Scanner(System.in);
		String ler , a, b;
		String ler1, a1, b1;
		int operadorSoma, operadorSub, numeroIma;
		int operador, x=0, x2=0, y=0, y2=0; 
		
		System.out.println("Digite qual a operacao ira realizar");
		System.out.println("0=SOMA\n1=SUBTRAÇÃO\n2=MULTIPLICAÇÃO\n3=DIVISÃO\n");
		operador=entrada.nextInt();
		
		System.out.println("Digite o primeiro numero imaginario\n");
		ler= entrada.next();
		operadorSoma= ler.indexOf("+");
		operadorSub= ler.indexOf("-");
		numeroIma= ler.indexOf("i");
		
		System.out.println("Digite o segundo numero imaginario\n");
		ler1=entrada.next();
		operadorSoma= ler.indexOf("+");
		operadorSub= ler.indexOf("-");
		numeroIma= ler.indexOf("i");
		if(operadorSoma==1)
		{
			a = ler.substring(0, operadorSoma);
			b = ler.substring(operadorSoma, numeroIma);
			x = Integer.valueOf(a).intValue();
			y = Integer.valueOf(b).intValue();
		}
		else if(operadorSub==1) 
		{
			a = ler.substring(0, operadorSub);
			b = ler.substring(operadorSub, numeroIma);
			x = Integer.valueOf(a).intValue();
			y = Integer.valueOf(b).intValue();
		}
		if(operadorSoma==1)
		{
			a1 = ler1.substring(0, operadorSoma);
			b1 = ler1.substring(operadorSoma, numeroIma);
			x2 = Integer.valueOf(a1).intValue();
			y2 = Integer.valueOf(b1).intValue();
		}
		else if(operadorSub==1) 
		{
			a1 = ler1.substring(0, operadorSub);
			b1 = ler1.substring(operadorSub, numeroIma);
			x2 = Integer.valueOf(a1).intValue();
			y2 = Integer.valueOf(b1).intValue();
		}
		CalculadoraImaginaria.calculandonaMoral(operador, x, y, x2, y2);
	}

}