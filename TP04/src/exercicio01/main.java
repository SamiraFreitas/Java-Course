package exercicio01;

public class main
{
	public static void main(String[] args) 
	{
		 Universidade Princeton= new Universidade("Princeton", "Nova Jersey", "Estados Unidos da América");
		 Universidade Cambridge= new Universidade("Cambridge", "Inglaterra", " ");
		 
		 Pessoa AlbertEinstein = new Pessoa("Albert Einstein", "fisica",14,3,1879);
		 Pessoa IsacNewton = new Pessoa("Isac Newton", "matematica",4,1,1643);
		 AlbertEinstein.setUniversidade(Princeton);
		 IsacNewton.setUniversidade(Cambridge);	 
		 /*AlbertEinstein.setDia(14);
		 AlbertEinstein.setMes(03);
		 AlbertEinstein.setAno(1879);*/
		 AlbertEinstein.getUniversidade();
		 IsacNewton.getUniversidade();
		 /*IsacNewton.setDia(4);
		 IsacNewton.setMes(01);
		 IsacNewton.setAno(1643);*/
		 Pessoa[] listadeAlunos = Princeton.getListadAlunos();
		 Princeton.imprime(listadeAlunos);
		 listadeAlunos = Cambridge.getListadAlunos();
		 Cambridge.imprime(listadeAlunos); 
	 }
}
