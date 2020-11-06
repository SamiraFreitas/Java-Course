package exercicio04;

public class Animal 
{
	private String nome;
	private String raça;
	
	Animal()
	{
		System.out.println("Um animal foi criado\n");
	}
	Animal(String nome)
	{
		this.nome=nome;
	}
	
	public void Caminha()
	{
		System.out.println("ESTA CAMINHANDO\n");
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	@Override
	public String toString() 
	{
		return "Animal [nome=" + nome + ", raça=" + raça + "]";
	}
	
}
