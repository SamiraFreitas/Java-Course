package exercicio01;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class Nomes 
{
	Set<String> nomes = new HashSet<String>();
	public void adiciona()
	{	
		String aux; 
		do {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o nome\n");
		aux = entrada.next();
		if(!aux.equals("n"))
		this.nomes.add(aux);
			
		} while (!aux.equals("n"));
	}
	public void Contem ()
	{	
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o nome para verificar se esta contido no Set\n");
		String nome = entrada.next();
		if(nomes.contains(nome))
		{
			System.out.println("Esse nome esta incluido no Set de nomes\n");
		} 
		else
		{
			System.out.println("Esse nome não esta incluido no Set de nomes\n");
		}
	}
	public void Remove ()
	{	
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o nome a ser removido\n");
		String nome = entrada.next();
		if(nomes.contains(nome))
		{
			nomes.remove(nome);
			System.out.println("O nome foi removido\n");
		} 
		else
		{
			System.out.println("Não existe esse nome\n");
		}
	}
	public void removeTudo ()
	{	
		Scanner entrada = new Scanner (System.in);
	    System.out.println("Digite os nomes a serem revomidos\n");
	    String nome = entrada.next();
		if(nomes.contains(nome))
		{
			nomes.clear();
			System.out.println("Os nomes foram removido\n");
		} 
		else
		{
			System.out.println("Esse nome não esta incluso por isso não pode ser excluido\n");
		}
	}
	@Override
	public String toString() {
		return "Nomes [nomes=" + nomes + "]";
	}
	
	
}