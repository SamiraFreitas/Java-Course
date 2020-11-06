package exercicio01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Armazem 
{
	Set<Produto> produtos = new HashSet<Produto>();
	
	public void adiciona()
	{	
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o nome do produto\n");
		String nome = entrada.next();
		System.out.println("Digite o codigo do produto\n");
		String codigoDeBarras = entrada.next();
		System.out.println("Digite o preco do produto\n");
		double preco = entrada.nextDouble();
		Produto produto = new Produto (nome, codigoDeBarras, preco);
		int cont =0;
		if(!produtos.isEmpty())
		{
			Iterator<Produto> it = produtos.iterator();
			
			while (it.hasNext())
			{
				if(!it.next().codigoDeBarras.equals(produto.codigoDeBarras))
				{
					cont++;
				}
			}
			
			if(produtos.size()== cont)
			{
				produtos.add(produto);
			}
			else 
			{
				System.out.println("Este produto ja foi cadastrado\n!");
			}
		}
		else 
		{
			produtos.add(produto);
		}
		
	}

	@Override
	public String toString() {
		return "Armazem [produtos=" + produtos.toString() + "]";
	}


	
}
