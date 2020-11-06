package exercicio03;

public class Ponto2D 
{
	private double x;
	private double y; 
	
	public Ponto2D (double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	public double getX()
	{
		return x; 
	}
	public double getY()
	{
		return y;
	}
	public void mostraCoeficiente()

    {                                                          

      System.out.println("("+this.x+","+this.y+")");

    } 
	
}
