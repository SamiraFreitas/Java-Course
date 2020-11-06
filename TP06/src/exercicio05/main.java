package exercicio05;

import java.util.ArrayList;

public class main
{
	public static void main (String[] args) 
	 {	
		
		ArrayList<Animal> vetoranimais = new ArrayList();
		Cachorro animal01= new Cachorro("Toni", "Mamifero");
		Tartaruga animal02= new Tartaruga("Lakshimi", "Reptil");
		Passaro animal03= new Passaro("Pipi", "Ave");
		vetoranimais.add(animal01);
		vetoranimais.add(animal02);
		vetoranimais.add(animal03);
		Resultado x  = new Resultado();
		x.metodo(vetoranimais, "Ave");
		System.out.println(x.toString());
		x.metodo(vetoranimais, "Reptil");
		System.out.println(x.toString());
		x.metodo(vetoranimais, "Mamifero");
		System.out.println(x.toString());
		 
	 }
}
