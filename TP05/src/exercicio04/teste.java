package exercicio04;

public class teste 
{
	
	public static void main (String [] args) {
	Cachorro dog= new Cachorro("Belinha", "Vira-Lata");
	Gato cat= new Gato("Toni", "Persa");

	System.out.println(dog.toString());
	dog.Late();
	dog.Caminha();
	
	System.out.println(cat.toString());
	cat.Mia();
	cat.Caminha();
	
	
	}
}
