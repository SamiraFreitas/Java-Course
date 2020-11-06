package exercicio05;

import java.util.ArrayList;

public interface Ferramentas 
{
	public ArrayList<Animal> filtraEspecie ( ArrayList<Animal> completo , String especieFiltrar );
	public ArrayList<String> classificaEspecies ( ArrayList<Animal> completo ) ;
}
