package exercicio04;

import java.util.Scanner;

public class DVD extends Midia
{
	private int faixas; 
	DVD()
	{
		
	}
	
	DVD(int codigo, double preco, String nome, int f){
		super(codigo, preco, nome);
		this.setFaixas(f);
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	@Override
	public void insereDados()
	{	
		super.insereDados();
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o numero de faixas\n");
		int faixas = entrada.nextInt();
		this.setFaixas(faixas);
	}
	@Override
	public String getDetalhes() {
		System.out.println("A capa do dvd esta sendo exibida\n");
		String x =super.getDetalhes();
		return (x + "Faixas: " +this.getFaixas());
	
	}
	@Override
	public void printDados()
	{
		System.out.println(getDetalhes());
	}
	
	public String getTipo()
	{	
		 return super.getTipo("DVD");
	}
	
	public void inserirDados() 
	{
		
	}
}
