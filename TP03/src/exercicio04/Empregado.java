package exercicio04;

public class Empregado
{
	private String nome; 
	private double salario;
	private double horasTrabalhadas;
	private double aumentoSalario;
	private static int numeroEmpregado=0;
	
	public Empregado ()
	{
		setNome(this.nome);
		setSalario(this.salario);
		this.horasTrabalhadas=8;
		numeroEmpregado++;
		
	}
	public static void numeroEmpregado() 
	{
		System.out.println("Numero de Empregados: " +numeroEmpregado); 
	}
	private void setNome(String nome)
	{
	// TODO Auto-generated method stub
	this.nome=nome;
    }
	private void setSalario(double salario) 
	{
		// TODO Auto-generated method stub
		this.salario=salario;
	}
	private String getNome()
	{
		return nome;
	}
	
	private double getSalario()
	{
		return salario;
	}
	private double gethorasTrabalhadas ()
	{
		return horasTrabalhadas;
	}
	public void horasTrabalhadas(double horasTrabalhadas)
	{
		horasTrabalhadas(horasTrabalhadas);
		
	}
	
	public void printInfo ()
	{
		System.out.println("Nome:"+getNome()+ "\nSalário"+getSalario()+ "\nHoras Trabalhadas"+gethorasTrabalhadas());
	}
	
	public void promocao(double aumento)
	{
		this.aumentoSalario= (aumento * this.salario)/100;
		this.salario=this.aumentoSalario+this.salario;
	}
	public void adicionaGratificacao (double aux)
	{
		if(gethorasTrabalhadas () > 6)
		{
			this.salario= this.salario+ aux;
		}
	}
	
}
