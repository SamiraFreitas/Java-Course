package exercicio03;

public class Empresa
{
	private String nomeEmpresa;
	private String cidade;
	private String cep;
	private String telefone;
	public String getNomeEmpresa() 
	{
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	Empresa()
	{
		System.out.println("Uma empresa foi criada:\n");
		
	}
	Empresa(String nome, String cidade, String cep, String telefone)
	{
		this.nomeEmpresa=nome;
		this.cidade=cidade;
		this.cep=cep;
		this.telefone=telefone;
	}
	@Override
	public String toString() 
	{
		return "Empresa [nomeEmpresa=" + nomeEmpresa + ", cidade=" + cidade + ", cep=" + cep + ", telefone=" + telefone
				+ "]";
	}
	
}
