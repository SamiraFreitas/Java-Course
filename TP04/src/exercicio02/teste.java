package exercicio02;

public class teste 
{	

	public static void main (String[] args)
	{
	Departamento Desci = new Departamento("Desci", "Rafael Alexandre", "Weverton Costa Peixoto");
	Universidade Ufop= new Universidade("Ufop", "Jo�o Monlevade", "Brasil", Desci, "Departamento de Computa��o e Sistema", "Rafael Alexandre","Weverton Costa Peixoto" );
	Pessoa samira = new Pessoa ("Samira Resende Freitas", "Aluna", Ufop, Desci);
	samira.setUniversidade(Ufop);
	samira.setDepartamento(Desci);
	Pessoa[] listadeAlunos = Ufop.getListadAlunos();
	Ufop.imprime(listadeAlunos);
	}

}
