package exercicio01;

public class Funcionario extends Pessoa {

	public String cargo;
	public Double salario;

	public Funcionario(String id, String nome, String cargo, Double salario) {
		super(id, nome);
		this.cargo = cargo;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario:" + "\nid: " + super.id + "\nNome: " + super.nome + "\nCargo=" + cargo + "\nSalario: "
				+ salario + "\n\n";
	}
}
