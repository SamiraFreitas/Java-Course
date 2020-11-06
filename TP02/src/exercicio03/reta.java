package exercicio03;


public class reta 
{
	public Ponto2D a,b;   

	public reta(float ax,float ay,float bx,float by) 

	 {  

	   a=new Ponto2D(ax,ay); //chamadas dos contrutores da classe Ponto 

	   b=new Ponto2D(bx,by);

	 }              



	public void mostraCoeficiente()

	 {  a.mostraCoeficiente();  b.mostraCoeficiente(); } 
	
}

