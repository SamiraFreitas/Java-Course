package exercicio02;

public class Departamento 
{	
	private String nomeDepartamento;
	private String chefeDepartamento;
	private String secretariaDepartamento;
	
	
	Departamento (String nomeDepartamento, String chefeDepartamento, String secretariaDepartamento)
	{
		this.nomeDepartamento= nomeDepartamento;
		this.chefeDepartamento= chefeDepartamento;
		this.secretariaDepartamento=secretariaDepartamento;
	}

	public String getNome() {
		return nomeDepartamento;
	}

	public void setNome(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	public String getChefe() {
		return chefeDepartamento;
	}

	public void setChefe(String chefeDepartamento) {
		this.chefeDepartamento = chefeDepartamento;
	}
	public String getSecretaria() {
		return secretariaDepartamento;
	}

	public void setSecretaria(String secretariaDepartamento) {
		this.secretariaDepartamento=secretariaDepartamento;
	}
	
}
