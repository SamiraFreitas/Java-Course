package exercicio04;

import java.util.Scanner;

public  class   Midia implements iMidia
{
	private String nome;
	private int codigo; 
	private double preco;
	Midia(){};
	Midia(int codigo, double preco, String nome)
	{
		this.codigo=codigo;
		this.preco=preco;
		this.nome=nome;
	}
	public String getTipo(String tipo)
	{
		return tipo;
	}
	public void insereDados()
	{	
		System.out.println("Digite o nome\n");
		Scanner entrada = new Scanner (System.in);
		String nome = entrada.next();
		this.setNome(nome);
		System.out.println("Digite o codigo\n");
		int codigo = entrada.nextInt();
		this.setCodigo(codigo);
		System.out.println("Digite o preco\n");
		double preco = entrada.nextDouble();
		this.setPreco(preco);

	}
	public String getDetalhes() {
		return "Midia [nome=" + this.getNome() + ", codigo=" + this.getCodigo() + ", preco=" + this.getPreco() + "]";
	}
	public void printDados()
	{
		System.out.println(getDetalhes());
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco(){
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
