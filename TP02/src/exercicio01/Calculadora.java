package exercicio01;

import java.util.Scanner;

public class Calculadora
{	
	public static void Calcular ()
	{
		
		double numero1=0, numero2=0, resultado=0;
		int aux;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Criando a calculadora");
		System.out.println("Informe o primeiro valor:");
		numero1= entrada.nextDouble();
		System.out.println("Informe o segundo valor:");
		numero2=entrada.nextDouble();
		System.out.println("Selecione a operacao desejada\n");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRACAO");
		System.out.println("3 - MULTIPLICACAO");
		System.out.println("4 - DIVISAO");
		aux= entrada.nextInt(); 
		switch (aux)
		{
		case 1: 
			resultado=numero1+numero2;
			System.out.println("A soma dos numeros e: "+resultado);
			break; 
		case 2:
			resultado=numero1-numero2;
			System.out.println("A subtracao dos numeros e :" +resultado);
			break;
		case 3:
			resultado=numero1*numero2;
			System.out.println("A multiplicacao dos numeros e :" +resultado);
			break;
		case 4:
			resultado=numero1/numero2;
			System.out.println("A divisao dos numeros e :" +resultado);
			break;
			default :
			System.out.println("Informe uma opçao valida");			
		
	}}}