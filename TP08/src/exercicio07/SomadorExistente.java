package exercicio07;

public class SomadorExistente
{
	public int somaLista(int [] Lista)
	{
		int resultado = 0;
		for(int i : Lista) resultado +=i;
		return resultado; 
	}
}
