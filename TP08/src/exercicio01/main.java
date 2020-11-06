package exercicio01;

public class main {
	public static void main(String[] args) {

		Escola single1 = Escola.constroi();

		single1.start();
		single1.printAll();

		Escola single2 = Escola.constroi();

		single2.start();
		single2.printAll();

		if (single1 == single2) {
			System.out.println("As instancias são iguais!");
		}
	}
}