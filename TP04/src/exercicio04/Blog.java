package exercicio04;

public class Blog 
{
	private Postagem[] postagens= new Postagem[100];
	int cont;
	
	Blog (Postagem[] postagens)
	{
		this.setPostagens(postagens);
	}

	public Postagem[] getPostagens() {
		return postagens;
	}

	public void setPostagens(Postagem[] postagens) {
		this.postagens = postagens;
	}
	
	public void adicionarPostagens(Postagem postagem)
	{
		postagens[cont]=postagem;
		cont++;
		
	}
	public void publicarPostagens(Postagem postagem)
	{
		
	}
	public void listarPostagens()
	{
		
	}
	public void listarTodasAsPostagens() 
	{
		System.out.println("Mostrando a lista de todas as postagens:\n");
		for(int i =0; i < postagens.length; i++)
		{
			if(postagens[i]!= null) 
			{
				System.out.println("");
			}
		}
		
	}
	public void apagarPostagens(Postagem postagem)
	{
		
	}
}
