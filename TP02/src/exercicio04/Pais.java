package exercicio04;

public class Pais 
{
	private String codigoIso;
	private String nome; 
	private double populacao;
	private double dimensao;
	Pais[] vizinhos; 
    int qtdevizinhos;
	public String getCodigoIso() 
	{
		return codigoIso;
	}
	public void setCodigoIso(String codigoIso) 
	{
		this.codigoIso = codigoIso;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public double getPopulacao() 
	{
		return populacao;
	}
	public void setPopulacao(double populacao) 
	{
		this.populacao = populacao;
	}

	public double getDimensao()
	{
		return dimensao;
	}
	public void setDimensao(double dimensao) 
	{
		this.dimensao = dimensao;
	}
	 public void addvizinho(Pais vizinho)
	 {
	        this.vizinhos[qtdevizinhos] = vizinho; 
	        this.qtdevizinhos++;

	 }
	 public boolean ehVizinho(Pais pais)
	 {
	        for(int iCount = 0;  iCount < this.vizinhos.length; iCount++){
	        if((this.vizinhos[iCount] != null) && this.vizinhos[iCount].equals(pais))
	               return true; 
	            }

	        return false;

	    }
	 public Pais[] getVizinhosComuns(Pais outro)
	 {
	        int qtdeVizinhosComuns = 0;
	        Pais[] vizinhosComuns = new Pais[40];
	        for(int i = 0; i < this.vizinhos.length; i++)
	          if(this.vizinhos[i] != null && outro.ehVizinho(this.vizinhos[i]))
	            vizinhosComuns[qtdeVizinhosComuns++] = this.vizinhos[i];
	        return vizinhosComuns;

	    }
	public void Igualdade(Pais nome1, Pais nome2)
    {
        //Comparação de dois objetos
        if(nome1.getCodigoIso().equals(nome2.getCodigoIso()))
        {
            System.out.println(" Paises iguais!");
        }
        else
        {
            System.out.println("Paises diferentes!");
        }

    }
		 public double Densidade()
		    {
		        if ((this.getPopulacao() == 0) || (this.getDimensao() == 0))
		            return 0;

		        else
		        return this.getPopulacao()/this.getDimensao();
		    }

}
