package exercicio03;

public class Elevador 
{
	private int andarAtual=0; 
	private int totalAndares;
	private int capacidadeElevador;
	private int qtdPessoa;
	
	public void Inicializa(int capacidadeElevador, int totalAndares)
	{
		setcapacidadeElevador(capacidadeElevador);
		settotalAndares(totalAndares);
		setandarAtual(andarAtual);
		setqtdPessoa(qtdPessoa);	
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public int getQtdPessoa() {
		return qtdPessoa;
	}

	private void setqtdPessoa(int qtdPessoa) {
		// TODO Auto-generated method stub
		this.qtdPessoa=qtdPessoa;
	}

	private void setandarAtual(int andarAtual) {
		// TODO Auto-generated method stub
		this.andarAtual=andarAtual;
	}

	private void settotalAndares(int totalAndares) {
		// TODO Auto-generated method stub
		this.totalAndares=totalAndares;
	}

	private void setcapacidadeElevador(int capacidadeElevador) {
		// TODO Auto-generated method stub
		this.capacidadeElevador=capacidadeElevador;
	}
	
	public void Entra()
	{
		if(getQtdPessoa()<getCapacidadeElevador())
		{
			setqtdPessoa(this.qtdPessoa);
		}
		else 
		{
			System.out.println("o Elevador esta cheio\n");
		}
	}
	public void Sai()
	{
		if(getQtdPessoa()>0)
		{
			setqtdPessoa(this.qtdPessoa-1);
		}
		else 
		{
			System.out.println("o Elevador esta vazio\n");
		}
	}
	public void Sobe()
	{
		
		if(getAndarAtual() < getTotalAndares())
		{
			setandarAtual(this.andarAtual+1);
		} else
		{
			System.out.println("Não é possivel subir mais Andares\n");
			
		}
	}
	
	public void Desce()
	{
		
		if(getAndarAtual() > 0)
		{
			setandarAtual(this.andarAtual-1);
		} else
		{
			System.out.println("Não é possivel descer mais Andares\n");
			
		}
	}
	public void Imprime()
	{
		System.out.println("Quantidade de pessoas:" +getQtdPessoa()+"Andar Atual:"+getAndarAtual());
	}
	
	
	
}
	