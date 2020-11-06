package exercicio01;

import java.util.ArrayList;

public class Escola {

	public static Escola instance;
	public ArrayList<Funcionario> funcionarios = new ArrayList();
	public ArrayList<Aluno> alunos = new ArrayList();

	public Escola() {
	}

	public static Escola constroi() {

		if (instance == null) {
			return instance = new Escola();
		}
		return instance;
	}

	public void start() {

		Aluno aluno1 = new Aluno("a1", "Samira", 200.0, "9° serie");
		Aluno aluno2 = new Aluno("a2", "Pedro", 0.0, "1° ano");
		Aluno aluno3 = new Aluno("a3", "Daniel", 400.0, "3° ano");
		Aluno aluno4 = new Aluno("a4", "Lucas", 100.0, "8° serie");

		Funcionario funcionario1 = new Funcionario("f1", "Felipe", "Professor de Matematica", 3000.0);
		Funcionario funcionario2 = new Funcionario("f2", "Leila", "Professora de Português", 3000.0);
		Funcionario funcionario3 = new Funcionario("f3", "Ivânia", "Diretora", 5000.0);
		Funcionario funcionario4 = new Funcionario("f4", "Marcos", "supervisor", 2000.0);

		this.instance.alunos.add(aluno1);
		this.instance.alunos.add(aluno2);
		this.instance.alunos.add(aluno3);
		this.instance.alunos.add(aluno4);

		this.instance.funcionarios.add(funcionario1);
		this.instance.funcionarios.add(funcionario2);
		this.instance.funcionarios.add(funcionario3);
		this.instance.funcionarios.add(funcionario4);

		System.out.println("Escola Criada e Iniciada !!!\n");
	}

	public void printAll() {

		System.out.println("ESCOLA:\n");

		for (int i = 0; i < this.instance.alunos.size(); i++) {
			System.out.println(this.instance.alunos.get(i).toString());
		}

		for (int i = 0; i < this.instance.funcionarios.size(); i++) {
			System.out.println(this.instance.funcionarios.get(i).toString());
		}
	}
}
