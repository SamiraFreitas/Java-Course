package exercicio01;

public class Aluno extends Pessoa {

	public Double bolsa;
	public String serie;

	public Aluno(String id, String nome, Double bolsa, String serie) {
		super(id, nome);
		this.bolsa = bolsa;
		this.serie = serie;
	}

	@Override
	public String toString() {
		return "Aluno: " + "\nid: " + super.id + "\nNome: " + super.nome + "\nBolsa: " + bolsa + "\nSerie: " + serie
				+ "\n\n";
	}
}
