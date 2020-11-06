package exercicio02;

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Incremental inc = Incremental.constroi();
			System.out.println(inc.toString() + "\n");
			//PODE-SE OBSERVAR QUE ANTES DE USAR IMPLEMENTACAO 
			//PARA QUE A CLASSE SE TORNE SINGLE IMPRIMIA OS NUMEROS ATE 10,
			//MAS APOS A CLASSE SE TORNAR SINGLE SO CRIA UMA INSTANCIA  O NUMERO FICA FIXO EM 1.
		}
	}
}
