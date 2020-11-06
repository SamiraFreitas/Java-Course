package exercicio01;

public abstract class Pessoa {

	public String id;
	public String nome;

	public Pessoa(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "PESSOA:" + "\nid: " + id + "\nnome: " + nome;
	}
}
