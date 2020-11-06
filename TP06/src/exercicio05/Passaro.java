package exercicio05;

public class Passaro implements Animal
{
	
	public Passaro(String nome, String nomeEspecie) {
		this.nome = nome;
		this.nomeEspecie = nomeEspecie;
	}

	private String nome;
	private String nomeEspecie;
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
