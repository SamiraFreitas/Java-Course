package exercicio05;

import java.util.ArrayList;

public class Ferramentass implements Ferramentas {

	@Override
	public ArrayList<Animal> filtraEspecie(ArrayList<Animal> completo, String especieFiltrar) {
		ArrayList<Animal> vetoranimais = new ArrayList();
		for(int i=0; i < completo.size(); i++ )
		{	
			if(completo.get(i).getNomeEspecie ()== especieFiltrar)
		{
			vetoranimais.add(completo.get(i));
		}
		}
		return vetoranimais;
	}

	@Override
	public ArrayList<String> classificaEspecies(ArrayList<Animal> completo) {
		ArrayList<String> vetorespecie = new ArrayList();
		for(int i=0; i < completo.size(); i++ )
		{	for(int j=0; j < completo.size(); j++ )
		{
			if(!vetorespecie.get(i).equals(completo.get(j).getNomeEspecie()))
		{
			vetorespecie.add(completo.get(i).getNomeEspecie());
		}}
		}
		return vetorespecie;
	}

	
}
