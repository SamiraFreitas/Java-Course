package exercicio03;

public class Main 
{	
	public static void main (String [] args) {
	FormaGeomtricaFactory forma = new FormaGeomtricaFactory();
	forma.criarForma("Circulo").desenhar();
	forma.criarForma("Triangulo").desenhar();
	forma.criarForma("Quadrado").desenhar();
	
}
}
