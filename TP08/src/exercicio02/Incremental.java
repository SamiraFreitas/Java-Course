package exercicio02;

public class Incremental {

	public static Incremental instance;
	private static int count = 0;
	private int numero;

	public Incremental() {
		this.numero = ++count;
	}

	public static Incremental constroi() {
		if (instance == null) {
			return instance = new Incremental();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "Incremental:" + "\nNumero: " + numero;
	}
}
