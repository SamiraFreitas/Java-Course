package exercicio05;

import java.util.ArrayList;

public class Resultado 
{
	private String nomeEspecie ; // nome da especie
	private int quantidade ; // quantidade de animais da especie
	
	public Resultado() {
	}
	public Resultado ( String nomeEspecie , int quantidade ) {
		 this.nomeEspecie = nomeEspecie ;
		 this.quantidade = quantidade ;
		 }
		 public String getNomeEspecie () {
		 return nomeEspecie ;
		 }
		 public int getQuantidade () {
		 return quantidade ;
		 }
		 public Resultado metodo(ArrayList<Animal> completo, String nomeEspecie)
		 {	
			Ferramentass f = new Ferramentass();
			completo=f.filtraEspecie(completo, nomeEspecie);
			this.nomeEspecie=nomeEspecie;
			this.quantidade=completo.size();
			return (this);
		 }
		@Override
		public String toString() {
			return "Resultado [nomeEspecie=" + this.getNomeEspecie() + ", quantidade=" + quantidade + "]";
		}
		 

}
