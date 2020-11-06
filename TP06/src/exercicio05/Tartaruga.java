package exercicio05;

public class Tartaruga implements Animal {

	private String nome;
	private String nomeEspecie;
	
	public Tartaruga(String nome, String nomeEspecie) {

		this.nome = nome;
		this.nomeEspecie = nomeEspecie;
	}

	@Override
	public String getNomeEspecie() {
		// TODO Auto-generated method stub
		return this.nomeEspecie;
	}

	@Override
	public String getNomeAnimal() {
		// TODO Auto-generated method stub
		return this.nome;
	}
}
