package exercicio04;

public class Animal 
{
	private String nome;
	private String ra�a;
	
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
	public String getRa�a() {
		return ra�a;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	@Override
	public String toString() 
	{
		return "Animal [nome=" + nome + ", ra�a=" + ra�a + "]";
	}
	
}
